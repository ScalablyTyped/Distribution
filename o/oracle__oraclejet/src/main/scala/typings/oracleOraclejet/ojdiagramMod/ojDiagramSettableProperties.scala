package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.anon.AnimationDuration
import typings.oracleOraclejet.anon.Drop
import typings.oracleOraclejet.anon.Halign
import typings.oracleOraclejet.anon.InsertSVGElement
import typings.oracleOraclejet.anon.LabelClearSelection
import typings.oracleOraclejet.anon.`5`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
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

trait ojDiagramSettableProperties[K1, K2, D1, D2]
  extends StObject
     with dvtBaseComponentSettableProperties {
  
  var animationOnDataChange: auto | none
  
  var animationOnDisplay: auto | none
  
  var as: String
  
  var dnd: Drop
  
  var expanded: KeySet[K1]
  
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  
  var hiddenCategories: js.Array[String]
  
  var highlightMatch: any | all
  
  var highlightedCategories: js.Array[String]
  
  var hoverBehavior: dim | none
  
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  
  def layout(param0: DvtDiagramLayoutContext): Unit
  
  var linkData: (DataProvider[K2, D2]) | Null
  
  var linkHighlightMode: linkAndNodes | link
  
  var maxZoom: Double
  
  var minZoom: Double
  
  var nodeData: (DataProvider[K1, D1]) | Null
  
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node
  
  var overview: Halign
  
  var panDirection: x | y | auto
  
  var panning: auto | none
  
  var promotedLinkBehavior: none | full | `lazy`
  
  def renderer(context: RendererContext[K1, D1]): InsertSVGElement
  
  var selection: js.Array[K1 | K2]
  
  var selectionMode: single | multiple | none
  
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  
  var styleDefaults: AnimationDuration
  
  var tooltip: `5`[K1, K2, D1, D2]
  
  var touchResponse: touchStart | auto
  
  @JSName("translations")
  var translations_ojDiagramSettableProperties: LabelClearSelection
  
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], InsertSVGElement | Unit]) | Null
  
  var zooming: auto | none
}
object ojDiagramSettableProperties {
  
  inline def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    dnd: Drop,
    expanded: KeySet[K1],
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    layout: DvtDiagramLayoutContext => Unit,
    linkHighlightMode: linkAndNodes | link,
    maxZoom: Double,
    minZoom: Double,
    nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node,
    overview: Halign,
    panDirection: x | y | auto,
    panning: auto | none,
    promotedLinkBehavior: none | full | `lazy`,
    renderer: RendererContext[K1, D1] => InsertSVGElement,
    selection: js.Array[K1 | K2],
    selectionMode: single | multiple | none,
    styleDefaults: AnimationDuration,
    tooltip: `5`[K1, K2, D1, D2],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: LabelClearSelection,
    zooming: auto | none
  ): ojDiagramSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], dnd = dnd.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], layout = js.Any.fromFunction1(layout), linkHighlightMode = linkHighlightMode.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], minZoom = minZoom.asInstanceOf[js.Any], nodeHighlightMode = nodeHighlightMode.asInstanceOf[js.Any], overview = overview.asInstanceOf[js.Any], panDirection = panDirection.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], promotedLinkBehavior = promotedLinkBehavior.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any], focusRenderer = null, hoverRenderer = null, linkData = null, nodeData = null, selectionRenderer = null, zoomRenderer = null)
    __obj.asInstanceOf[ojDiagramSettableProperties[K1, K2, D1, D2]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ojDiagramSettableProperties[?, ?, ?, ?], K1, K2, D1, D2] (val x: Self & (ojDiagramSettableProperties[K1, K2, D1, D2])) extends AnyVal {
    
    inline def setAnimationOnDataChange(value: auto | none): Self = StObject.set(x, "animationOnDataChange", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setDnd(value: Drop): Self = StObject.set(x, "dnd", value.asInstanceOf[js.Any])
    
    inline def setExpanded(value: KeySet[K1]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setFocusRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "focusRenderer", js.Any.fromFunction1(value))
    
    inline def setFocusRendererNull: Self = StObject.set(x, "focusRenderer", null)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value*))
    
    inline def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "hoverRenderer", js.Any.fromFunction1(value))
    
    inline def setHoverRendererNull: Self = StObject.set(x, "hoverRenderer", null)
    
    inline def setLayout(value: DvtDiagramLayoutContext => Unit): Self = StObject.set(x, "layout", js.Any.fromFunction1(value))
    
    inline def setLinkData(value: DataProvider[K2, D2]): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    inline def setLinkDataNull: Self = StObject.set(x, "linkData", null)
    
    inline def setLinkHighlightMode(value: linkAndNodes | link): Self = StObject.set(x, "linkHighlightMode", value.asInstanceOf[js.Any])
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    inline def setNodeData(value: DataProvider[K1, D1]): Self = StObject.set(x, "nodeData", value.asInstanceOf[js.Any])
    
    inline def setNodeDataNull: Self = StObject.set(x, "nodeData", null)
    
    inline def setNodeHighlightMode(value: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node): Self = StObject.set(x, "nodeHighlightMode", value.asInstanceOf[js.Any])
    
    inline def setOverview(value: Halign): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setPanDirection(value: typings.oracleOraclejet.oracleOraclejetStrings.x | y | auto): Self = StObject.set(x, "panDirection", value.asInstanceOf[js.Any])
    
    inline def setPanning(value: auto | none): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    inline def setPromotedLinkBehavior(value: none | full | `lazy`): Self = StObject.set(x, "promotedLinkBehavior", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: RendererContext[K1, D1] => InsertSVGElement): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setSelection(value: js.Array[K1 | K2]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    inline def setSelectionRendererNull: Self = StObject.set(x, "selectionRenderer", null)
    
    inline def setSelectionVarargs(value: (K1 | K2)*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setStyleDefaults(value: AnimationDuration): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: `5`[K1, K2, D1, D2]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    inline def setTranslations(value: LabelClearSelection): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setZoomRenderer(value: /* context */ RendererContext[K1, D1] => InsertSVGElement | Unit): Self = StObject.set(x, "zoomRenderer", js.Any.fromFunction1(value))
    
    inline def setZoomRendererNull: Self = StObject.set(x, "zoomRenderer", null)
    
    inline def setZooming(value: auto | none): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
  }
}
