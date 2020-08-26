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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ojThematicMapSettablePropertiesLenientOps[Self <: ojThematicMapSettablePropertiesLenient[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (ojThematicMapSettablePropertiesLenient[K1, K2, K3, D1, D2, D3])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationDuration: Self = this.set("animationDuration", js.undefined)
    @scala.inline
    def setAnimationOnDisplay(value: auto | none): Self = this.set("animationOnDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOnDisplay: Self = this.set("animationOnDisplay", js.undefined)
    @scala.inline
    def setAreaData(value: DataProvider[K1, D1]): Self = this.set("areaData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAreaData: Self = this.set("areaData", js.undefined)
    @scala.inline
    def setAreaDataNull: Self = this.set("areaData", null)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setFocusRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = this.set("focusRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFocusRenderer: Self = this.set("focusRenderer", js.undefined)
    @scala.inline
    def setFocusRendererNull: Self = this.set("focusRenderer", null)
    @scala.inline
    def setHiddenCategoriesVarargs(value: String*): Self = this.set("hiddenCategories", js.Array(value :_*))
    @scala.inline
    def setHiddenCategories(value: js.Array[String]): Self = this.set("hiddenCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenCategories: Self = this.set("hiddenCategories", js.undefined)
    @scala.inline
    def setHighlightMatch(value: any | all): Self = this.set("highlightMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightMatch: Self = this.set("highlightMatch", js.undefined)
    @scala.inline
    def setHighlightedCategoriesVarargs(value: String*): Self = this.set("highlightedCategories", js.Array(value :_*))
    @scala.inline
    def setHighlightedCategories(value: js.Array[String]): Self = this.set("highlightedCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedCategories: Self = this.set("highlightedCategories", js.undefined)
    @scala.inline
    def setHoverBehavior(value: dim | none): Self = this.set("hoverBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBehavior: Self = this.set("hoverBehavior", js.undefined)
    @scala.inline
    def setHoverRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = this.set("hoverRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHoverRenderer: Self = this.set("hoverRenderer", js.undefined)
    @scala.inline
    def setHoverRendererNull: Self = this.set("hoverRenderer", null)
    @scala.inline
    def setInitialZooming(value: auto | none): Self = this.set("initialZooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialZooming: Self = this.set("initialZooming", js.undefined)
    @scala.inline
    def setIsolatedItem(value: K1): Self = this.set("isolatedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsolatedItem: Self = this.set("isolatedItem", js.undefined)
    @scala.inline
    def setLabelDisplay(value: on | off | auto): Self = this.set("labelDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelDisplay: Self = this.set("labelDisplay", js.undefined)
    @scala.inline
    def setLabelType(value: long | short): Self = this.set("labelType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelType: Self = this.set("labelType", js.undefined)
    @scala.inline
    def setLinkData(value: DataProvider[K2, D2]): Self = this.set("linkData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkData: Self = this.set("linkData", js.undefined)
    @scala.inline
    def setLinkDataNull: Self = this.set("linkData", null)
    @scala.inline
    def setMapProvider(value: Geo): Self = this.set("mapProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapProvider: Self = this.set("mapProvider", js.undefined)
    @scala.inline
    def setMarkerData(value: DataProvider[K3, D3]): Self = this.set("markerData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerData: Self = this.set("markerData", js.undefined)
    @scala.inline
    def setMarkerDataNull: Self = this.set("markerData", null)
    @scala.inline
    def setMarkerZoomBehavior(value: zoom | fixed): Self = this.set("markerZoomBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerZoomBehavior: Self = this.set("markerZoomBehavior", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setPanning(value: auto | none): Self = this.set("panning", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanning: Self = this.set("panning", js.undefined)
    @scala.inline
    def setRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = this.set("renderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setRendererNull: Self = this.set("renderer", null)
    @scala.inline
    def setSelectionVarargs(value: (K1 | K2 | K3)*): Self = this.set("selection", js.Array(value :_*))
    @scala.inline
    def setSelection(value: js.Array[K1 | K2 | K3]): Self = this.set("selection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    @scala.inline
    def setSelectionMode(value: single | multiple | none): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionMode: Self = this.set("selectionMode", js.undefined)
    @scala.inline
    def setSelectionRenderer(value: /* context */ RendererContext[K1, K2, K3, D1, D2, D3] => InsertSVGElement | Unit): Self = this.set("selectionRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSelectionRenderer: Self = this.set("selectionRenderer", js.undefined)
    @scala.inline
    def setSelectionRendererNull: Self = this.set("selectionRenderer", null)
    @scala.inline
    def setStyleDefaults(value: AreaSvgStyle): Self = this.set("styleDefaults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleDefaults: Self = this.set("styleDefaults", js.undefined)
    @scala.inline
    def setTooltip(value: `27`[K1, K2, K3, D1, D2, D3]): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
    @scala.inline
    def setTooltipDisplay(value: auto | labelAndShortDesc | none | shortDesc): Self = this.set("tooltipDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipDisplay: Self = this.set("tooltipDisplay", js.undefined)
    @scala.inline
    def setTouchResponse(value: touchStart | auto): Self = this.set("touchResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchResponse: Self = this.set("touchResponse", js.undefined)
    @scala.inline
    def setTrackResize(value: on | off): Self = this.set("trackResize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrackResize: Self = this.set("trackResize", js.undefined)
    @scala.inline
    def setTranslations(value: LabelAndValue): Self = this.set("translations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
    @scala.inline
    def setZooming(value: auto | none): Self = this.set("zooming", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooming: Self = this.set("zooming", js.undefined)
  }
  
}

