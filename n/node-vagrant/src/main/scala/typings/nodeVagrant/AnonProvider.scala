package typings.nodeVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvider extends js.Object {
  var provider: String
  var status: String
}

object AnonProvider {
  @scala.inline
  def apply(provider: String, status: String): AnonProvider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProvider]
  }
}

