package typings.nbayes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates a classifier, which can `learn` and then `classify` documents into classes.
    *
    * @example
    * import nbayes = require('nbayes');
    *
    * const c = nbayes();
    * c.learn('happy',   nbayes.stringToDoc('amazing, awesome movie!! Yeah!! Oh boy.'));
    * c.learn('happy',   nbayes.stringToDoc('Sweet, this is incredibly amazing, perfect, great!!'));
    * c.learn('angry',   nbayes.stringToDoc('terrible, shitty thing. Damn. This Sucks!!'));
    * c.learn('neutral', nbayes.stringToDoc('I dont really know what to make of this.'));
    *
    * c.classify(nbayes.stringToDoc('awesome, cool, amazing!! Yay.'));
    * // -> 'happy'
    * c.probabilities(nbayes.stringToDoc('awesome, cool, amazing!! Yay.'));
    * // -> { happy: 0.000001…,
    * //      angry: 2.384…e-7,
    * //      neutral: 1.665…e-7 }
    */
  inline def apply(): Classifier = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Classifier]
  
  @JSImport("nbayes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a representation of a document, which can be used to track words and their frequencies.
    *
    * @example
    * import nbayes = require('nbayes');
    *
    * const doc = nbayes.createDoc();
    * doc.set('foo', 2);
    * doc.add('bar');
    * doc.increase('bar', 2);
    *
    * doc.has('FOO'); // -> false
    * doc.get('foo'); // -> 2
    * doc.get('bar'); // -> 3
    * doc.sum(); // -> 5
    * doc.words(); // -> ['foo', 'bar']
    */
  inline def createDoc(): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("createDoc")().asInstanceOf[Document]
  
  /**
    * Returns a `Document` from the string. Special characters will be ignored. Everything will be lowercase.
    *
    * *Note: It is probably a better idea to use a proper tokenizer/stemmer and to
    * [remove stopwords](https://github.com/fergiemcdowall/stopword) to support non-Latin languages and to
    * get more accurate results.*
    *
    * @example
    * import nbayes = require('nbayes');
    *
    * nbayes.stringToDoc('awesome, amazing!! Yay.').words();
    * // -> ['awesome', 'amazing', 'yay']
    */
  inline def stringToDoc(str: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToDoc")(str.asInstanceOf[js.Any]).asInstanceOf[Document]
  
  trait Classifier extends StObject {
    
    /**
      * For `doc`, returns the class with the highest probability.
      */
    def classify(doc: Document): String
    
    /**
      * Tags words of `doc` as being of `docClass`.
      */
    def learn(docClass: String, doc: Document): this.type
    
    /**
      * Computes the probability of `doc`, given `class`.
      */
    def likelihood(docClass: String, doc: Document): Double
    
    /**
      * Computes the probability of `class` out of all classes.
      */
    def prior(docClass: String): Double
    
    /**
      * For each stored class, returns the probability of `doc`, given the class.
      */
    def probabilities(doc: Document): StringDictionary[Double]
  }
  object Classifier {
    
    inline def apply(
      classify: Document => String,
      learn: (String, Document) => Classifier,
      likelihood: (String, Document) => Double,
      prior: String => Double,
      probabilities: Document => StringDictionary[Double]
    ): Classifier = {
      val __obj = js.Dynamic.literal(classify = js.Any.fromFunction1(classify), learn = js.Any.fromFunction2(learn), likelihood = js.Any.fromFunction2(likelihood), prior = js.Any.fromFunction1(prior), probabilities = js.Any.fromFunction1(probabilities))
      __obj.asInstanceOf[Classifier]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Classifier] (val x: Self) extends AnyVal {
      
      inline def setClassify(value: Document => String): Self = StObject.set(x, "classify", js.Any.fromFunction1(value))
      
      inline def setLearn(value: (String, Document) => Classifier): Self = StObject.set(x, "learn", js.Any.fromFunction2(value))
      
      inline def setLikelihood(value: (String, Document) => Double): Self = StObject.set(x, "likelihood", js.Any.fromFunction2(value))
      
      inline def setPrior(value: String => Double): Self = StObject.set(x, "prior", js.Any.fromFunction1(value))
      
      inline def setProbabilities(value: Document => StringDictionary[Double]): Self = StObject.set(x, "probabilities", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Document extends StObject {
    
    /**
      * Shorthand for `increase(word, 1)`.
      */
    def add(word: String): this.type = js.native
    
    /**
      * Adds all `word` counts from another document.
      */
    def addBagOfWords(doc: Document): this.type = js.native
    
    /**
      * Adds `1` for every word from `words`.
      */
    def addWords(words: js.Iterable[String]): this.type = js.native
    
    /**
      * @return The count of `word`.
      */
    def get(word: String): Double = js.native
    
    /**
      * @return If `word` has been `add`ed before.
      */
    def has(word: String): Boolean = js.native
    
    /**
      * Adds `delta` to the count of `word`.
      */
    def increase(word: String): this.type = js.native
    def increase(word: String, /** @default 1 */
    delta: Double): this.type = js.native
    
    /**
      * Sets the `count` of `word`.
      */
    def set(word: String, count: Double): this.type = js.native
    
    /**
      * @return The sum of all `word` counts.
      */
    def sum(): Double = js.native
    
    /**
      * @return The *distinct* `word`s.
      */
    def words(): js.Array[String] = js.native
  }
}
