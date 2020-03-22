package typings.oracleOraclejet.ojthematicmapMod

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.Anon25
import typings.oracleOraclejet.AnonAreaSvgStyle
import typings.oracleOraclejet.AnonGeo
import typings.oracleOraclejet.AnonInsertSVGElement
import typings.oracleOraclejet.AnonLabelAndValue
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojthematicmap.ojThematicMapSettableProperties<K1, K2, K3, D1, D2, D3>> */
trait ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]
  extends /* key */ StringDictionary[js.Any] {
  var animationDuration: js.UndefOr[Double] = js.undefined
  var animationOnDisplay: js.UndefOr[auto | none] = js.undefined
  var areaData: js.UndefOr[DataProvider[K1, D1]] = js.undefined
  var as: js.UndefOr[String] = js.undefined
  var focusRenderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
  ] = js.undefined
  var hiddenCategories: js.UndefOr[js.Array[String]] = js.undefined
  var highlightMatch: js.UndefOr[any | all] = js.undefined
  var highlightedCategories: js.UndefOr[js.Array[String]] = js.undefined
  var hoverBehavior: js.UndefOr[dim | none] = js.undefined
  var hoverRenderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
  ] = js.undefined
  var initialZooming: js.UndefOr[auto | none] = js.undefined
  var isolatedItem: js.UndefOr[K1] = js.undefined
  var labelDisplay: js.UndefOr[on | off | auto] = js.undefined
  var labelType: js.UndefOr[long | short] = js.undefined
  var linkData: js.UndefOr[DataProvider[K2, D2]] = js.undefined
  var mapProvider: js.UndefOr[AnonGeo] = js.undefined
  var markerData: js.UndefOr[DataProvider[K3, D3]] = js.undefined
  var markerZoomBehavior: js.UndefOr[zoom | fixed] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var panning: js.UndefOr[auto | none] = js.undefined
  var renderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
  ] = js.undefined
  var selection: js.UndefOr[js.Array[K1 | K2 | K3]] = js.undefined
  var selectionMode: js.UndefOr[single | multiple | none] = js.undefined
  var selectionRenderer: js.UndefOr[
    js.Function1[/* context */ RendererContext[K1, K2, K3, D1, D2, D3], AnonInsertSVGElement | Unit]
  ] = js.undefined
  var styleDefaults: js.UndefOr[AnonAreaSvgStyle] = js.undefined
  var tooltip: js.UndefOr[Anon25[K1, K2, K3, D1, D2, D3]] = js.undefined
  var tooltipDisplay: js.UndefOr[auto | labelAndShortDesc | none | shortDesc] = js.undefined
  var touchResponse: js.UndefOr[touchStart | auto] = js.undefined
  var trackResize: js.UndefOr[on | off] = js.undefined
  var translations: js.UndefOr[AnonLabelAndValue] = js.undefined
  var zooming: js.UndefOr[auto | none] = js.undefined
}

object ojThematicMapSettablePropertiesLenient {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    animationDuration: Int | Double = null,
    animationOnDisplay: auto | none = null,
    areaData: DataProvider[K1, D1] = null,
    as: String = null,
    focusRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null,
    hiddenCategories: js.Array[String] = null,
    highlightMatch: any | all = null,
    highlightedCategories: js.Array[String] = null,
    hoverBehavior: dim | none = null,
    hoverRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null,
    initialZooming: auto | none = null,
    isolatedItem: K1 = null,
    labelDisplay: on | off | auto = null,
    labelType: long | short = null,
    linkData: DataProvider[K2, D2] = null,
    mapProvider: AnonGeo = null,
    markerData: DataProvider[K3, D3] = null,
    markerZoomBehavior: zoom | fixed = null,
    maxZoom: Int | Double = null,
    panning: auto | none = null,
    renderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null,
    selection: js.Array[K1 | K2 | K3] = null,
    selectionMode: single | multiple | none = null,
    selectionRenderer: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => AnonInsertSVGElement | Unit = null,
    styleDefaults: AnonAreaSvgStyle = null,
    tooltip: Anon25[K1, K2, K3, D1, D2, D3] = null,
    tooltipDisplay: auto | labelAndShortDesc | none | shortDesc = null,
    touchResponse: touchStart | auto = null,
    trackResize: on | off = null,
    translations: AnonLabelAndValue = null,
    zooming: auto | none = null
  ): ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationOnDisplay != null) __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    if (areaData != null) __obj.updateDynamic("areaData")(areaData.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(js.Any.fromFunction1(focusRenderer))
    if (hiddenCategories != null) __obj.updateDynamic("hiddenCategories")(hiddenCategories.asInstanceOf[js.Any])
    if (highlightMatch != null) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (highlightedCategories != null) __obj.updateDynamic("highlightedCategories")(highlightedCategories.asInstanceOf[js.Any])
    if (hoverBehavior != null) __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(js.Any.fromFunction1(hoverRenderer))
    if (initialZooming != null) __obj.updateDynamic("initialZooming")(initialZooming.asInstanceOf[js.Any])
    if (isolatedItem != null) __obj.updateDynamic("isolatedItem")(isolatedItem.asInstanceOf[js.Any])
    if (labelDisplay != null) __obj.updateDynamic("labelDisplay")(labelDisplay.asInstanceOf[js.Any])
    if (labelType != null) __obj.updateDynamic("labelType")(labelType.asInstanceOf[js.Any])
    if (linkData != null) __obj.updateDynamic("linkData")(linkData.asInstanceOf[js.Any])
    if (mapProvider != null) __obj.updateDynamic("mapProvider")(mapProvider.asInstanceOf[js.Any])
    if (markerData != null) __obj.updateDynamic("markerData")(markerData.asInstanceOf[js.Any])
    if (markerZoomBehavior != null) __obj.updateDynamic("markerZoomBehavior")(markerZoomBehavior.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (panning != null) __obj.updateDynamic("panning")(panning.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (styleDefaults != null) __obj.updateDynamic("styleDefaults")(styleDefaults.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (touchResponse != null) __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    if (trackResize != null) __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    if (zooming != null) __obj.updateDynamic("zooming")(zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3]]
  }
}

