package typings.oracleOraclejet.ojthematicmapMod

import typings.oracleOraclejet.anon.AreaSvgStyle
import typings.oracleOraclejet.anon.Geo
import typings.oracleOraclejet.anon.InsertSVGElement
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.`27`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
import typings.oracleOraclejet.ojdvtBaseMod.dvtBaseComponentSettableProperties
import typings.oracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
import typings.oracleOraclejet.oracleOraclejetStrings.all
import typings.oracleOraclejet.oracleOraclejetStrings.any
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.dim
import typings.oracleOraclejet.oracleOraclejetStrings.fixed
import typings.oracleOraclejet.oracleOraclejetStrings.labelAndShortDesc
import typings.oracleOraclejet.oracleOraclejetStrings.long
import typings.oracleOraclejet.oracleOraclejetStrings.multiple
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.short
import typings.oracleOraclejet.oracleOraclejetStrings.shortDesc
import typings.oracleOraclejet.oracleOraclejetStrings.single
import typings.oracleOraclejet.oracleOraclejetStrings.touchStart
import typings.oracleOraclejet.oracleOraclejetStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]
  extends StObject
     with dvtBaseComponentSettableProperties {
  
  var animationDuration: Double
  
  var animationOnDisplay: auto | none
  
  var areaData: (DataProvider[K1, D1]) | Null
  
  var as: String
  
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  
  var hiddenCategories: js.Array[String]
  
  var highlightMatch: any | all
  
  var highlightedCategories: js.Array[String]
  
  var hoverBehavior: dim | none
  
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  
  var initialZooming: auto | none
  
  var isolatedItem: K1
  
  var labelDisplay: on | off | auto
  
  var labelType: long | short
  
  var linkData: (DataProvider[K2, D2]) | Null
  
  var mapProvider: Geo
  
  var markerData: (DataProvider[K3, D3]) | Null
  
  var markerZoomBehavior: zoom | fixed
  
  var maxZoom: Double
  
  var panning: auto | none
  
  var renderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  
  var selection: js.Array[K1 | K2 | K3]
  
  var selectionMode: single | multiple | none
  
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  
  var styleDefaults: AreaSvgStyle
  
  var tooltip: `27`[K1, K2, K3, D1, D2, D3]
  
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc
  
  var touchResponse: touchStart | auto
  
  @JSName("translations")
  var translations_ojThematicMapSettableProperties: LabelAndValue
  
  var zooming: auto | none
}
object ojThematicMapSettableProperties {
  
  inline def apply[K1, K2, K3, D1, D2, D3](
    animationDuration: Double,
    animationOnDisplay: auto | none,
    as: String,
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    initialZooming: auto | none,
    isolatedItem: K1,
    labelDisplay: on | off | auto,
    labelType: long | short,
    mapProvider: Geo,
    markerZoomBehavior: zoom | fixed,
    maxZoom: Double,
    panning: auto | none,
    selection: js.Array[K1 | K2 | K3],
    selectionMode: single | multiple | none,
    styleDefaults: AreaSvgStyle,
    tooltip: `27`[K1, K2, K3, D1, D2, D3],
    tooltipDisplay: auto | labelAndShortDesc | none | shortDesc,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: LabelAndValue,
    zooming: auto | none
  ): ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], isolatedItem = isolatedItem.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], mapProvider = mapProvider.asInstanceOf[js.Any], markerZoomBehavior = markerZoomBehavior.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any], areaData = null, focusRenderer = null, hoverRenderer = null, linkData = null, markerData = null, renderer = null, selectionRenderer = null)
    __obj.asInstanceOf[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]]
  }
  
  extension [Self <: ojThematicMapSettableProperties[?, ?, ?, ?, ?, ?], K1, K2, K3, D1, D2, D3](x: Self & (ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3])) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAreaData(value: DataProvider[K1, D1]): Self = StObject.set(x, "areaData", value.asInstanceOf[js.Any])
    
    inline def setAreaDataNull: Self = StObject.set(x, "areaData", null)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setFocusRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "focusRenderer", js.Any.fromFunction1(value))
    
    inline def setFocusRendererNull: Self = StObject.set(x, "focusRenderer", null)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value*))
    
    inline def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "hoverRenderer", js.Any.fromFunction1(value))
    
    inline def setHoverRendererNull: Self = StObject.set(x, "hoverRenderer", null)
    
    inline def setInitialZooming(value: auto | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    inline def setIsolatedItem(value: K1): Self = StObject.set(x, "isolatedItem", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: on | off | auto): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelType(value: long | short): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    inline def setLinkData(value: DataProvider[K2, D2]): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    inline def setLinkDataNull: Self = StObject.set(x, "linkData", null)
    
    inline def setMapProvider(value: Geo): Self = StObject.set(x, "mapProvider", value.asInstanceOf[js.Any])
    
    inline def setMarkerData(value: DataProvider[K3, D3]): Self = StObject.set(x, "markerData", value.asInstanceOf[js.Any])
    
    inline def setMarkerDataNull: Self = StObject.set(x, "markerData", null)
    
    inline def setMarkerZoomBehavior(value: zoom | fixed): Self = StObject.set(x, "markerZoomBehavior", value.asInstanceOf[js.Any])
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setPanning(value: auto | none): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setSelection(value: js.Array[K1 | K2 | K3]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    inline def setSelectionRendererNull: Self = StObject.set(x, "selectionRenderer", null)
    
    inline def setSelectionVarargs(value: (K1 | K2 | K3)*): Self = StObject.set(x, "selection", js.Array(value*))
    
    inline def setStyleDefaults(value: AreaSvgStyle): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: `27`[K1, K2, K3, D1, D2, D3]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplay(value: auto | labelAndShortDesc | none | shortDesc): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    inline def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setZooming(value: auto | none): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
  }
}
