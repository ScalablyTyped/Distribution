package typings
package atOracleOraclejetLib.ojsunburstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojSunburstSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationDuration: scala.Double
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationUpdateColor: java.lang.String
  var as: java.lang.String
  var colorLabel: java.lang.String
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var displayLevels: scala.Double
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K]
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverBehaviorDelay: scala.Double
  var nodeDefaults: atOracleOraclejetLib.Anon_AutoBorderColorBorderWidth
  var rootNode: js.Any
  var rootNodeContent: atOracleOraclejetLib.Anon_ContextRendererAnonInsertD[K, D]
  var rotation: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on
  var selection: js.Array[_]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  var sizeLabel: java.lang.String
  var sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var startAngle: scala.Double
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D]
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojSunburstSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColor
}

object ojSunburstSettableProperties {
  @scala.inline
  def apply[K, D](
    animationDuration: scala.Double,
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationUpdateColor: java.lang.String,
    as: java.lang.String,
    colorLabel: java.lang.String,
    displayLevels: scala.Double,
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K],
    hiddenCategories: js.Array[java.lang.String],
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    hoverBehaviorDelay: scala.Double,
    nodeDefaults: atOracleOraclejetLib.Anon_AutoBorderColorBorderWidth,
    rootNode: js.Any,
    rootNodeContent: atOracleOraclejetLib.Anon_ContextRendererAnonInsertD[K, D],
    rotation: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.on,
    selection: js.Array[_],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple,
    sizeLabel: java.lang.String,
    sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    startAngle: scala.Double,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD[K, D],
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColor,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ojSunburstSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationDuration")(animationDuration)
    __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("animationUpdateColor")(animationUpdateColor)
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("colorLabel")(colorLabel)
    __obj.updateDynamic("displayLevels")(displayLevels)
    __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("hiddenCategories")(hiddenCategories)
    __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("highlightedCategories")(highlightedCategories)
    __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay)
    __obj.updateDynamic("nodeDefaults")(nodeDefaults)
    __obj.updateDynamic("rootNode")(rootNode)
    __obj.updateDynamic("rootNodeContent")(rootNodeContent)
    __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("sizeLabel")(sizeLabel)
    __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojSunburstSettableProperties[K, D]]
  }
}

