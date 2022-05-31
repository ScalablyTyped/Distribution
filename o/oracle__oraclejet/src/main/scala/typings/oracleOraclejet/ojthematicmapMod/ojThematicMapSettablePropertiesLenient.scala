package typings.oracleOraclejet.ojthematicmapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.AreaSvgStyle
import typings.oracleOraclejet.anon.Geo
import typings.oracleOraclejet.anon.InsertSVGElement
import typings.oracleOraclejet.anon.LabelAndValue
import typings.oracleOraclejet.anon.`27`
import typings.oracleOraclejet.ojdataproviderMod.DataProvider
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

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapSettableProperties<K1, K2, K3, D1, D2, D3>> */
trait ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  
  var areaData: js.UndefOr[(DataProvider[K1, D1]) | Null] = js.undefined
  
  var as: js.UndefOr[String] = js.undefined
  
  var focusRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  
  var hoverRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var initialZooming: js.UndefOr[auto | none] = js.undefined
  
  var isolatedItem: js.UndefOr[K1] = js.undefined
  
  var labelDisplay: js.UndefOr[on | off | auto] = js.undefined
  
  var labelType: js.UndefOr[long | short] = js.undefined
  
  var linkData: js.UndefOr[(DataProvider[K2, D2]) | Null] = js.undefined
  
  var mapProvider: js.UndefOr[Geo] = js.undefined
  
  var markerData: js.UndefOr[(DataProvider[K3, D3]) | Null] = js.undefined
  
  var markerZoomBehavior: js.UndefOr[zoom | fixed] = js.undefined
  
  var maxZoom: js.UndefOr[Double] = js.undefined
  
  var panning: js.UndefOr[auto | none] = js.undefined
  
  var renderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var selection: js.UndefOr[js.Array[K1 | K2 | K3]] = js.undefined
  
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  
  var selectionRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.undefined
  
  var styleDefaults: js.UndefOr[AreaSvgStyle] = js.undefined
  
  var tooltip: js.UndefOr[`27`[K1, K2, K3, D1, D2, D3]] = js.undefined
  
  var tooltipDisplay: js.UndefOr[auto | labelAndShortDesc | none | shortDesc] = js.undefined
  
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  
  var trackResize: js.UndefOr[on | off] = js.undefined
  
  var translations: js.UndefOr[LabelAndValue] = js.undefined
  
  var zooming: js.UndefOr[auto | none] = js.undefined
}
object ojThematicMapSettablePropertiesLenient {
  
  inline def apply[K1, K2, K3, D1, D2, D3](): ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]]
  }
  
  extension [Self <: ojThematicMapSettablePropertiesLenient[?, ?, ?, ?, ?, ?], K1, K2, K3, D1, D2, D3](x: Self & (ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3])) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    inline def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    inline def setAreaData(value: DataProvider[K1, D1]): Self = StObject.set(x, "areaData", value.asInstanceOf[js.Any])
    
    inline def setAreaDataNull: Self = StObject.set(x, "areaData", null)
    
    inline def setAreaDataUndefined: Self = StObject.set(x, "areaData", js.undefined)
    
    inline def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setFocusRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "focusRenderer", js.Any.fromFunction1(value))
    
    inline def setFocusRendererNull: Self = StObject.set(x, "focusRenderer", null)
    
    inline def setFocusRendererUndefined: Self = StObject.set(x, "focusRenderer", js.undefined)
    
    inline def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    inline def setHiddenCategoriesUndefined: Self = StObject.set(x, "hiddenCategories", js.undefined)
    
    inline def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    inline def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    inline def setHighlightMatchUndefined: Self = StObject.set(x, "highlightMatch", js.undefined)
    
    inline def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    inline def setHighlightedCategoriesUndefined: Self = StObject.set(x, "highlightedCategories", js.undefined)
    
    inline def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    inline def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorUndefined: Self = StObject.set(x, "hoverBehavior", js.undefined)
    
    inline def setHoverRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "hoverRenderer", js.Any.fromFunction1(value))
    
    inline def setHoverRendererNull: Self = StObject.set(x, "hoverRenderer", null)
    
    inline def setHoverRendererUndefined: Self = StObject.set(x, "hoverRenderer", js.undefined)
    
    inline def setInitialZooming(value: auto | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    inline def setInitialZoomingUndefined: Self = StObject.set(x, "initialZooming", js.undefined)
    
    inline def setIsolatedItem(value: K1): Self = StObject.set(x, "isolatedItem", value.asInstanceOf[js.Any])
    
    inline def setIsolatedItemUndefined: Self = StObject.set(x, "isolatedItem", js.undefined)
    
    inline def setLabelDisplay(value: on | off | auto): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setLabelType(value: long | short): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    inline def setLabelTypeUndefined: Self = StObject.set(x, "labelType", js.undefined)
    
    inline def setLinkData(value: DataProvider[K2, D2]): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    inline def setLinkDataNull: Self = StObject.set(x, "linkData", null)
    
    inline def setLinkDataUndefined: Self = StObject.set(x, "linkData", js.undefined)
    
    inline def setMapProvider(value: Geo): Self = StObject.set(x, "mapProvider", value.asInstanceOf[js.Any])
    
    inline def setMapProviderUndefined: Self = StObject.set(x, "mapProvider", js.undefined)
    
    inline def setMarkerData(value: DataProvider[K3, D3]): Self = StObject.set(x, "markerData", value.asInstanceOf[js.Any])
    
    inline def setMarkerDataNull: Self = StObject.set(x, "markerData", null)
    
    inline def setMarkerDataUndefined: Self = StObject.set(x, "markerData", js.undefined)
    
    inline def setMarkerZoomBehavior(value: zoom | fixed): Self = StObject.set(x, "markerZoomBehavior", value.asInstanceOf[js.Any])
    
    inline def setMarkerZoomBehaviorUndefined: Self = StObject.set(x, "markerZoomBehavior", js.undefined)
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    inline def setPanning(value: auto | none): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    inline def setPanningUndefined: Self = StObject.set(x, "panning", js.undefined)
    
    inline def setRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setSelection(value: js.Array[K1 | K2 | K3]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setSelectionRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    inline def setSelectionRendererNull: Self = StObject.set(x, "selectionRenderer", null)
    
    inline def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setSelectionVarargs(value: (K1 | K2 | K3)*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    inline def setStyleDefaults(value: AreaSvgStyle): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    inline def setStyleDefaultsUndefined: Self = StObject.set(x, "styleDefaults", js.undefined)
    
    inline def setTooltip(value: `27`[K1, K2, K3, D1, D2, D3]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplay(value: auto | labelAndShortDesc | none | shortDesc): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    inline def setTooltipDisplayUndefined: Self = StObject.set(x, "tooltipDisplay", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    inline def setTouchResponseUndefined: Self = StObject.set(x, "touchResponse", js.undefined)
    
    inline def setTrackResize(value: on | off): Self = StObject.set(x, "trackResize", value.asInstanceOf[js.Any])
    
    inline def setTrackResizeUndefined: Self = StObject.set(x, "trackResize", js.undefined)
    
    inline def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    inline def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    inline def setZooming(value: auto | none): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
    
    inline def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
  }
}
