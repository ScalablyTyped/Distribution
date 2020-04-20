package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoescape extends js.Object {
  var autoescape: Boolean
}

object AnonAutoescape {
  @scala.inline
  def apply(autoescape: Boolean): AnonAutoescape = {
    val __obj = js.Dynamic.literal(autoescape = autoescape.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoescape]
  }
}

