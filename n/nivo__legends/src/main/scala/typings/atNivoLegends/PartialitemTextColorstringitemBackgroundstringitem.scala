package typings.atNivoLegends

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  itemTextColor  :string,   itemBackground  :string,   itemOpacity  :number,   symbolSize  :number,   symbolBorderWidth  :number,   symbolBorderColor  :string}> */
trait PartialitemTextColorstringitemBackgroundstringitem extends js.Object {
  var itemBackground: js.UndefOr[String] = js.undefined
  var itemOpacity: js.UndefOr[Double] = js.undefined
  var itemTextColor: js.UndefOr[String] = js.undefined
  var symbolBorderColor: js.UndefOr[String] = js.undefined
  var symbolBorderWidth: js.UndefOr[Double] = js.undefined
  var symbolSize: js.UndefOr[Double] = js.undefined
}

object PartialitemTextColorstringitemBackgroundstringitem {
  @scala.inline
  def apply(
    itemBackground: String = null,
    itemOpacity: Int | Double = null,
    itemTextColor: String = null,
    symbolBorderColor: String = null,
    symbolBorderWidth: Int | Double = null,
    symbolSize: Int | Double = null
  ): PartialitemTextColorstringitemBackgroundstringitem = {
    val __obj = js.Dynamic.literal()
    if (itemBackground != null) __obj.updateDynamic("itemBackground")(itemBackground.asInstanceOf[js.Any])
    if (itemOpacity != null) __obj.updateDynamic("itemOpacity")(itemOpacity.asInstanceOf[js.Any])
    if (itemTextColor != null) __obj.updateDynamic("itemTextColor")(itemTextColor.asInstanceOf[js.Any])
    if (symbolBorderColor != null) __obj.updateDynamic("symbolBorderColor")(symbolBorderColor.asInstanceOf[js.Any])
    if (symbolBorderWidth != null) __obj.updateDynamic("symbolBorderWidth")(symbolBorderWidth.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialitemTextColorstringitemBackgroundstringitem]
  }
}

