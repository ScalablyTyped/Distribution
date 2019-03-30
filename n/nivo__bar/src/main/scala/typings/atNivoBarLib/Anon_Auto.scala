package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Auto extends js.Object {
  var axisBottom: atNivoBarLib.atNivoBarMod.Axis = js.native
  var axisLeft: atNivoBarLib.atNivoBarMod.Axis = js.native
  var axisRight: atNivoBarLib.atNivoBarMod.Axis = js.native
  var axisTop: atNivoBarLib.atNivoBarMod.Axis = js.native
  var barComponent: reactLib.reactMod.ReactNs.StatelessComponent[atNivoBarLib.atNivoBarMod.BarItemProps] = js.native
  var borderRadius: scala.Double = js.native
  var borderWidth: scala.Double = js.native
  var enableGridX: scala.Boolean = js.native
  var enableGridY: scala.Boolean = js.native
  var enableLabel: scala.Boolean = js.native
  var groupMode: atNivoBarLib.atNivoBarLibStrings.stacked | atNivoBarLib.atNivoBarLibStrings.grouped = js.native
  var indexBy: java.lang.String | atNivoBarLib.atNivoBarMod.IndexByFunc = js.native
  var innerPadding: scala.Double = js.native
  var isInteractive: scala.Boolean = js.native
  var keys: js.Array[java.lang.String] = js.native
  var label: java.lang.String | atNivoBarLib.atNivoBarMod.AccessorFunc = js.native
  var labelFormat: java.lang.String | atNivoBarLib.atNivoBarMod.LabelFormatter = js.native
  var labelLinkColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoBarLib.atNivoBarMod.BarDatumWithColor] = js.native
  var labelSkipHeight: scala.Double = js.native
  var labelSkipWidth: scala.Double = js.native
  var labelTextColor: java.lang.String | atNivoCoreLib.atNivoCoreMod.GetColor[atNivoBarLib.atNivoBarMod.BarDatumWithColor] = js.native
  var layout: atNivoBarLib.atNivoBarLibStrings.horizontal | atNivoBarLib.atNivoBarLibStrings.vertical = js.native
  var legends: js.Array[Anon_DataFrom with atNivoLegendsLib.atNivoLegendsMod.LegendProps] = js.native
  var margin: atNivoCoreLib.atNivoCoreMod.Box = js.native
  var markers: js.Array[atNivoCoreLib.atNivoCoreMod.CartesianMarkerProps] = js.native
  var maxValue: scala.Double | atNivoBarLib.atNivoBarLibStrings.auto = js.native
  var minValue: scala.Double | atNivoBarLib.atNivoBarLibStrings.auto = js.native
  var padding: scala.Double = js.native
  var reverse: scala.Boolean = js.native
  var theme: atNivoCoreLib.atNivoCoreMod.Theme = js.native
  var tooltipFormat: java.lang.String | atNivoBarLib.atNivoBarMod.ValueFormatter = js.native
  @JSName("tooltip")
  var tooltip_Original: atNivoBarLib.atNivoBarMod.TooltipProp = js.native
  def tooltip(props: reactLib.reactMod.ReactNs.PropsWithChildren[atNivoBarLib.atNivoBarMod.BarExtendedDatum]): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
  def tooltip(
    props: reactLib.reactMod.ReactNs.PropsWithChildren[atNivoBarLib.atNivoBarMod.BarExtendedDatum],
    context: js.Any
  ): reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null = js.native
}

