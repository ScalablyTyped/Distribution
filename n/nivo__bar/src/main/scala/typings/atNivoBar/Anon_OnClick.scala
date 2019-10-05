package typings.atNivoBar

import typings.atNivoBar.atNivoBarMod.BarClickHandler
import typings.atNivoBar.atNivoBarMod.BarExtendedDatum
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnClick extends js.Object {
  var onClick: BarClickHandler
  var pixelRatio: Double
}

object Anon_OnClick {
  @scala.inline
  def apply(
    onClick: (/* datum */ BarExtendedDatum, /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent]) => Unit,
    pixelRatio: Double
  ): Anon_OnClick = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick), pixelRatio = pixelRatio)
  
    __obj.asInstanceOf[Anon_OnClick]
  }
}

