package typings.pkgcloud.pkgcloudMod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var client: Client
  var container: String
  var name: String
  var size: Double
}

object File {
  @scala.inline
  def apply(client: Client, container: String, name: String, size: Double): File = {
    val __obj = js.Dynamic.literal(client = client, container = container, name = name, size = size)
  
    __obj.asInstanceOf[File]
  }
}

