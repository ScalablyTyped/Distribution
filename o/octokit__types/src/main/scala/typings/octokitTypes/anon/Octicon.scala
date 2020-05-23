package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Octicon extends js.Object {
  var message: String
  var octicon: String
}

object Octicon {
  @scala.inline
  def apply(message: String, octicon: String): Octicon = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], octicon = octicon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Octicon]
  }
}

