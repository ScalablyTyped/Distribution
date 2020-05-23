package typings.nivoLegends.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  itemTextColor  :string,   itemBackground  :string,   itemOpacity  :number,   symbolSize  :number,   symbolBorderWidth  :number,   symbolBorderColor  :string}> */
trait PartialitemTextColorstrin extends js.Object {
  var itemBackground: js.UndefOr[String] = js.undefined
  var itemOpacity: js.UndefOr[Double] = js.undefined
  var itemTextColor: js.UndefOr[String] = js.undefined
  var symbolBorderColor: js.UndefOr[String] = js.undefined
  var symbolBorderWidth: js.UndefOr[Double] = js.undefined
  var symbolSize: js.UndefOr[Double] = js.undefined
}

object PartialitemTextColorstrin {
  @scala.inline
  def apply(
    itemBackground: String = null,
    itemOpacity: js.UndefOr[Double] = js.undefined,
    itemTextColor: String = null,
    symbolBorderColor: String = null,
    symbolBorderWidth: js.UndefOr[Double] = js.undefined,
    symbolSize: js.UndefOr[Double] = js.undefined
  ): PartialitemTextColorstrin = {
    val __obj = js.Dynamic.literal()
    if (itemBackground != null) __obj.updateDynamic("itemBackground")(itemBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(itemOpacity)) __obj.updateDynamic("itemOpacity")(itemOpacity.get.asInstanceOf[js.Any])
    if (itemTextColor != null) __obj.updateDynamic("itemTextColor")(itemTextColor.asInstanceOf[js.Any])
    if (symbolBorderColor != null) __obj.updateDynamic("symbolBorderColor")(symbolBorderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolBorderWidth)) __obj.updateDynamic("symbolBorderWidth")(symbolBorderWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolSize)) __obj.updateDynamic("symbolSize")(symbolSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialitemTextColorstrin]
  }
}

