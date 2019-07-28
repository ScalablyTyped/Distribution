package typings.atOracleOraclejet.ojtreemapMod

import typings.atOracleOraclejet.Anon_BottomCenter
import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultDK
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertDK
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bevels
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.gaps
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.outer
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.sliceAndDiceHorizontal
import typings.atOracleOraclejet.atOracleOraclejetStrings.sliceAndDiceVertical
import typings.atOracleOraclejet.atOracleOraclejetStrings.squarified
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTreemapSettableProperties[K, D] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var animationUpdateColor: String
  var as: String
  var colorLabel: String
  var data: (DataProvider[K, D]) | Null
  var displayLevels: Double
  var drilling: on | off
  var groupGaps: all | none | outer
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverBehaviorDelay: Double
  var isolatedNode: js.Any
  var layout: sliceAndDiceHorizontal | sliceAndDiceVertical | squarified
  var nodeContent: Anon_ContextRendererAnonInsertDK[K, D]
  var nodeDefaults: Anon_BottomCenter
  var nodeSeparators: bevels | gaps
  var rootNode: js.Any
  var selection: js.Array[_]
  var selectionMode: none | single | multiple
  var sizeLabel: String
  var sorting: on | off
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojTreemapSettableProperties: Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal
}

object ojTreemapSettableProperties {
  @scala.inline
  def apply[K, D](
    animationDuration: Double,
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    animationUpdateColor: String,
    as: String,
    colorLabel: String,
    displayLevels: Double,
    drilling: on | off,
    groupGaps: all | none | outer,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    hoverBehaviorDelay: Double,
    isolatedNode: js.Any,
    layout: sliceAndDiceHorizontal | sliceAndDiceVertical | squarified,
    nodeContent: Anon_ContextRendererAnonInsertDK[K, D],
    nodeDefaults: Anon_BottomCenter,
    nodeSeparators: bevels | gaps,
    rootNode: js.Any,
    selection: js.Array[_],
    selectionMode: none | single | multiple,
    sizeLabel: String,
    sorting: on | off,
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultDK[K, D],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal,
    data: DataProvider[K, D] = null
  ): ojTreemapSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration, animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor, as = as, colorLabel = colorLabel, displayLevels = displayLevels, drilling = drilling.asInstanceOf[js.Any], groupGaps = groupGaps.asInstanceOf[js.Any], hiddenCategories = hiddenCategories, highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay, isolatedNode = isolatedNode, layout = layout.asInstanceOf[js.Any], nodeContent = nodeContent, nodeDefaults = nodeDefaults, nodeSeparators = nodeSeparators.asInstanceOf[js.Any], rootNode = rootNode, selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel, sorting = sorting.asInstanceOf[js.Any], tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[ojTreemapSettableProperties[K, D]]
  }
}

