package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArrayArrayminus extends js.Object {
  var array: js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum]
  var arrayminus: js.UndefOr[js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum]] = js.undefined
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.data
}

object Anon_ArrayArrayminus {
  @scala.inline
  def apply(
    array: js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum],
    `type`: plotlyDotJsLib.plotlyDotJsLibStrings.data,
    arrayminus: js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum] = null
  ): Anon_ArrayArrayminus = {
    val __obj = js.Dynamic.literal(array = array)
    __obj.updateDynamic("type")(`type`)
    if (arrayminus != null) __obj.updateDynamic("arrayminus")(arrayminus)
    __obj.asInstanceOf[Anon_ArrayArrayminus]
  }
}

