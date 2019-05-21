package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnClick extends js.Object {
  var onClick: atNivoBarLib.atNivoBarMod.BarClickHandler
  var pixelRatio: scala.Double
}

object Anon_OnClick {
  @scala.inline
  def apply(onClick: atNivoBarLib.atNivoBarMod.BarClickHandler, pixelRatio: scala.Double): Anon_OnClick = {
    val __obj = js.Dynamic.literal(onClick = onClick, pixelRatio = pixelRatio)
  
    __obj.asInstanceOf[Anon_OnClick]
  }
}

