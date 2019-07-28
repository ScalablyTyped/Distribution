package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveItemUploadableProperties extends js.Object {
  // Provides a user-visible description of the item. Read-write. Only on OneDrive Personal
  var description: js.UndefOr[String] = js.undefined
  // File system information on client. Read-write.
  var fileSystemInfo: js.UndefOr[FileSystemInfo] = js.undefined
  // The name of the item (filename and extension). Read-write.
  var name: js.UndefOr[String] = js.undefined
}

object DriveItemUploadableProperties {
  @scala.inline
  def apply(description: String = null, fileSystemInfo: FileSystemInfo = null, name: String = null): DriveItemUploadableProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (fileSystemInfo != null) __obj.updateDynamic("fileSystemInfo")(fileSystemInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DriveItemUploadableProperties]
  }
}

