package typings.oracleOraclejet.ojlegendMod

import typings.oracleOraclejet.AnonLabelAndValue
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

trait ojLegendSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var as: String
  var data: (DataProvider[K, D]) | Null
  var drilling: on | off
  var expanded: KeySet[K] | Null
  var halign: center | end | start
  var hiddenCategories: js.Array[String]
  var hideAndShowBehavior: on | off
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverBehaviorDelay: Double
  var orientation: horizontal | vertical
  var scrolling: off | asNeeded
  var symbolHeight: Double
  var symbolWidth: Double
  var textStyle: js.UndefOr[js.Object] = js.undefined
  @JSName("translations")
  var translations_ojLegendSettableProperties: AnonLabelAndValue
  var valign: middle | bottom | top
}

object ojLegendSettableProperties {
  @scala.inline
  def apply[K, D](
    as: String,
    drilling: on | off,
    halign: center | end | start,
    hiddenCategories: js.Array[String],
    hideAndShowBehavior: on | off,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    orientation: horizontal | vertical,
    scrolling: off | asNeeded,
    symbolHeight: Double,
    symbolWidth: Double,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    valign: middle | bottom | top,
    data: DataProvider[K, D] = null,
    expanded: KeySet[K] = null,
    textStyle: js.Object = null
  ): ojLegendSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expanded != null) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojLegendSettableProperties[K, D]]
  }
}

