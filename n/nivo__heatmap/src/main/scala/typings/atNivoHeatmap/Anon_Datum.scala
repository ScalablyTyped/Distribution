package typings.atNivoHeatmap

import typings.atNivoHeatmap.atNivoHeatmapMod.NodeData
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  def onClick(datum: NodeData, event: MouseEvent[SVGGElement, NativeMouseEvent]): Unit
}

object Anon_Datum {
  @scala.inline
  def apply(onClick: (NodeData, MouseEvent[SVGGElement, NativeMouseEvent]) => Unit): Anon_Datum = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[Anon_Datum]
  }
}

