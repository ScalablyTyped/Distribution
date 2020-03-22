package typings.plotlyJs

import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Delta> */
trait PartialDelta extends js.Object {
  var decreasing: js.UndefOr[AnonSymbol] = js.undefined
  var increasing: js.UndefOr[AnonSymbol] = js.undefined
  var position: js.UndefOr[top | bottom | left | right] = js.undefined
  var reference: js.UndefOr[Double] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var valueformat: js.UndefOr[String] = js.undefined
}

object PartialDelta {
  @scala.inline
  def apply(
    decreasing: AnonSymbol = null,
    increasing: AnonSymbol = null,
    position: top | bottom | left | right = null,
    reference: Int | Double = null,
    relative: js.UndefOr[Boolean] = js.undefined,
    valueformat: String = null
  ): PartialDelta = {
    val __obj = js.Dynamic.literal()
    if (decreasing != null) __obj.updateDynamic("decreasing")(decreasing.asInstanceOf[js.Any])
    if (increasing != null) __obj.updateDynamic("increasing")(increasing.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (valueformat != null) __obj.updateDynamic("valueformat")(valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDelta]
  }
}

