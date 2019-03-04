package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordNetLookupResults extends js.Object {
  var gloss: java.lang.String
  var lemma: java.lang.String
  var pos: java.lang.String
  var synonyms: js.Array[java.lang.String]
  var synsetOffset: scala.Double
}

object WordNetLookupResults {
  @scala.inline
  def apply(
    gloss: java.lang.String,
    lemma: java.lang.String,
    pos: java.lang.String,
    synonyms: js.Array[java.lang.String],
    synsetOffset: scala.Double
  ): WordNetLookupResults = {
    val __obj = js.Dynamic.literal(gloss = gloss, lemma = lemma, pos = pos, synonyms = synonyms, synsetOffset = synsetOffset)
  
    __obj.asInstanceOf[WordNetLookupResults]
  }
}

