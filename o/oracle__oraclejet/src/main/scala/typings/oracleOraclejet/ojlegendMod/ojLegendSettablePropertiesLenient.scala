package typings.oracleOraclejet.ojlegendMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonLabelAndValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.horizontal
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojlegend.ojLegendSettableProperties<K, D>> */
trait ojLegendSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var as: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var drilling: js.UndefOr[on | off] = js.undefined
  var expanded: js.UndefOr[KeySet[K]] = js.undefined
  var halign: js.UndefOr[center | end | start] = js.undefined
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hideAndShowBehavior: js.UndefOr[on | off] = js.undefined
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  var scrolling: js.UndefOr[off | asNeeded] = js.undefined
  var symbolHeight: js.UndefOr[Double] = js.undefined
  var symbolWidth: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[js.Object] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
  var valign: js.UndefOr[middle | bottom | top] = js.undefined
}

object ojLegendSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: String = null,
    data: DataProvider[K, D] = null,
    drilling: on | off = null,
    expanded: KeySet[K] = null,
    halign: center | end | start = null,
    hiddenCategories: js.Array[String] = null,
    hideAndShowBehavior: on | off = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    hoverBehaviorDelay: Int | Double = null,
    orientation: horizontal | vertical = null,
    scrolling: off | asNeeded = null,
    symbolHeight: Int | Double = null,
    symbolWidth: Int | Double = null,
    textStyle: js.Object = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null,
    valign: middle | bottom | top = null
  ): ojLegendSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (halign != null) __obj.updateDynamic("halign")(halign.asInstanceOf[js.Any])
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (hideAndShowBehavior != null) __obj.updateDynamic("hideAndShowBehavior")(hideAndShowBehavior.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (hoverBehaviorDelay != null) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (symbolHeight != null) __obj.updateDynamic("symbolHeight")(symbolHeight.asInstanceOf[js.Any])
    if (symbolWidth != null) __obj.updateDynamic("symbolWidth")(symbolWidth.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendSettablePropertiesLenient[K, D]]
  }
}

