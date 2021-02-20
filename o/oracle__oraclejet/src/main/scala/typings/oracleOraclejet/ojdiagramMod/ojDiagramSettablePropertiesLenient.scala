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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ojDiagramSettablePropertiesLenientMutableBuilder[Self <: ojDiagramSettablePropertiesLenient[_, _, _, _], K1, K2, D1, D2] (val x: Self with (ojDiagramSettablePropertiesLenient[K1, K2, D1, D2])) extends AnyVal {
    
    @scala.inline
    def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setDnd(value: Drop): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    @scala.inline
    def setExpanded(value: KeySet[K1]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setFocusRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "focusRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusRendererNull: Self = StObject.set(x, "focusRenderer", null)
    
    @scala.inline
    def setFocusRendererUndefined: Self = StObject.set(x, "focusRenderer", js.undefined)
    
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesUndefined: Self = StObject.set(x, "hiddenCategories", js.undefined)
    
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    @scala.inline
    def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
    
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesUndefined: Self = StObject.set(x, "highlightedCategories", js.undefined)
    
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorUndefined: Self = StObject.set(x, "hoverBehavior", js.undefined)
    
    @scala.inline
    def setHoverRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "hoverRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverRendererNull: Self = StObject.set(x, "hoverRenderer", null)
    
    @scala.inline
    def setHoverRendererUndefined: Self = StObject.set(x, "hoverRenderer", js.undefined)
    
    @scala.inline
    def setLayout(value: /* param0 */ DvtDiagramLayoutContext => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLinkData(value: DataProvider[K2, D2]): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkDataNull: Self = StObject.set(x, "linkData", null)
    
    @scala.inline
    def setLinkDataUndefined: Self = StObject.set(x, "linkData", js.undefined)
    
    @scala.inline
    def setLinkHighlightMode(value: linkAndNodes | link): Self = StObject.set(x, "linkHighlightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkHighlightModeUndefined: Self = StObject.set(x, "linkHighlightMode", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setNodeData(value: DataProvider[K1, D1]): Self = StObject.set(x, "nodeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDataNull: Self = StObject.set(x, "nodeData", null)
    
    @scala.inline
    def setNodeDataUndefined: Self = StObject.set(x, "nodeData", js.undefined)
    
    @scala.inline
    def setNodeHighlightMode(value: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node): Self = StObject.set(x, "nodeHighlightMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeHighlightModeUndefined: Self = StObject.set(x, "nodeHighlightMode", js.undefined)
    
    @scala.inline
    def setOverview(value: Halign): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    @scala.inline
    def setPanDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "panDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanDirectionUndefined: Self = StObject.set(x, "panDirection", js.undefined)
    
    @scala.inline
    def setPanning(value: auto | none): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanningUndefined: Self = StObject.set(x, "panning", js.undefined)
    
    @scala.inline
    def setPromotedLinkBehavior(value: none | full | `lazy`): Self = StObject.set(x, "promotedLinkBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotedLinkBehaviorUndefined: Self = StObject.set(x, "promotedLinkBehavior", js.undefined)
    
    @scala.inline
    def setRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setSelection(value: js.Array[K1 | K2]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionRendererNull: Self = StObject.set(x, "selectionRenderer", null)
    
    @scala.inline
    def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(value: (K1 | K2)*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    @scala.inline
    def setStyleDefaults(value: AnimationDuration): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleDefaultsUndefined: Self = StObject.set(x, "styleDefaults", js.undefined)
    
    @scala.inline
    def setTooltip(value: `5`[K1, K2, D1, D2]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponseUndefined: Self = StObject.set(x, "touchResponse", js.undefined)
    
    @scala.inline
    def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    @scala.inline
    def setTranslations(value: LabelClearSelection): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setZoomRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "zoomRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setZoomRendererNull: Self = StObject.set(x, "zoomRenderer", null)
    
    @scala.inline
    def setZoomRendererUndefined: Self = StObject.set(x, "zoomRenderer", js.undefined)
    
    @scala.inline
    def setZooming(value: auto | none): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
  }
}
