package typings.novaEditorNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/extension/
trait Extension extends js.Object {
  val globalStoragePath: String
  val identifier: String
  val name: String
  val path: String
  val vendor: String
  val version: String
  val workspaceStoragePath: String
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
}

