package typings.oracleOraclejet.ojtreemapMod

import typings.oracleOraclejet.AnonBottomCenter
import typings.oracleOraclejet.AnonComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal
import typings.oracleOraclejet.AnonContextRendererAnonInsertAnonPreventDefaultDK
import typings.oracleOraclejet.AnonContextRendererAnonInsertDK
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bevels
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.gaps
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.outer
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceHorizontal
import typings.oracleOraclejet.oracleOraclejetStrings.sliceAndDiceVertical
import typings.oracleOraclejet.oracleOraclejetStrings.squarified
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
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
  var nodeContent: AnonContextRendererAnonInsertDK[K, D]
  var nodeDefaults: AnonBottomCenter
  var nodeSeparators: bevels | gaps
  var rootNode: js.Any
  var selection: js.Array[_]
  var selectionMode: none | single | multiple
  var sizeLabel: String
  var sorting: on | off
  var tooltip: AnonContextRendererAnonInsertAnonPreventDefaultDK[K, D]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojTreemapSettableProperties: AnonComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal
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
    nodeContent: AnonContextRendererAnonInsertDK[K, D],
    nodeDefaults: AnonBottomCenter,
    nodeSeparators: bevels | gaps,
    rootNode: js.Any,
    selection: js.Array[_],
    selectionMode: none | single | multiple,
    sizeLabel: String,
    sorting: on | off,
    tooltip: AnonContextRendererAnonInsertAnonPreventDefaultDK[K, D],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonComponentNameLabelAndValueLabelClearSelectionLabelColorLabelCountWithTotal,
    data: DataProvider[K, D] = null
  ): ojTreemapSettableProperties[K, D] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], animationUpdateColor = animationUpdateColor.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], colorLabel = colorLabel.asInstanceOf[js.Any], displayLevels = displayLevels.asInstanceOf[js.Any], drilling = drilling.asInstanceOf[js.Any], groupGaps = groupGaps.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], isolatedNode = isolatedNode.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodeContent = nodeContent.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodeSeparators = nodeSeparators.asInstanceOf[js.Any], rootNode = rootNode.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], sizeLabel = sizeLabel.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTreemapSettableProperties[K, D]]
  }
}

