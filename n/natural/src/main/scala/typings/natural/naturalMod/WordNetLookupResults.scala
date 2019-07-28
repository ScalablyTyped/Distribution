package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordNetLookupResults extends js.Object {
  var gloss: String
  var lemma: String
  var pos: String
  var synonyms: js.Array[String]
  var synsetOffset: Double
}

object WordNetLookupResults {
  @scala.inline
  def apply(gloss: String, lemma: String, pos: String, synonyms: js.Array[String], synsetOffset: Double): WordNetLookupResults = {
    val __obj = js.Dynamic.literal(gloss = gloss, lemma = lemma, pos = pos, synonyms = synonyms, synsetOffset = synsetOffset)
  
    __obj.asInstanceOf[WordNetLookupResults]
  }
}

