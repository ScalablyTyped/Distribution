package typings.oracleOraclejet.ojthematicmapMod

import typings.oracleOraclejet.Anon25
import typings.oracleOraclejet.AnonAreaSvgStyle
import typings.oracleOraclejet.AnonGeo
import typings.oracleOraclejet.AnonInsertSVGElement
import typings.oracleOraclejet.AnonLabelAndValue
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] extends dvtBaseComponentSettableProperties {
  var animationDuration: Double
  var animationOnDisplay: auto | none
  var areaData: (DataProvider[K1, D1]) | Null
  var as: String
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null
  var initialZooming: auto | none
  var isolatedItem: K1
  var labelDisplay: on | off | auto
  var labelType: long | short
  var linkData: (DataProvider[K2, D2]) | Null
  var mapProvider: AnonGeo
  var markerData: (DataProvider[K3, D3]) | Null
  var markerZoomBehavior: zoom | fixed
  var maxZoom: Double
  var panning: auto | none
  var renderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null
  var selection: js.Array[K1 | K2 | K3]
  var selectionMode: single | multiple | none
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]) | Null
  var styleDefaults: AnonAreaSvgStyle
  var tooltip: Anon25[K1, K2, K3, D1, D2, D3]
  var tooltipDisplay: auto | labelAndShortDesc | none | shortDesc
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojThematicMapSettableProperties: AnonLabelAndValue
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
    mapProvider: AnonGeo,
    markerZoomBehavior: zoom | fixed,
    maxZoom: Double,
    panning: auto | none,
    selection: js.Array[K1 | K2 | K3],
    selectionMode: single | multiple | none,
    styleDefaults: AnonAreaSvgStyle,
    tooltip: Anon25[K1, K2, K3, D1, D2, D3],
    tooltipDisplay: auto | labelAndShortDesc | none | shortDesc,
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: AnonLabelAndValue,
    zooming: auto | none,
    areaData: DataProvider[K1, D1] = null,
    focusRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null,
    hoverRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null,
    linkData: DataProvider[K2, D2] = null,
    markerData: DataProvider[K3, D3] = null,
    renderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null,
    selectionRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null
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

