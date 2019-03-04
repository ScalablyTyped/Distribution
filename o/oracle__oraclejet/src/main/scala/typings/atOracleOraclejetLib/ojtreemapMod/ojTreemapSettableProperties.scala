package typings
package atOracleOraclejetLib.ojtreemapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTreemapSettableProperties[K, D]
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
  var groupGaps: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.outer
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverBehaviorDelay: scala.Double
  var isolatedNode: js.Any
  var layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.sliceAndDiceHorizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliceAndDiceVertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.squarified
  var nodeContent: atOracleOraclejetLib.Anon_ContextRendererAnonInsertDK[K, D]
  var nodeDefaults: atOracleOraclejetLib.Anon_BottomCenter
  var nodeSeparators: atOracleOraclejetLib.atOracleOraclejetLibStrings.bevels | atOracleOraclejetLib.atOracleOraclejetLibStrings.gaps
  var rootNode: js.Any
  var selection: js.Array[_]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  var sizeLabel: java.lang.String
  var sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D]
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojTreemapSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal
}

object ojTreemapSettableProperties {
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
    groupGaps: atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.outer,
    hiddenCategories: js.Array[java.lang.String],
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    hoverBehaviorDelay: scala.Double,
    isolatedNode: js.Any,
    layout: atOracleOraclejetLib.atOracleOraclejetLibStrings.sliceAndDiceHorizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.sliceAndDiceVertical | atOracleOraclejetLib.atOracleOraclejetLibStrings.squarified,
    nodeContent: atOracleOraclejetLib.Anon_ContextRendererAnonInsertDK[K, D],
    nodeDefaults: atOracleOraclejetLib.Anon_BottomCenter,
    nodeSeparators: atOracleOraclejetLib.atOracleOraclejetLibStrings.bevels | atOracleOraclejetLib.atOracleOraclejetLibStrings.gaps,
    rootNode: js.Any,
    selection: js.Array[_],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple,
    sizeLabel: java.lang.String,
    sorting: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D],
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal,
    data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D] = null
  ): ojTreemapSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration, animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor, as = as, colorLabel = colorLabel, displayLevels = displayLevels, drilling = drilling.asInstanceOf[js.Any], groupGaps = groupGaps.asInstanceOf[js.Any], hiddenCategories = hiddenCategories, highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay, isolatedNode = isolatedNode, layout = layout.asInstanceOf[js.Any], nodeContent = nodeContent, nodeDefaults = nodeDefaults, nodeSeparators = nodeSeparators.asInstanceOf[js.Any], rootNode = rootNode, selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel, sorting = sorting.asInstanceOf[js.Any], tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojTreemapSettableProperties[K, D]]
  }
}

