package typings.oracleOraclejet.ojtreemapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.GroupLabelDisplay
import typings.oracleOraclejet.anon.LabelDataVisualization
import typings.oracleOraclejet.anon.`26`
import typings.oracleOraclejet.anon.`27`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojtreemap.ojTreemapSettableProperties<K, D>> */
trait ojTreemapSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var animationUpdateColor: js.UndefOr[String] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var colorLabel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[DataProvider[K, D]] = js.undefined
  var displayLevels: js.UndefOr[Double] = js.undefined
  var drilling: js.UndefOr[on | off] = js.undefined
  var groupGaps: js.UndefOr[all | none | outer] = js.undefined
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  var hoverBehaviorDelay: js.UndefOr[Double] = js.undefined
  var isolatedNode: js.UndefOr[js.Any] = js.undefined
  var layout: js.UndefOr[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified] = js.undefined
  var nodeContent: js.UndefOr[`26`[K, D]] = js.undefined
  var nodeDefaults: js.UndefOr[GroupLabelDisplay] = js.undefined
  var nodeSeparators: js.UndefOr[bevels | gaps] = js.undefined
  var rootNode: js.UndefOr[js.Any] = js.undefined
  var selection: js.UndefOr[js.Array[_]] = js.undefined
  var selectionMode: js.UndefOr[none | single | multiple] = js.undefined
  var sizeLabel: js.UndefOr[String] = js.undefined
  var sorting: js.UndefOr[on | off] = js.undefined
  var tooltip: js.UndefOr[`27`[K, D]] = js.undefined
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[LabelDataVisualization] = js.undefined
}

object ojTreemapSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationOnDataChange: auto | none = null,
    animationOnDisplay: auto | none = null,
    animationUpdateColor: String = null,
    as: String = null,
    colorLabel: String = null,
    data: DataProvider[K, D] = null,
    displayLevels: js.UndefOr[Double] = js.undefined,
    drilling: on | off = null,
    groupGaps: all | none | outer = null,
    hiddenCategories: js.Array[String] = null,
    highlightMatch: any | all = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    hoverBehaviorDelay: js.UndefOr[Double] = js.undefined,
    isolatedNode: js.Any = null,
    layout: sliceAndDiceHorizontal | sliceAndDiceVertical | squarified = null,
    nodeContent: `26`[K, D] = null,
    nodeDefaults: GroupLabelDisplay = null,
    nodeSeparators: bevels | gaps = null,
    rootNode: js.Any = null,
    selection: js.Array[_] = null,
    selectionMode: none | single | multiple = null,
    sizeLabel: String = null,
    sorting: on | off = null,
    tooltip: `27`[K, D] = null,
    touchResponse: touchStart | auto = null,
    trackResize: on | off = null,
    translations: LabelDataVisualization = null
  ): ojTreemapSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (animationOnDataChange != null) __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (animationUpdateColor != null) __obj.updateDynamic("animationUpdateColor")(animationUpdateColor.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (colorLabel != null) __obj.updateDynamic("colorLabel")(colorLabel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLevels)) __obj.updateDynamic("displayLevels")(displayLevels.get.asInstanceOf[js.Any])
    if (drilling != null) __obj.updateDynamic("drilling")(drilling.asInstanceOf[js.Any])
    if (groupGaps != null) __obj.updateDynamic("groupGaps")(groupGaps.asInstanceOf[js.Any])
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (highlightMatch != null) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverBehaviorDelay)) __obj.updateDynamic("hoverBehaviorDelay")(hoverBehaviorDelay.get.asInstanceOf[js.Any])
    if (isolatedNode != null) __obj.updateDynamic("isolatedNode")(isolatedNode.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (nodeContent != null) __obj.updateDynamic("nodeContent")(nodeContent.asInstanceOf[js.Any])
    if (nodeDefaults != null) __obj.updateDynamic("nodeDefaults")(nodeDefaults.asInstanceOf[js.Any])
    if (nodeSeparators != null) __obj.updateDynamic("nodeSeparators")(nodeSeparators.asInstanceOf[js.Any])
    if (rootNode != null) __obj.updateDynamic("rootNode")(rootNode.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (sizeLabel != null) __obj.updateDynamic("sizeLabel")(sizeLabel.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (touchResponse != null) __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojTreemapSettablePropertiesLenient[K, D]]
  }
}

