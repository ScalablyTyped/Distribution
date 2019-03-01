package typings
package plotlyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Constant extends js.Object {
  var `type`: plotlyDotJsLib.plotlyDotJsLibStrings.constant | plotlyDotJsLib.plotlyDotJsLibStrings.percent
  var value: scala.Double
  var valueminus: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Constant {
  @scala.inline
  def apply(
    `type`: plotlyDotJsLib.plotlyDotJsLibStrings.constant | plotlyDotJsLib.plotlyDotJsLibStrings.percent,
    value: scala.Double,
    valueminus: scala.Int | scala.Double = null
  ): Anon_Constant = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    if (valueminus != null) __obj.updateDynamic("valueminus")(valueminus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Constant]
  }
}

