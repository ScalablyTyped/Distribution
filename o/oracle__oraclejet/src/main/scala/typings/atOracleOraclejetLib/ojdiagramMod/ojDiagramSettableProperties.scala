package typings
package atOracleOraclejetLib.ojdiagramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramSettableProperties[K1, K2, D1, D2]
  extends atOracleOraclejetLib.ojdvtDashBaseMod.dvtBaseComponentSettableProperties {
  var animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var as: java.lang.String
  var dnd: atOracleOraclejetLib.Anon_DragDrop
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K1]
  var focusRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var hiddenCategories: js.Array[java.lang.String]
  var highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all
  var highlightedCategories: js.Array[java.lang.String]
  var hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var hoverRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var linkData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2]) | scala.Null
  var linkHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link
  var maxZoom: scala.Double
  var minZoom: scala.Double
  var nodeData: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1]) | scala.Null
  var nodeHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node
  var overview: atOracleOraclejetLib.Anon_Bottom
  var panDirection: atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var panning: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var promotedLinkBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy`
  var selection: js.Array[K1 | K2]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var selectionRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var styleDefaults: atOracleOraclejetLib.Anon_AnimationDuration
  var tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2]
  var touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  @JSName("translations")
  var translations_ojDiagramSettableProperties: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelection
  var zoomRenderer: (js.Function1[
    /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
    atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
  ]) | scala.Null
  var zooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  def layout(param0: DvtDiagramLayoutContext): scala.Unit
  def renderer(context: atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1]): atOracleOraclejetLib.Anon_InsertSVGElement
}

object ojDiagramSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    animationOnDisplay: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    as: java.lang.String,
    dnd: atOracleOraclejetLib.Anon_DragDrop,
    expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K1],
    hiddenCategories: js.Array[java.lang.String],
    highlightMatch: atOracleOraclejetLib.atOracleOraclejetLibStrings.any | atOracleOraclejetLib.atOracleOraclejetLibStrings.all,
    highlightedCategories: js.Array[java.lang.String],
    hoverBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.dim | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    layout: js.Function1[DvtDiagramLayoutContext, scala.Unit],
    linkHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link,
    maxZoom: scala.Double,
    minZoom: scala.Double,
    nodeHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node,
    overview: atOracleOraclejetLib.Anon_Bottom,
    panDirection: atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    panning: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    promotedLinkBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy`,
    renderer: js.Function1[
      atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement
    ],
    selection: js.Array[K1 | K2],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    styleDefaults: atOracleOraclejetLib.Anon_AnimationDuration,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2],
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelection,
    zooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    focusRenderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null,
    hoverRenderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null,
    linkData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2] = null,
    nodeData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1] = null,
    selectionRenderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null,
    zoomRenderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1], 
      atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit
    ] = null
  ): ojDiagramSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationOnDataChange")(animationOnDataChange.asInstanceOf[js.Any])
    __obj.updateDynamic("animationOnDisplay")(animationOnDisplay.asInstanceOf[js.Any])
    __obj.updateDynamic("as")(as)
    __obj.updateDynamic("dnd")(dnd)
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("hiddenCategories")(hiddenCategories)
    __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    __obj.updateDynamic("highlightedCategories")(highlightedCategories)
    __obj.updateDynamic("hoverBehavior")(hoverBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("layout")(layout)
    __obj.updateDynamic("linkHighlightMode")(linkHighlightMode.asInstanceOf[js.Any])
    __obj.updateDynamic("maxZoom")(maxZoom)
    __obj.updateDynamic("minZoom")(minZoom)
    __obj.updateDynamic("nodeHighlightMode")(nodeHighlightMode.asInstanceOf[js.Any])
    __obj.updateDynamic("overview")(overview)
    __obj.updateDynamic("panDirection")(panDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("panning")(panning.asInstanceOf[js.Any])
    __obj.updateDynamic("promotedLinkBehavior")(promotedLinkBehavior.asInstanceOf[js.Any])
    __obj.updateDynamic("renderer")(renderer)
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.updateDynamic("styleDefaults")(styleDefaults)
    __obj.updateDynamic("tooltip")(tooltip)
    __obj.updateDynamic("touchResponse")(touchResponse.asInstanceOf[js.Any])
    __obj.updateDynamic("trackResize")(trackResize.asInstanceOf[js.Any])
    __obj.updateDynamic("translations")(translations)
    __obj.updateDynamic("zooming")(zooming.asInstanceOf[js.Any])
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(focusRenderer)
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(hoverRenderer)
    if (linkData != null) __obj.updateDynamic("linkData")(linkData)
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(selectionRenderer)
    if (zoomRenderer != null) __obj.updateDynamic("zoomRenderer")(zoomRenderer)
    __obj.asInstanceOf[ojDiagramSettableProperties[K1, K2, D1, D2]]
  }
}

