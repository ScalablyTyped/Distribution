package typings.mlClassifyText

import typings.mlClassifyText.anon.PartialModelOptions
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ml-classify-text", JSImport.Default)
  @js.native
  open class default () extends Classifier {
    def this(model: PartialModelOptions) = this()
    def this(model: Model) = this()
  }
  
  @JSImport("ml-classify-text", "Classifier")
  @js.native
  open class Classifier () extends StObject {
    def this(model: PartialModelOptions) = this()
    def this(model: Model) = this()
    
    def cosineSimilarity(v1: Record[Double, Double], v2: Record[Double, Double]): Double = js.native
    
    def model: Model = js.native
    def model_=(model: Model | PartialModelOptions): Unit = js.native
    
    def predict(input: String): js.Array[Prediction] = js.native
    def predict(input: String, maxMatches: Double): js.Array[Prediction] = js.native
    def predict(input: String, maxMatches: Double, minimumConfidence: Double): js.Array[Prediction] = js.native
    def predict(input: String, maxMatches: Unit, minimumConfidence: Double): js.Array[Prediction] = js.native
    
    def splitWords(input: String): js.Array[String] = js.native
    
    def tokenize(input: String): Record[String, Double] = js.native
    def tokenize(input: js.Array[String]): Record[String, Double] = js.native
    
    def train(input: String, label: String): this.type = js.native
    def train(input: js.Array[String], label: String): this.type = js.native
    
    def vectorize(tokens: Record[String, Double]): Record[Double, Double] = js.native
  }
  
  @JSImport("ml-classify-text", "Cocabulary")
  @js.native
  open class Cocabulary protected ()
    extends StObject
       with Vocabulary {
    def this(terms: js.Array[String]) = this()
  }
  
  @JSImport("ml-classify-text", "Model")
  @js.native
  open class Model () extends StObject {
    def this(config: PartialModelOptions) = this()
    
    def data: Record[String, Record[String, Double]] = js.native
    def data_=(data: Record[String, Record[String, Double]]): Unit = js.native
    
    def nGramMax: Double = js.native
    def nGramMax_=(nGramMax: Double): Unit = js.native
    
    def nGramMin: Double = js.native
    def nGramMin_=(nGramMin: Double): Unit = js.native
    
    def serialize(): ModelOptions = js.native
    
    def vocabulary: Vocabulary = js.native
    def vocabulary_=(vocabulary: Vocabulary | js.Array[String]): Unit = js.native
  }
  
  trait ModelOptions extends StObject {
    
    var nGramMax: Double
    
    var nGramMin: Double
    
    var vocabulary: js.Array[String]
  }
  object ModelOptions {
    
    inline def apply(nGramMax: Double, nGramMin: Double, vocabulary: js.Array[String]): ModelOptions = {
      val __obj = js.Dynamic.literal(nGramMax = nGramMax.asInstanceOf[js.Any], nGramMin = nGramMin.asInstanceOf[js.Any], vocabulary = vocabulary.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModelOptions] (val x: Self) extends AnyVal {
      
      inline def setNGramMax(value: Double): Self = StObject.set(x, "nGramMax", value.asInstanceOf[js.Any])
      
      inline def setNGramMin(value: Double): Self = StObject.set(x, "nGramMin", value.asInstanceOf[js.Any])
      
      inline def setVocabulary(value: js.Array[String]): Self = StObject.set(x, "vocabulary", value.asInstanceOf[js.Any])
      
      inline def setVocabularyVarargs(value: String*): Self = StObject.set(x, "vocabulary", js.Array(value*))
    }
  }
  
  @js.native
  trait Prediction extends StObject {
    
    def confidence: Double = js.native
    def confidence_=(confidence: Double): Unit = js.native
    
    def label: String = js.native
    def label_=(label: String): Unit = js.native
  }
  
  trait PredictionOptions extends StObject {
    
    var confidence: Double
    
    var label: String
  }
  object PredictionOptions {
    
    inline def apply(confidence: Double, label: String): PredictionOptions = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[PredictionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PredictionOptions] (val x: Self) extends AnyVal {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Vocabulary extends StObject {
    
    def add(terms: String): this.type = js.native
    def add(terms: js.Array[String]): this.type = js.native
    def add(terms: Set[String]): this.type = js.native
    
    def has(term: String): Boolean = js.native
    
    def indexOf(term: String): Double = js.native
    
    def remove(terms: String): this.type = js.native
    def remove(terms: js.Array[String]): this.type = js.native
    def remove(terms: Set[String]): this.type = js.native
    
    def size: Double = js.native
    
    def terms: Set[String] = js.native
    def terms_=(terms: Set[String] | js.Array[String]): Unit = js.native
  }
}
