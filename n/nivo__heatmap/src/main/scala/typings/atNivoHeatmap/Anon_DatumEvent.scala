package typings.atNivoHeatmap

import typings.atNivoHeatmap.atNivoHeatmapMod.NodeData
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatumEvent extends js.Object {
  var pixelRatio: Double
  def onClick(datum: NodeData, event: MouseEvent[HTMLCanvasElement, NativeMouseEvent]): Unit
}

object Anon_DatumEvent {
  @scala.inline
  def apply(onClick: (NodeData, MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit, pixelRatio: Double): Anon_DatumEvent = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick), pixelRatio = pixelRatio)
  
    __obj.asInstanceOf[Anon_DatumEvent]
  }
}

