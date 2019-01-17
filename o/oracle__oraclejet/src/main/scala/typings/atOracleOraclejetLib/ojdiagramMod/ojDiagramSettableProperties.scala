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

