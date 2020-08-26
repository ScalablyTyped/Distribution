package typings.pkgcloud.mod.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait File extends js.Object {
  var client: Client = js.native
  var container: String = js.native
  var name: String = js.native
  var size: Double = js.native
}

object File {
  @scala.inline
  def apply(client: Client, container: String, name: String, size: Double): File = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClient(value: Client): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

