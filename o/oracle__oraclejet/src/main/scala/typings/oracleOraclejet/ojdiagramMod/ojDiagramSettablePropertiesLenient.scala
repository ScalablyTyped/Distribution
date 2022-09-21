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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramSettableProperties<K1, K2, D1, D2>> */
trait ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var animationOnDataChange: js.UndefOr[auto | none] = js.undefined
  
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  
  var as: js.UndefOr[String] = js.undefined
  
  var dnd: js.UndefOr[Drop] = js.undefined
  
  var expanded: js.UndefOr[KeySet[K1]] = js.undefined
  
  var focusRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  
  var hoverRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var layout: js.UndefOr[js.Function1[/* param0 */ DvtDiagramLayoutContext, Unit]] = js.undefined
  
  var linkData: js.UndefOr[(DataProvider[K2, D2]) | Null] = js.undefined
  
  var linkHighlightMode: js.UndefOr[linkAndNodes | link] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var minZoom: js.UndefOr[Double] = js.undefined
  
  var nodeData: js.UndefOr[(DataProvider[K1, D1]) | Null] = js.undefined
  
  var nodeHighlightMode: js.UndefOr[nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node] = js.undefined
  
  var overview: js.UndefOr[Halign] = js.undefined
  
  var panDirection: js.UndefOr[x | y | auto] = js.undefined
  
  var panning: js.UndefOr[auto | none] = js.undefined
  
  var promotedLinkBehavior: js.UndefOr[none | full | `lazy`] = js.undefined
  
  var renderer: js.UndefOr[js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement]] = js.undefined
  
  var selection: js.UndefOr[js.Array[K1 | K2]] = js.undefined
  
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  
  var selectionRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var styleDefaults: js.UndefOr[AnimationDuration] = js.undefined
  
  var tooltip: js.UndefOr[`5`[K1, K2, D1, D2]] = js.undefined
  
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var translations: js.UndefOr[LabelClearSelection] = js.undefined
  
  var zoomRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var zooming: js.UndefOr[auto | none] = js.undefined
}
object ojDiagramSettablePropertiesLenient {
  
  inline def apply[K1, K2, D1, D2](): ojDiagramSettablePropertiesLenient[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramSettablePropertiesLenient[K1, K2, D1, D2]]
  }
  
  extension [Self <: ojDiagramSettablePropertiesLenient[?, ?, ?, ?], K1, K2, D1, D2](x: Self & (ojDiagramSettablePropertiesLenient[K1, K2, D1, D2])) {
    
    inline def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDataChangeUndefined: Self = StObject.set(x, "animationOnDataChange", js.undefined)
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setDnd(value: Drop): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setDndUndefined: Self = StObject.set(x, "dnd", js.undefined)
    
    inline def setExpanded(value: KeySet[K1]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setFocusRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "focusRenderer", js.Any.fromFunction1(value))
    
    inline def setFocusRendererNull: Self = StObject.set(x, "focusRenderer", null)
    
    inline def setFocusRendererUndefined: Self = StObject.set(x, "focusRenderer", js.undefined)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesUndefined: Self = StObject.set(x, "hiddenCategories", js.undefined)
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value*))
    
    inline def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesUndefined: Self = StObject.set(x, "highlightedCategories", js.undefined)
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorUndefined: Self = StObject.set(x, "hoverBehavior", js.undefined)
    
    inline def setHoverRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "hoverRenderer", js.Any.fromFunction1(value))
    
    inline def setHoverRendererNull: Self = StObject.set(x, "hoverRenderer", null)
    
    inline def setHoverRendererUndefined: Self = StObject.set(x, "hoverRenderer", js.undefined)
    
    inline def setLayout(value: /* param0 */ DvtDiagramLayoutContext => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLinkData(value: DataProvider[K2, D2]): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    inline def setLinkDataNull: Self = StObject.set(x, "linkData", null)
    
    inline def setLinkDataUndefined: Self = StObject.set(x, "linkData", js.undefined)
    
    inline def setLinkHighlightMode(value: linkAndNodes | link): Self = StObject.set(x, "linkHighlightMode", value.asInstanceOf[js.Any])
    
    inline def setLinkHighlightModeUndefined: Self = StObject.set(x, "linkHighlightMode", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    inline def setNodeData(value: DataProvider[K1, D1]): Self = StObject.set(x, "nodeData", value.asInstanceOf[js.Any])
    
    inline def setNodeDataNull: Self = StObject.set(x, "nodeData", null)
    
    inline def setNodeDataUndefined: Self = StObject.set(x, "nodeData", js.undefined)
    
    inline def setNodeHighlightMode(value: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node): Self = StObject.set(x, "nodeHighlightMode", value.asInstanceOf[js.Any])
    
    inline def setNodeHighlightModeUndefined: Self = StObject.set(x, "nodeHighlightMode", js.undefined)
    
    inline def setOverview(value: Halign): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setPanDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "panDirection", value.asInstanceOf[js.Any])
    
    inline def setPanDirectionUndefined: Self = StObject.set(x, "panDirection", js.undefined)
    
    inline def setPanning(value: auto | none): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    inline def setPanningUndefined: Self = StObject.set(x, "panning", js.undefined)
    
    inline def setPromotedLinkBehavior(value: none | full | `lazy`): Self = StObject.set(x, "promotedLinkBehavior", value.asInstanceOf[js.Any])
    
    inline def setPromotedLinkBehaviorUndefined: Self = StObject.set(x, "promotedLinkBehavior", js.undefined)
    
    inline def setRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSelection(value: js.Array[K1 | K2]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    inline def setSelectionRendererNull: Self = StObject.set(x, "selectionRenderer", null)
    
    inline def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(value: (K1 | K2)*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setStyleDefaults(value: AnimationDuration): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaultsUndefined: Self = StObject.set(x, "styleDefaults", js.undefined)
    
    inline def setTooltip(value: `5`[K1, K2, D1, D2]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    inline def setTouchResponseUndefined: Self = StObject.set(x, "touchResponse", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTranslations(value: LabelClearSelection): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setZoomRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "zoomRenderer", js.Any.fromFunction1(value))
    
    inline def setZoomRendererNull: Self = StObject.set(x, "zoomRenderer", null)
    
    inline def setZoomRendererUndefined: Self = StObject.set(x, "zoomRenderer", js.undefined)
    
    inline def setZooming(value: auto | none): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
    
    inline def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
  }
}
