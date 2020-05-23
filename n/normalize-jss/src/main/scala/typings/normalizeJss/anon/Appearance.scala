package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appearance extends js.Object {
  var appearance: String
  var font: String
}

object Appearance {
  @scala.inline
  def apply(appearance: String, font: String): Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearance]
  }
}

