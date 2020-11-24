package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordNetLookupResults extends js.Object {
  
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
  implicit class WordNetLookupResultsOps[Self <: WordNetLookupResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGloss(value: String): Self = this.set("gloss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLemma(value: String): Self = this.set("lemma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsVarargs(value: String*): Self = this.set("synonyms", js.Array(value :_*))
    
    @scala.inline
    def setSynonyms(value: js.Array[String]): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynsetOffset(value: Double): Self = this.set("synsetOffset", value.asInstanceOf[js.Any])
  }
}
