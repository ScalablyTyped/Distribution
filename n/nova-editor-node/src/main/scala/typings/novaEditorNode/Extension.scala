package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/extension/
@js.native
trait Extension extends js.Object {
  val globalStoragePath: String = js.native
  val identifier: String = js.native
  val name: String = js.native
  val path: String = js.native
  val vendor: String = js.native
  val version: String = js.native
  val workspaceStoragePath: String = js.native
}

object Extension {
  @scala.inline
  def apply(
    globalStoragePath: String,
    identifier: String,
    name: String,
    path: String,
    vendor: String,
    version: String,
    workspaceStoragePath: String
  ): Extension = {
    val __obj = js.Dynamic.literal(globalStoragePath = globalStoragePath.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], workspaceStoragePath = workspaceStoragePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
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
    def setGlobalStoragePath(value: String): Self = this.set("globalStoragePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendor(value: String): Self = this.set("vendor", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspaceStoragePath(value: String): Self = this.set("workspaceStoragePath", value.asInstanceOf[js.Any])
  }
  
}

