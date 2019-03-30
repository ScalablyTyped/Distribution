package typings
package atNivoHeatmapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  def onClick(
    datum: atNivoHeatmapLib.atNivoHeatmapMod.NodeData,
    event: reactLib.reactMod.ReactNs.MouseEvent[stdLib.SVGGElement, reactLib.NativeMouseEvent]
  ): scala.Unit
}

object Anon_Datum {
  @scala.inline
  def apply(
    onClick: (atNivoHeatmapLib.atNivoHeatmapMod.NodeData, reactLib.reactMod.ReactNs.MouseEvent[stdLib.SVGGElement, reactLib.NativeMouseEvent]) => scala.Unit
  ): Anon_Datum = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[Anon_Datum]
  }
}

