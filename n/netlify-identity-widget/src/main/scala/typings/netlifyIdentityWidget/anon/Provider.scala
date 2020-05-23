package typings.netlifyIdentityWidget.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider extends js.Object {
  var provider: String
}

object Provider {
  @scala.inline
  def apply(provider: String): Provider = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[Provider]
  }
}

