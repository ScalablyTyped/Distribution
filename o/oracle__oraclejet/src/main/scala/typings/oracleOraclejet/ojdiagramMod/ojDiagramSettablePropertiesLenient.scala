package typings.oracleOraclejet.ojdiagramMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AnimationDuration
import typings.oracleOraclejet.anon.Drop
import typings.oracleOraclejet.anon.Halign
import typings.oracleOraclejet.anon.InsertSVGElement
import typings.oracleOraclejet.anon.LabelClearSelection
import typings.oracleOraclejet.anon.`5`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typings.oracleOraclejet.ojkeysetMod.KeySet
import typings.oracleOraclejet.oracleOraclejetStrings.`lazy`
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.full
import typings.oracleOraclejet.oracleOraclejetStrings.link
import typings.oracleOraclejet.oracleOraclejetStrings.linkAndNodes
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.node
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndIncomingLinks
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndLinks
import typings.oracleOraclejet.oracleOraclejetStrings.nodeAndOutgoingLinks
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.x
import typings.oracleOraclejet.oracleOraclejetStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramSettableProperties<K1, K2, D1, D2>> */
@js.native
trait ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]
  extends /* key */ StringDictionary[js.Any] {
  var animationOnDataChange: js.UndefOr[auto | none] = js.native
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  var as: js.UndefOr[String] = js.native
  var dnd: js.UndefOr[Drop] = js.native
  var expanded: js.UndefOr[KeySet[K1]] = js.native
  var focusRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  var highlightMatch: js.UndefOr[any | all] = js.native
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  var hoverRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var layout: js.UndefOr[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]] = js.native
  var linkData: js.UndefOr[(DataProvider[K2, D2]) | Null] = js.native
  var linkHighlightMode: js.UndefOr[linkAndNodes | link] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var nodeData: js.UndefOr[(DataProvider[K1, D1]) | Null] = js.native
  var nodeHighlightMode: js.UndefOr[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node] = js.native
  var overview: js.UndefOr[Halign] = js.native
  var panDirection: js.UndefOr[x | y | auto] = js.native
  var panning: js.UndefOr[auto | none] = js.native
  var promotedLinkBehavior: js.UndefOr[none | full | `lazy`] = js.native
  var renderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]] = js.native
  var selection: js.UndefOr[js.Array[K1 | K2]] = js.native
  var selectionMode: js.UndefOr[single | multiple | none] = js.native
  var selectionRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var styleDefaults: js.UndefOr[AnimationDuration] = js.native
  var tooltip: js.UndefOr[`5`[K1, K2, D1, D2]] = js.native
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  var trackResize: js.UndefOr[on | off] = js.native
  var translations: js.UndefOr[LabelClearSelection] = js.native
  var zoomRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.native
  var zooming: js.UndefOr[auto | none] = js.native
}

object ojDiagramSettablePropertiesLenient {
  @scala.inline
  def apply[K1, K2, D1, D2](): ojDiagramSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]]
  }
  @scala.inline
  implicit class ojDiagramSettablePropertiesLenientOps[Self <: ojDiagramSettablePropertiesLenient[_, _, _, _], K1, K2, D1, D2] (val x: Self with (ojDiagramSettablePropertiesLenient[K1, K2, D1, D2])) extends AnyVal {
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
    def setAnimationOnDataChange(value: auto | none): Self = this.set("animationOnDataChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDataChange: Self = this.set("animationOnDataChange", js.undefined)
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setDnd(value: Drop): Self = this.set("dnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnd: Self = this.set("dnd", js.undefined)
    @scala.inline
    def setExpanded(value: KeySet[K1]): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setFocusRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = this.set("focusRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusRenderer: Self = this.set("focusRenderer", js.undefined)
    @scala.inline
    def setFocusRendererNull: Self = this.set("focusRenderer", null)
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
    def setHoverRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = this.set("hoverRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHoverRenderer: Self = this.set("hoverRenderer", js.undefined)
    @scala.inline
    def setHoverRendererNull: Self = this.set("hoverRenderer", null)
    @scala.inline
    def setLayout(value: /* param0 */ DvtDiagramLayoutContext => Unit): Self = this.set("layout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setLinkData(value: DataProvider[K2, D2]): Self = this.set("linkData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkData: Self = this.set("linkData", js.undefined)
    @scala.inline
    def setLinkDataNull: Self = this.set("linkData", null)
    @scala.inline
    def setLinkHighlightMode(value: linkAndNodes | link): Self = this.set("linkHighlightMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkHighlightMode: Self = this.set("linkHighlightMode", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setNodeData(value: DataProvider[K1, D1]): Self = this.set("nodeData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeData: Self = this.set("nodeData", js.undefined)
    @scala.inline
    def setNodeDataNull: Self = this.set("nodeData", null)
    @scala.inline
    def setNodeHighlightMode(value: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node): Self = this.set("nodeHighlightMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeHighlightMode: Self = this.set("nodeHighlightMode", js.undefined)
    @scala.inline
    def setOverview(value: Halign): Self = this.set("overview", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverview: Self = this.set("overview", js.undefined)
    @scala.inline
    def setPanDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = this.set("panDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanDirection: Self = this.set("panDirection", js.undefined)
    @scala.inline
    def setPanning(value: auto | none): Self = this.set("panning", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanning: Self = this.set("panning", js.undefined)
    @scala.inline
    def setPromotedLinkBehavior(value: none | full | `lazy`): Self = this.set("promotedLinkBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotedLinkBehavior: Self = this.set("promotedLinkBehavior", js.undefined)
    @scala.inline
    def setRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement): Self = this.set("renderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSelectionVarargs(value: (K1 | K2)*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[K1 | K2]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = this.set("selectionRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionRenderer: Self = this.set("selectionRenderer", js.undefined)
    @scala.inline
    def setSelectionRendererNull: Self = this.set("selectionRenderer", null)
    @scala.inline
    def setStyleDefaults(value: AnimationDuration): Self = this.set("styleDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleDefaults: Self = this.set("styleDefaults", js.undefined)
    @scala.inline
    def setTooltip(value: `5`[K1, K2, D1, D2]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
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
    def setTranslations(value: LabelClearSelection): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setZoomRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = this.set("zoomRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomRenderer: Self = this.set("zoomRenderer", js.undefined)
    @scala.inline
    def setZoomRendererNull: Self = this.set("zoomRenderer", null)
    @scala.inline
    def setZooming(value: auto | none): Self = this.set("zooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooming: Self = this.set("zooming", js.undefined)
  }
  
}

