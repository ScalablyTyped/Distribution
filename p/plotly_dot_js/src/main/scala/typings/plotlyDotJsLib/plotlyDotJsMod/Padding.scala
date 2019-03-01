package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Padding extends js.Object {
  /**
  	 * The amount of padding (in px) along the bottom of the component.
  	 */
  var b: scala.Double
  var editType: plotlyDotJsLib.plotlyDotJsLibStrings.arraydraw
  /**
  	 * The amount of padding (in px) on the left side of the component.
  	 */
  var l: scala.Double
  /**
  	 * The amount of padding (in px) on the right side of the component.
  	 */
  var r: scala.Double
  /**
  	 * The amount of padding (in px) along the top of the component.
  	 */
  var t: scala.Double
}

object Padding {
  @scala.inline
  def apply(
    b: scala.Double,
    editType: plotlyDotJsLib.plotlyDotJsLibStrings.arraydraw,
    l: scala.Double,
    r: scala.Double,
    t: scala.Double
  ): Padding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("editType")(editType)
    __obj.updateDynamic("l")(l)
    __obj.updateDynamic("r")(r)
    __obj.updateDynamic("t")(t)
    __obj.asInstanceOf[Padding]
  }
}

