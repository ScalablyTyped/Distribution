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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapSettableProperties<K1, K2, K3, D1, D2, D3>> */
@js.native
trait ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]
  extends /* key */ StringDictionary[js.Any] {
  
  var animationDuration: js.UndefOr[Double] = js.native
  
  var animationOnDisplay: js.UndefOr[auto | none] = js.native
  
  var areaData: js.UndefOr[(DataProvider[K1, D1]) | Null] = js.native
  
  var as: js.UndefOr[String] = js.native
  
  var focusRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.native
  
  var highlightMatch: js.UndefOr[any | all] = js.native
  
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.native
  
  var hoverBehavior: js.UndefOr[dim | none] = js.native
  
  var hoverRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  
  var initialZooming: js.UndefOr[auto | none] = js.native
  
  var isolatedItem: js.UndefOr[K1] = js.native
  
  var labelDisplay: js.UndefOr[on | off | auto] = js.native
  
  var labelType: js.UndefOr[long | short] = js.native
  
  var linkData: js.UndefOr[(DataProvider[K2, D2]) | Null] = js.native
  
  var mapProvider: js.UndefOr[Geo] = js.native
  
  var markerData: js.UndefOr[(DataProvider[K3, D3]) | Null] = js.native
  
  var markerZoomBehavior: js.UndefOr[zoom | fixed] = js.native
  
  var maxZoom: js.UndefOr[Double] = js.native
  
  var panning: js.UndefOr[auto | none] = js.native
  
  var renderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  
  var selection: js.UndefOr[js.Array[K1 | K2 | K3]] = js.native
  
  var selectionMode: js.UndefOr[single | multiple | none] = js.native
  
  var selectionRenderer: js.UndefOr[
    (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null
  ] = js.native
  
  var styleDefaults: js.UndefOr[AreaSvgStyle] = js.native
  
  var tooltip: js.UndefOr[`27`[K1, K2, K3, D1, D2, D3]] = js.native
  
  var tooltipDisplay: js.UndefOr[auto | labelAndShortDesc | none | shortDesc] = js.native
  
  var touchResponse: js.UndefOr[touchStart | auto] = js.native
  
  var trackResize: js.UndefOr[on | off] = js.native
  
  var translations: js.UndefOr[LabelAndValue] = js.native
  
  var zooming: js.UndefOr[auto | none] = js.native
}
object ojThematicMapSettablePropertiesLenient {
  
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](): ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]]
  }
  
  @scala.inline
  implicit class ojThematicMapSettablePropertiesLenientMutableBuilder[Self <: ojThematicMapSettablePropertiesLenient[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3])) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplayUndefined: Self = StObject.set(x, "animationOnDisplay", js.undefined)
    
    @scala.inline
    def setAreaData(value: DataProvider[K1, D1]): Self = StObject.set(x, "areaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaDataNull: Self = StObject.set(x, "areaData", null)
    
    @scala.inline
    def setAreaDataUndefined: Self = StObject.set(x, "areaData", js.undefined)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setFocusRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "focusRenderer", js.Any.fromFunction1(value))
    
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
    def setHoverRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "hoverRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverRendererNull: Self = StObject.set(x, "hoverRenderer", null)
    
    @scala.inline
    def setHoverRendererUndefined: Self = StObject.set(x, "hoverRenderer", js.undefined)
    
    @scala.inline
    def setInitialZooming(value: auto | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialZoomingUndefined: Self = StObject.set(x, "initialZooming", js.undefined)
    
    @scala.inline
    def setIsolatedItem(value: K1): Self = StObject.set(x, "isolatedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolatedItemUndefined: Self = StObject.set(x, "isolatedItem", js.undefined)
    
    @scala.inline
    def setLabelDisplay(value: on | off | auto): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    @scala.inline
    def setLabelType(value: long | short): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelTypeUndefined: Self = StObject.set(x, "labelType", js.undefined)
    
    @scala.inline
    def setLinkData(value: DataProvider[K2, D2]): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkDataNull: Self = StObject.set(x, "linkData", null)
    
    @scala.inline
    def setLinkDataUndefined: Self = StObject.set(x, "linkData", js.undefined)
    
    @scala.inline
    def setMapProvider(value: Geo): Self = StObject.set(x, "mapProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapProviderUndefined: Self = StObject.set(x, "mapProvider", js.undefined)
    
    @scala.inline
    def setMarkerData(value: DataProvider[K3, D3]): Self = StObject.set(x, "markerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDataNull: Self = StObject.set(x, "markerData", null)
    
    @scala.inline
    def setMarkerDataUndefined: Self = StObject.set(x, "markerData", js.undefined)
    
    @scala.inline
    def setMarkerZoomBehavior(value: zoom | fixed): Self = StObject.set(x, "markerZoomBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerZoomBehaviorUndefined: Self = StObject.set(x, "markerZoomBehavior", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setPanning(value: auto | none): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanningUndefined: Self = StObject.set(x, "panning", js.undefined)
    
    @scala.inline
    def setRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setSelection(value: js.Array[K1 | K2 | K3]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    @scala.inline
    def setSelectionRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionRendererNull: Self = StObject.set(x, "selectionRenderer", null)
    
    @scala.inline
    def setSelectionRendererUndefined: Self = StObject.set(x, "selectionRenderer", js.undefined)
    
    @scala.inline
    def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    @scala.inline
    def setSelectionVarargs(value: (K1 | K2 | K3)*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    @scala.inline
    def setStyleDefaults(value: AreaSvgStyle): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleDefaultsUndefined: Self = StObject.set(x, "styleDefaults", js.undefined)
    
    @scala.inline
    def setTooltip(value: `27`[K1, K2, K3, D1, D2, D3]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDisplay(value: auto | labelAndShortDesc | none | shortDesc): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDisplayUndefined: Self = StObject.set(x, "tooltipDisplay", js.undefined)
    
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
    def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    
    @scala.inline
    def setZooming(value: auto | none): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
  }
}
