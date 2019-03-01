package typings
package atOracleOraclejetLib.ojpictochartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojPictoChartSettableProperties[K, D]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.popIn | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var as: java.lang.String
  var columnCount: scala.Double | scala.Null
  var columnWidth: scala.Double | scala.Null
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverBehaviorDelay: scala.Double
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal
  var layoutOrigin: atOracleOraclejetLib.atOracleOraclejetLibStrings.topEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottomStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottomEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.topStart
  var rowCount: scala.Double | scala.Null
  var rowHeight: scala.Double | scala.Null
  var selection: js.Array[K]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K]
  @JSName("translations")
  var translations_ojPictoChartSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
}

object ojPictoChartSettableProperties {
  @scala.inline
  def apply[K, D](
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.popIn | atOracleOraclejetLib.atOracleOraclejetLibStrings.alphaFade | atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    as: java.lang.String,
    drilling: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    hiddenCategories: js.Array[java.lang.String],
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    hoverBehaviorDelay: scala.Double,
    layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal,
    layoutOrigin: atOracleOraclejetLib.atOracleOraclejetLibStrings.topEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottomStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottomEnd | atOracleOraclejetLib.atOracleOraclejetLibStrings.topStart,
    selection: js.Array[K],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultKNull[K],
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    animationDuration: scala.Int | scala.Double = null,
    columnCount: scala.Int | scala.Double = null,
    columnWidth: scala.Int | scala.Double = null,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null,
    rowCount: scala.Int | scala.Double = null,
    rowHeight: scala.Int | scala.Double = null
  ): ojPictoChartSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    __obj.updateDynamic("hiddenCategories")(hiddenCategories)
    __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("highlightedCategories")(highlightedCategories)
    __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay)
    __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.updateDynamic("layoutOrigin")(layoutOrigin.asInstanceOf[js.Any])
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojPictoChartSettableProperties[K, D]]
  }
}

