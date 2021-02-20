package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordNetLookupResults extends StObject {
  
  var gloss: String = js.native
  
  var lemma: String = js.native
  
  var pos: String = js.native
  
  var synonyms: js.Array[String] = js.native
  
  var synsetOffset: Double = js.native
}
object WordNetLookupResults {
  
  @scala.inline
  def apply(gloss: String, lemma: String, pos: String, synonyms: js.Array[String], synsetOffset: Double): WordNetLookupResults = {
    val __obj = js.Dynamic.literal(gloss = gloss.asInstanceOf[js.Any], lemma = lemma.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], synonyms = synonyms.asInstanceOf[js.Any], synsetOffset = synsetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[WordNetLookupResults]
  }
  
  @scala.inline
  implicit class WordNetLookupResultsMutableBuilder[Self <: WordNetLookupResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGloss(value: String): Self = StObject.set(x, "gloss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = StObject.set(x, "synonyms", js.Array(value :_*))
    
    @scala.inline
    def setSynsetOffset(value: Double): Self = StObject.set(x, "synsetOffset", value.asInstanceOf[js.Any])
  }
}
