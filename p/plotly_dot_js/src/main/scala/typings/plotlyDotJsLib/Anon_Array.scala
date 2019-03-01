package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var array: js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum]
  var arrayminus: js.UndefOr[js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum]] = js.undefined
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.data
}

object Anon_Array {
  @scala.inline
  def apply(
    array: js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum],
    `type`: plotlyDotJsLib.plotlyDotJsLibStrings.data,
    arrayminus: js.Array[plotlyDotJsLib.plotlyDotJsMod.Datum] = null
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("array")(array)
    if (arrayminus != null) __obj.updateDynamic("arrayminus")(arrayminus)
    __obj.asInstanceOf[Anon_Array]
  }
}

