package typings.oracleOraclejet.ojtreemapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.GroupLabelDisplay
import typings.oracleOraclejet.anon.LabelDataVisualization
import typings.oracleOraclejet.anon.`28`
import typings.oracleOraclejet.anon.`29`
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
@js.native
trait ojTreemapSettablePropertiesLenient[K, D]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.native
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var animationUpdateColor: js.UndefOr[String] = js.native
  var as: js.UndefOr[String] = js.native
  var colorLabel: js.UndefOr[String] = js.native
  var data: js.UndefOr[(DataProvider[K, D]) | Null] = js.native
  var displayLevels: js.UndefOr[Double] = js.native
  var drilling: js.UndefOr[on | off] = js.native
  var groupGaps: js.UndefOr[all | none | outer] = js.native
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  var highlightMatch: js.UndefOr[any | all] = js.native
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  var hoverBehaviorDelay: js.UndefOr[Double] = js.native
  var isolatedNode: js.UndefOr[js.Any] = js.native
  var layout: js.UndefOr[sliceAndDiceHorizontal | sliceAndDiceVertical | squarified] = js.native
  var nodeContent: js.UndefOr[`28`[K, D]] = js.native
  var nodeDefaults: js.UndefOr[GroupLabelDisplay] = js.native
  var nodeSeparators: js.UndefOr[bevels | gaps] = js.native
  var rootNode: js.UndefOr[js.Any] = js.native
  var selection: js.UndefOr[js.Array[_]] = js.native
  var selectionMode: js.UndefOr[none | single | multiple] = js.native
  var sizeLabel: js.UndefOr[String] = js.native
  var sorting: js.UndefOr[on | off] = js.native
  var tooltip: js.UndefOr[`29`[K, D]] = js.native
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelDataVisualization] = js.native
}

object ojTreemapSettablePropertiesLenient {
  @scala.inline
  def apply[K, D](): ojTreemapSettablePropertiesLenient[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojTreemapSettablePropertiesLenient[K, D]]
  }
  @scala.inline
  implicit class ojTreemapSettablePropertiesLenientOps[Self <: ojTreemapSettablePropertiesLenient[_, _], K, D] (val x: Self with (ojTreemapSettablePropertiesLenient[K, D])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDataChange: Self = this.set("animationOnDataChange", js.undefined)
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    @scala.inline
    def setAnimationUpdateColor(value: String): Self = this.set("animationUpdateColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationUpdateColor: Self = this.set("animationUpdateColor", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setColorLabel(value: String): Self = this.set("colorLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorLabel: Self = this.set("colorLabel", js.undefined)
    @scala.inline
    def setData(value: DataProvider[K, D]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setDisplayLevels(value: Double): Self = this.set("displayLevels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayLevels: Self = this.set("displayLevels", js.undefined)
    @scala.inline
    def setDrilling(value: on | off): Self = this.set("drilling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrilling: Self = this.set("drilling", js.undefined)
    @scala.inline
    def setGroupGaps(value: all | none | outer): Self = this.set("groupGaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupGaps: Self = this.set("groupGaps", js.undefined)
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = this.set("hiddenCategories", js.Array(value :_*))
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = this.set("hiddenCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenCategories: Self = this.set("hiddenCategories", js.undefined)
    @scala.inline
    def setHighlightMatch(value: any | all): Self = this.set("highlightMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightMatch: Self = this.set("highlightMatch", js.undefined)
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = this.set("highlightedCategories", js.Array(value :_*))
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = this.set("highlightedCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedCategories: Self = this.set("highlightedCategories", js.undefined)
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = this.set("hoverBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBehavior: Self = this.set("hoverBehavior", js.undefined)
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = this.set("hoverBehaviorDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBehaviorDelay: Self = this.set("hoverBehaviorDelay", js.undefined)
    @scala.inline
    def setIsolatedNode(value: js.Any): Self = this.set("isolatedNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolatedNode: Self = this.set("isolatedNode", js.undefined)
    @scala.inline
    def setLayout(value: sliceAndDiceHorizontal | sliceAndDiceVertical | squarified): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setNodeContent(value: `28`[K, D]): Self = this.set("nodeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeContent: Self = this.set("nodeContent", js.undefined)
    @scala.inline
    def setNodeDefaults(value: GroupLabelDisplay): Self = this.set("nodeDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeDefaults: Self = this.set("nodeDefaults", js.undefined)
    @scala.inline
    def setNodeSeparators(value: bevels | gaps): Self = this.set("nodeSeparators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeSeparators: Self = this.set("nodeSeparators", js.undefined)
    @scala.inline
    def setRootNode(value: js.Any): Self = this.set("rootNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootNode: Self = this.set("rootNode", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: js.Any*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[_]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: none | single | multiple): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSizeLabel(value: String): Self = this.set("sizeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeLabel: Self = this.set("sizeLabel", js.undefined)
    @scala.inline
    def setSorting(value: on | off): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    @scala.inline
    def setTooltip(value: `29`[K, D]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = this.set("touchResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchResponse: Self = this.set("touchResponse", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTranslations(value: LabelDataVisualization): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
  
}

