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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("gloss")(gloss)
    __obj.updateDynamic("lemma")(lemma)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("synonyms")(synonyms)
    __obj.updateDynamic("synsetOffset")(synsetOffset)
    __obj.asInstanceOf[WordNetLookupResults]
  }
}

