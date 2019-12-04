package typings.atOracleOraclejet.ojthematicmapMod

import typings.atOracleOraclejet.Anon_AreaSvgStyle
import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValue
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsertAnonPreventDefaultD1
import typings.atOracleOraclejet.Anon_Geo
import typings.atOracleOraclejet.Anon_InsertSVGElement
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.fixed
import typings.atOracleOraclejet.atOracleOraclejetStrings.labelAndShortDesc
import typings.atOracleOraclejet.atOracleOraclejetStrings.long
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.short
import typings.atOracleOraclejet.atOracleOraclejetStrings.shortDesc
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.zoom
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typings.atOracleOraclejet.ojthematicmapMod.ojThematicMap.RendererContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double
  var animationOnDisplay: auto | none
  var areaData: (DataProvider[K1, D1]) | Null
  var as: String
  var focusRenderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverRenderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null
  var initialZooming: auto | none
  var isolatedItem: K1
  var labelDisplay: on | off | auto
  var labelType: long | short
  var linkData: (DataProvider[K2, D2]) | Null
  var mapProvider: Anon_Geo
  var markerData: (DataProvider[K3, D3]) | Null
  var markerZoomBehavior: zoom | fixed
  var maxZoom: Double
  var panning: auto | none
  var renderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null
  var selection: js.Array[K1 | K2 | K3]
  var selectionMode: single | multiple | none
  var selectionRenderer: (js.Function1[
    /* context */ RendererContext[K1, K2, K3, D1, D2, D3], 
    Anon_InsertSVGElement | Unit
  ]) | Null
  var styleDefaults: Anon_AreaSvgStyle
  var tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2]
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojThematicMapSettableProperties: Anon_ComponentNameLabelAndValue
  var zooming: auto | none
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
    mapProvider: Anon_Geo,
    markerZoomBehavior: zoom | fixed,
    maxZoom: Double,
    panning: auto | none,
    selection: js.Array[K1 | K2 | K3],
    selectionMode: single | multiple | none,
    styleDefaults: Anon_AreaSvgStyle,
    tooltip: Anon_ContextRendererAnonInsertAnonPreventDefaultD1[D3, K1, K2, D1, K3, D2],
    tooltipDisplay: auto | labelAndShortDesc | none | shortDesc,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValue,
    zooming: auto | none,
    areaData: DataProvider[K1, D1] = null,
    focusRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => Anon_InsertSVGElement | Unit = null,
    hoverRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => Anon_InsertSVGElement | Unit = null,
    linkData: DataProvider[K2, D2] = null,
    markerData: DataProvider[K3, D3] = null,
    renderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => Anon_InsertSVGElement | Unit = null,
    selectionRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => Anon_InsertSVGElement | Unit = null
  ): ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as.asInstanceOf[js.Any], hiddenCategories = hiddenCategories.asInstanceOf[js.Any], highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories.asInstanceOf[js.Any], hoverBehavior = hoverBehavior.asInstanceOf[js.Any], initialZooming = initialZooming.asInstanceOf[js.Any], isolatedItem = isolatedItem.asInstanceOf[js.Any], labelDisplay = labelDisplay.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], mapProvider = mapProvider.asInstanceOf[js.Any], markerZoomBehavior = markerZoomBehavior.asInstanceOf[js.Any], maxZoom = maxZoom.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], tooltipDisplay = tooltipDisplay.asInstanceOf[js.Any], touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], zooming = zooming.asInstanceOf[js.Any])
    if (areaData != null) __obj.updateDynamic("areaData")(areaData.asInstanceOf[js.Any])
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(js.Any.fromFunction1(focusRenderer))
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(js.Any.fromFunction1(hoverRenderer))
    if (linkData != null) __obj.updateDynamic("linkData")(linkData.asInstanceOf[js.Any])
    if (markerData != null) __obj.updateDynamic("markerData")(markerData.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    __obj.asInstanceOf[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]]
  }
}

