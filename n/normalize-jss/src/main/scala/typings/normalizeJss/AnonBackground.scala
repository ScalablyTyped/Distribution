package typings.normalizeJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackground extends js.Object {
  var background: String
  var textDecorationSkip: String
}

object AnonBackground {
  @scala.inline
  def apply(background: String, textDecorationSkip: String): AnonBackground = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], textDecorationSkip = textDecorationSkip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackground]
  }
}

