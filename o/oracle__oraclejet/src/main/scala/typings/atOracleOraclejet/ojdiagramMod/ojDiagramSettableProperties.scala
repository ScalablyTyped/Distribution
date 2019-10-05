package typings.atOracleOraclejet.ojdiagramMod

import typings.atOracleOraclejet.Anon_AnimationDuration
import typings.atOracleOraclejet.Anon_Bottom
import typings.atOracleOraclejet.Anon_ComponentNameLabelAndValueLabelClearSelection
import typings.atOracleOraclejet.Anon_ContextRendererAnonInsert
import typings.atOracleOraclejet.Anon_DragDrop
import typings.atOracleOraclejet.Anon_InsertSVGElement
import typings.atOracleOraclejet.atOracleOraclejetStrings.`lazy`
import typings.atOracleOraclejet.atOracleOraclejetStrings.all
import typings.atOracleOraclejet.atOracleOraclejetStrings.any
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.dim
import typings.atOracleOraclejet.atOracleOraclejetStrings.full
import typings.atOracleOraclejet.atOracleOraclejetStrings.link
import typings.atOracleOraclejet.atOracleOraclejetStrings.linkAndNodes
import typings.atOracleOraclejet.atOracleOraclejetStrings.multiple
import typings.atOracleOraclejet.atOracleOraclejetStrings.node
import typings.atOracleOraclejet.atOracleOraclejetStrings.nodeAndIncomingLinks
import typings.atOracleOraclejet.atOracleOraclejetStrings.nodeAndLinks
import typings.atOracleOraclejet.atOracleOraclejetStrings.nodeAndOutgoingLinks
import typings.atOracleOraclejet.atOracleOraclejetStrings.none
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.single
import typings.atOracleOraclejet.atOracleOraclejetStrings.touchStart
import typings.atOracleOraclejet.atOracleOraclejetStrings.x
import typings.atOracleOraclejet.atOracleOraclejetStrings.y
import typings.atOracleOraclejet.ojdataproviderMod.DataProvider
import typings.atOracleOraclejet.ojdiagramMod.ojDiagram.RendererContext
import typings.atOracleOraclejet.ojdvtDashBaseMod.dvtBaseComponentSettableProperties
import typings.atOracleOraclejet.ojkeysetMod.KeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDiagramSettableProperties[K1, K2, D1, D2] extends dvtBaseComponentSettableProperties {
  var animationOnDataChange: auto | none
  var animationOnDisplay: auto | none
  var as: String
  var dnd: Anon_DragDrop
  var expanded: KeySet[K1]
  var focusRenderer: (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
  var hiddenCategories: js.Array[String]
  var highlightMatch: any | all
  var highlightedCategories: js.Array[String]
  var hoverBehavior: dim | none
  var hoverRenderer: (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
  var linkData: (DataProvider[K2, D2]) | Null
  var linkHighlightMode: linkAndNodes | link
  var maxZoom: Double
  var minZoom: Double
  var nodeData: (DataProvider[K1, D1]) | Null
  var nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node
  var overview: Anon_Bottom
  var panDirection: x | y | auto
  var panning: auto | none
  var promotedLinkBehavior: none | full | `lazy`
  var selection: js.Array[K1 | K2]
  var selectionMode: single | multiple | none
  var selectionRenderer: (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
  var styleDefaults: Anon_AnimationDuration
  var tooltip: Anon_ContextRendererAnonInsert[K1, K2, D1, D2]
  var touchResponse: touchStart | auto
  @JSName("translations")
  var translations_ojDiagramSettableProperties: Anon_ComponentNameLabelAndValueLabelClearSelection
  var zoomRenderer: (js.Function1[/* context */ RendererContext[K1, D1], Anon_InsertSVGElement | Unit]) | Null
  var zooming: auto | none
  def layout(param0: DvtDiagramLayoutContext): Unit
  def renderer(context: RendererContext[K1, D1]): Anon_InsertSVGElement
}

object ojDiagramSettableProperties {
  @scala.inline
  def apply[K1, K2, D1, D2](
    animationOnDataChange: auto | none,
    animationOnDisplay: auto | none,
    as: String,
    dnd: Anon_DragDrop,
    expanded: KeySet[K1],
    hiddenCategories: js.Array[String],
    highlightMatch: any | all,
    highlightedCategories: js.Array[String],
    hoverBehavior: dim | none,
    layout: DvtDiagramLayoutContext => Unit,
    linkHighlightMode: linkAndNodes | link,
    maxZoom: Double,
    minZoom: Double,
    nodeHighlightMode: nodeAndIncomingLinks | nodeAndOutgoingLinks | nodeAndLinks | node,
    overview: Anon_Bottom,
    panDirection: x | y | auto,
    panning: auto | none,
    promotedLinkBehavior: none | full | `lazy`,
    renderer: RendererContext[K1, D1] => Anon_InsertSVGElement,
    selection: js.Array[K1 | K2],
    selectionMode: single | multiple | none,
    styleDefaults: Anon_AnimationDuration,
    tooltip: Anon_ContextRendererAnonInsert[K1, K2, D1, D2],
    touchResponse: touchStart | auto,
    trackResize: on | off,
    translations: Anon_ComponentNameLabelAndValueLabelClearSelection,
    zooming: auto | none,
    focusRenderer: /* context */ RendererContext[K1, D1] => Anon_InsertSVGElement | Unit = null,
    hoverRenderer: /* context */ RendererContext[K1, D1] => Anon_InsertSVGElement | Unit = null,
    linkData: DataProvider[K2, D2] = null,
    nodeData: DataProvider[K1, D1] = null,
    selectionRenderer: /* context */ RendererContext[K1, D1] => Anon_InsertSVGElement | Unit = null,
    zoomRenderer: /* context */ RendererContext[K1, D1] => Anon_InsertSVGElement | Unit = null
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

