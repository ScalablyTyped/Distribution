package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.Delta> */
trait PartialDelta extends js.Object {
  var decreasing: js.UndefOr[Symbol] = js.undefined
  var increasing: js.UndefOr[Symbol] = js.undefined
  var position: js.UndefOr[top | bottom | left | right] = js.undefined
  var reference: js.UndefOr[Double] = js.undefined
  var relative: js.UndefOr[Boolean] = js.undefined
  var valueformat: js.UndefOr[String] = js.undefined
}

object PartialDelta {
  @scala.inline
  def apply(
    decreasing: Symbol = null,
    increasing: Symbol = null,
    position: top | bottom | left | right = null,
    reference: js.UndefOr[Double] = js.undefined,
    relative: js.UndefOr[Boolean] = js.undefined,
    valueformat: String = null
  ): PartialDelta = {
    val __obj = js.Dynamic.literal()
    if (decreasing != null) __obj.updateDynamic("decreasing")(decreasing.asInstanceOf[js.Any])
    if (increasing != null) __obj.updateDynamic("increasing")(increasing.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(reference)) __obj.updateDynamic("reference")(reference.get.asInstanceOf[js.Any])
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative.get.asInstanceOf[js.Any])
    if (valueformat != null) __obj.updateDynamic("valueformat")(valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDelta]
  }
}

