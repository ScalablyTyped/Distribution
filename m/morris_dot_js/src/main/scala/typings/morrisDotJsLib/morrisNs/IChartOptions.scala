package typings
package morrisDotJsLib.morrisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChartOptions extends js.Object {
  /** The ID of (or a reference to) the element into which to insert the graph. */
  var element: js.Any
  /** Set to true to enable automatic resizing when the containing element resizes. (default: false). */
  var resize: js.UndefOr[scala.Boolean] = js.undefined
}

object IChartOptions {
  @scala.inline
  def apply(element: js.Any, resize: js.UndefOr[scala.Boolean] = js.undefined): IChartOptions = {
    val __obj = js.Dynamic.literal(element = element)
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize)
    __obj.asInstanceOf[IChartOptions]
  }
}

