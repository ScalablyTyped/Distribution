package typings
package atOracleOraclejetLib.ojlegendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojLegendSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var as: java.lang.String
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K] | scala.Null
  var halign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var hiddenCategories: js.Array[java.lang.String]
  var hideAndShowBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverBehaviorDelay: scala.Double
  var orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  var scrolling: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.asNeeded
  var symbolHeight: scala.Double
  var symbolWidth: scala.Double
  var textStyle: js.UndefOr[js.Object] = js.undefined
  @JSName("translations")
  var translations_ojLegendSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  var valign: atOracleOraclejetLib.atOracleOraclejetLibStrings.middle | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top
}

object ojLegendSettableProperties {
  @scala.inline
  def apply[K, D](
    as: java.lang.String,
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    halign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start,
    hiddenCategories: js.Array[java.lang.String],
    hideAndShowBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    hoverBehaviorDelay: scala.Double,
    orientation: atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical,
    scrolling: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.asNeeded,
    symbolHeight: scala.Double,
    symbolWidth: scala.Double,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    valign: atOracleOraclejetLib.atOracleOraclejetLibStrings.middle | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K] = null,
    textStyle: js.Object = null
  ): ojLegendSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(as = as, drilling = drilling.asInstanceOf[js.Any], halign = halign.asInstanceOf[js.Any], hiddenCategories = hiddenCategories, hideAndShowBehavior = hideAndShowBehavior.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay, orientation = orientation.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], symbolHeight = symbolHeight, symbolWidth = symbolWidth, trackResize = trackResize.asInstanceOf[js.Any], translations = translations, valign = valign.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[ojLegendSettableProperties[K, D]]
  }
}

