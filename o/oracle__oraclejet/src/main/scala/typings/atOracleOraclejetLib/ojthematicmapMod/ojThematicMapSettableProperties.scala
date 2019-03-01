package typings
package atOracleOraclejetLib.ojthematicmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationDuration: scala.Double
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var areaData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null
  var as: java.lang.String
  var focusRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var initialZooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var isolatedItem: K1
  var labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var labelType: atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short
  var linkData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null
  var mapProvider: atOracleOraclejetLib.Anon_Geo
  var markerData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3]) | scala.Null
  var markerZoomBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed
  var maxZoom: scala.Double
  var panning: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var renderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var selection: js.Array[K1 | K2 | K3]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var selectionRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var styleDefaults: atOracleOraclejetLib.Anon_AreaSvgStyle
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1]
  var tooltipDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojThematicMapSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue
  var zooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
}

object ojThematicMapSettableProperties {
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](
    animationDuration: scala.Double,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    as: java.lang.String,
    hiddenCategories: js.Array[java.lang.String],
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    initialZooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    isolatedItem: K1,
    labelDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    labelType: atOracleOraclejetLib.atOracleOraclejetLibStrings.long | atOracleOraclejetLib.atOracleOraclejetLibStrings.short,
    mapProvider: atOracleOraclejetLib.Anon_Geo,
    markerZoomBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.zoom | atOracleOraclejetLib.atOracleOraclejetLibStrings.fixed,
    maxZoom: scala.Double,
    panning: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    selection: js.Array[K1 | K2 | K3],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    styleDefaults: atOracleOraclejetLib.Anon_AreaSvgStyle,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsertAnonPreventDefaultD1[K1, K3, D3, K2, D2, D1],
    tooltipDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.labelAndShortDesc | atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.shortDesc,
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValue,
    zooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    areaData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1] = null,
    focusRenderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null,
    hoverRenderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null,
    linkData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2] = null,
    markerData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K3, D3] = null,
    renderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null,
    selectionRenderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojthematicmapMod.ojThematicMapNs.RendererContext[K1, K2, K3, D1, D2, D3], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null
  ): ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationDuration")(animationDuration)
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("hiddenCategories")(hiddenCategories)
    __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("highlightedCategories")(highlightedCategories)
    __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("initialZooming")(initialZooming.asInstanceOf[js.Any])
    __obj.updateDynamic("isolatedItem")(isolatedItem.asInstanceOf[js.Any])
    __obj.updateDynamic("labelDisplay")(labelDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("labelType")(labelType.asInstanceOf[js.Any])
    __obj.updateDynamic("mapProvider")(mapProvider)
    __obj.updateDynamic("markerZoomBehavior")(markerZoomBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("maxZoom")(maxZoom)
    __obj.updateDynamic("panning")(panning.asInstanceOf[js.Any])
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("styleDefaults")(styleDefaults)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("zooming")(zooming.asInstanceOf[js.Any])
    if (areaData != null) __obj.updateDynamic("areaData")(areaData)
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(focusRenderer)
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(hoverRenderer)
    if (linkData != null) __obj.updateDynamic("linkData")(linkData)
    if (markerData != null) __obj.updateDynamic("markerData")(markerData)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(selectionRenderer)
    __obj.asInstanceOf[ojThematicMapSettableProperties[K1, K2, K3, D1, D2, D3]]
  }
}

