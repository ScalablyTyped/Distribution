package typings.pkgcloud.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  // files: ?
  var client: Client
}

object Container {
  @scala.inline
  def apply(client: Client): Container = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

