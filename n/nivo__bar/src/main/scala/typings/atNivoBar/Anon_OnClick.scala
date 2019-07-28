package typings.atNivoBar

import typings.atNivoBar.atNivoBarMod.BarClickHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnClick extends js.Object {
  var onClick: BarClickHandler
  var pixelRatio: Double
}

object Anon_OnClick {
  @scala.inline
  def apply(onClick: BarClickHandler, pixelRatio: Double): Anon_OnClick = {
    val __obj = js.Dynamic.literal(onClick = onClick, pixelRatio = pixelRatio)
  
    __obj.asInstanceOf[Anon_OnClick]
  }
}

