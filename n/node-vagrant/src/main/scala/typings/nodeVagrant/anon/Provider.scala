package typings.nodeVagrant.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  var provider: String
  var status: String
}

object Provider {
  @scala.inline
  def apply(provider: String, status: String): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

