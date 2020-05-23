package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsEnabled extends js.Object {
  var isEnabled: Boolean
  var rootTagName: String
}

object IsEnabled {
  @scala.inline
  def apply(isEnabled: Boolean, rootTagName: String): IsEnabled = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], rootTagName = rootTagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEnabled]
  }
}

