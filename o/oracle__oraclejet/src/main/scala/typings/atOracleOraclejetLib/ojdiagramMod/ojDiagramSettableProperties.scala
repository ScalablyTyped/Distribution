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
    layout: DvtDiagramLayoutContext => scala.Unit,
    linkHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.linkAndNodes | atOracleOraclejetLib.atOracleOraclejetLibStrings.link,
    maxZoom: scala.Double,
    minZoom: scala.Double,
    nodeHighlightMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndIncomingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndOutgoingLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.nodeAndLinks | atOracleOraclejetLib.atOracleOraclejetLibStrings.node,
    overview: atOracleOraclejetLib.Anon_Bottom,
    panDirection: atOracleOraclejetLib.atOracleOraclejetLibStrings.x | atOracleOraclejetLib.atOracleOraclejetLibStrings.y | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    panning: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    promotedLinkBehavior: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.full | atOracleOraclejetLib.atOracleOraclejetLibStrings.`lazy`,
    renderer: atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1] => atOracleOraclejetLib.Anon_InsertSVGElement,
    selection: js.Array[K1 | K2],
    selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    styleDefaults: atOracleOraclejetLib.Anon_AnimationDuration,
    tooltip: atOracleOraclejetLib.Anon_ContextRendererAnonInsert[K1, K2, D1, D2],
    touchResponse: atOracleOraclejetLib.atOracleOraclejetLibStrings.touchStart | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    trackResize: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off,
    translations: atOracleOraclejetLib.Anon_ComponentNameLabelAndValueLabelClearSelection,
    zooming: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.none,
    focusRenderer: /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1] => atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit = null,
    hoverRenderer: /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1] => atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit = null,
    linkData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K2, D2] = null,
    nodeData: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K1, D1] = null,
    selectionRenderer: /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1] => atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit = null,
    zoomRenderer: /* context */ atOracleOraclejetLib.ojdiagramMod.ojDiagramNs.RendererContext[K1, D1] => atOracleOraclejetLib.Anon_InsertSVGElement | scala.Unit = null
  ): ojDiagramSettableProperties[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(animationOnDataChange = animationOnDataChange.asInstanceOf[js.Any], animationOnDisplay = animationOnDisplay.asInstanceOf[js.Any], as = as, dnd = dnd, expanded = expanded, hiddenCategories = hiddenCategories, highlightMatch = highlightMatch.asInstanceOf[js.Any], highlightedCategories = highlightedCategories, hoverBehavior = hoverBehavior.asInstanceOf[js.Any], layout = js.Any.fromFunction1(layout), linkHighlightMode = linkHighlightMode.asInstanceOf[js.Any], maxZoom = maxZoom, minZoom = minZoom, nodeHighlightMode = nodeHighlightMode.asInstanceOf[js.Any], overview = overview, panDirection = panDirection.asInstanceOf[js.Any], panning = panning.asInstanceOf[js.Any], promotedLinkBehavior = promotedLinkBehavior.asInstanceOf[js.Any], renderer = js.Any.fromFunction1(renderer), selection = selection, selectionMode = selectionMode.asInstanceOf[js.Any], styleDefaults = styleDefaults, tooltip = tooltip, touchResponse = touchResponse.asInstanceOf[js.Any], trackResize = trackResize.asInstanceOf[js.Any], translations = translations, zooming = zooming.asInstanceOf[js.Any])
    if (focusRenderer != null) __obj.updateDynamic("focusRenderer")(js.Any.fromFunction1(focusRenderer))
    if (hoverRenderer != null) __obj.updateDynamic("hoverRenderer")(js.Any.fromFunction1(hoverRenderer))
    if (linkData != null) __obj.updateDynamic("linkData")(linkData)
    if (nodeData != null) __obj.updateDynamic("nodeData")(nodeData)
    if (selectionRenderer != null) __obj.updateDynamic("selectionRenderer")(js.Any.fromFunction1(selectionRenderer))
    if (zoomRenderer != null) __obj.updateDynamic("zoomRenderer")(js.Any.fromFunction1(zoomRenderer))
    __obj.asInstanceOf[ojDiagramSettableProperties[K1, K2, D1, D2]]
  }
}

