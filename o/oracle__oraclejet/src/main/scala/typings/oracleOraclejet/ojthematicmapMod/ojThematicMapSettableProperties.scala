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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] extends dvtBaseComponentSettableProperties {
  
  var animationDuration: Double = js.native
  
  var animationOnDisplay: auto | none = js.native
  
  var areaData: (DataProvider[K1, D1]) | Null = js.native
  
  var as: String = js.native
  
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var hiddenCategories: js.Array[String] = js.native
  
  var highlightMatch: any | all = js.native
  
  var highlightedCategories: js.Array[String] = js.native
  
  var hoverBehavior: dim | none = js.native
  
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var initialZooming: auto | none = js.native
  
  var isolatedItem: K1 = js.native
  
  var labelDisplay: on | off | auto = js.native
  
  var labelType: long | short = js.native
  
  var linkData: (DataProvider[K2, D2]) | Null = js.native
  
  var mapProvider: Geo = js.native
  
  var markerData: (DataProvider[K3, D3]) | Null = js.native
  
  var markerZoomBehavior: zoom | fixed = js.native
  
  var maxZoom: Double = js.native
  
  var panning: auto | none = js.native
  
  var renderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var selection: js.Array[K1 | K2 | K3] = js.native
  
  var selectionMode: single | multiple | none = js.native
  
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], InsertSVGElement | Unit]) | Null = js.native
  
  var styleDefaults: AreaSvgStyle = js.native
  
  var tooltip: `27`[K1, K2, K3, D1, D2, D3] = js.native
  
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc = js.native
  
  var touchResponse: touchStart | auto = js.native
  
  @JSName("translations")
  var translations_ojThematicMapSettableProperties: LabelAndValue = js.native
  
  var zooming: auto | none = js.native
}
object ojThematicMapSettableProperties {
  
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
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
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], isolatedItem = isolatedItem.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], mapProvider = mapProvider.asInstanceOf[js.Any], markerZoomBehavior = markerZoomBehavior.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]]
  }
  
  @scala.inline
  implicit class ojThematicMapSettablePropertiesMutableBuilder[Self <: ojThematicMapSettableProperties[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3])) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = StObject.set(x, "animationOnDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaData(value: DataProvider[K1, D1]): Self = StObject.set(x, "areaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaDataNull: Self = StObject.set(x, "areaData", null)
    
    @scala.inline
    def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "focusRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusRendererNull: Self = StObject.set(x, "focusRenderer", null)
    
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = StObject.set(x, "hiddenCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = StObject.set(x, "hiddenCategories", js.Array(value :_*))
    
    @scala.inline
    def setHighlightMatch(value: any | all): Self = StObject.set(x, "highlightMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = StObject.set(x, "highlightedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = StObject.set(x, "highlightedCategories", js.Array(value :_*))
    
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = StObject.set(x, "hoverBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "hoverRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoverRendererNull: Self = StObject.set(x, "hoverRenderer", null)
    
    @scala.inline
    def setInitialZooming(value: auto | none): Self = StObject.set(x, "initialZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolatedItem(value: K1): Self = StObject.set(x, "isolatedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDisplay(value: on | off | auto): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelType(value: long | short): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkData(value: DataProvider[K2, D2]): Self = StObject.set(x, "linkData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkDataNull: Self = StObject.set(x, "linkData", null)
    
    @scala.inline
    def setMapProvider(value: Geo): Self = StObject.set(x, "mapProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerData(value: DataProvider[K3, D3]): Self = StObject.set(x, "markerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerDataNull: Self = StObject.set(x, "markerData", null)
    
    @scala.inline
    def setMarkerZoomBehavior(value: zoom | fixed): Self = StObject.set(x, "markerZoomBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanning(value: auto | none): Self = StObject.set(x, "panning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
    
    @scala.inline
    def setSelection(value: js.Array[K1 | K2 | K3]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = StObject.set(x, "selectionRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelectionRendererNull: Self = StObject.set(x, "selectionRenderer", null)
    
    @scala.inline
    def setSelectionVarargs(value: (K1 | K2 | K3)*): Self = StObject.set(x, "selection", js.Array(value :_*))
    
    @scala.inline
    def setStyleDefaults(value: AreaSvgStyle): Self = StObject.set(x, "styleDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: `27`[K1, K2, K3, D1, D2, D3]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipDisplay(value: auto | labelAndShortDesc | none | shortDesc): Self = StObject.set(x, "tooltipDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = StObject.set(x, "touchResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZooming(value: auto | none): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
  }
}
