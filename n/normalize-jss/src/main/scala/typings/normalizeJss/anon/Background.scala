package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Background extends js.Object {
  var background: String
  var textDecorationSkip: String
}

object Background {
  @scala.inline
  def apply(background: String, textDecorationSkip: String): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], textDecorationSkip = textDecorationSkip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
}

