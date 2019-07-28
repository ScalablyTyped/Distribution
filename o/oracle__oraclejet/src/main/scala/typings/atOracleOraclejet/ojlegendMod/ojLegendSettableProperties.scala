package typings.atOracleOraclejet.ojlegendMod

import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.atOracleOraclejetStrings.asNeeded
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.horizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.middle
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import typings.atOracleOraclejet.atOracleOraclejetStrings.vertical
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typings.atOracleOraclejet.ojkeysetMod.KeySet
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
  var translations_ojLegendSettableProperties: Anon_ComponentNameLabelAndValue
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
    translations: Anon_ComponentNameLabelAndValue,
    valign: middle | bottom | top,
    data: DataProvider[K, D] = null,
    expanded: KeySet[K] = null,
    textStyle: js.Object = null
  ): ojLegendSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as, drilling = drilling.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], hiddenCategories = hiddenCategories, hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay, orientation = orientation.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], symbolHeight = symbolHeight, symbolWidth = symbolWidth, trackResize = trackResize.asInstanceOf[js.Any], translations = translations, valign = valign.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ojLegendSettableProperties[K, D]]
  }
}

