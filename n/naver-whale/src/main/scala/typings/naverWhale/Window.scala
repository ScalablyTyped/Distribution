package typings.naverWhale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var whale: Typeofwhale
}

object Window {
  @scala.inline
  def apply(whale: Typeofwhale): Window = {
    val __obj = js.Dynamic.literal(whale = whale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

