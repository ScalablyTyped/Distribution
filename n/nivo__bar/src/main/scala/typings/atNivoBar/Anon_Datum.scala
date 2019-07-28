package typings.atNivoBar

import typings.atNivoBar.atNivoBarMod.BarExtendedDatum
import typings.atNivoBar.atNivoBarMod.Layer
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.SVGRectElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Datum extends js.Object {
  var layers: js.Array[Layer]
  def onClick(datum: BarExtendedDatum, event: MouseEvent[SVGRectElement, NativeMouseEvent]): Unit
}

object Anon_Datum {
  @scala.inline
  def apply(
    layers: js.Array[Layer],
    onClick: (BarExtendedDatum, MouseEvent[SVGRectElement, NativeMouseEvent]) => Unit
  ): Anon_Datum = {
    val __obj = js.Dynamic.literal(layers = layers, onClick = js.Any.fromFunction2(onClick))
  
    __obj.asInstanceOf[Anon_Datum]
  }
}

