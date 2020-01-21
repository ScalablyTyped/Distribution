package typings.officeUiFabricReact.announcedBulkOperationsExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileExampleItem extends js.Object {
  var filesize: String
  var key: String
  var modified: String
  var modifiedby: String
  var name: String
}

object IFileExampleItem {
  @scala.inline
  def apply(filesize: String, key: String, modified: String, modifiedby: String, name: String): IFileExampleItem = {
    val __obj = js.Dynamic.literal(filesize = filesize.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], modifiedby = modifiedby.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileExampleItem]
  }
}

