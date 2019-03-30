package typings
package atNivoHeatmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatumEvent extends js.Object {
  var pixelRatio: scala.Double
  def onClick(
    datum: atNivoHeatmapLib.atNivoHeatmapMod.NodeData,
    event: reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object Anon_DatumEvent {
  @scala.inline
  def apply(
    onClick: (atNivoHeatmapLib.atNivoHeatmapMod.NodeData, reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent]) => scala.Unit,
    pixelRatio: scala.Double
  ): Anon_DatumEvent = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick), pixelRatio = pixelRatio)
  
    __obj.asInstanceOf[Anon_DatumEvent]
  }
}

