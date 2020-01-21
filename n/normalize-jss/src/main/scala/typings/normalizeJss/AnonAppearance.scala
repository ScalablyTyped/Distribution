package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAppearance extends js.Object {
  var appearance: String
  var font: String
}

object AnonAppearance {
  @scala.inline
  def apply(appearance: String, font: String): AnonAppearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAppearance]
  }
}

