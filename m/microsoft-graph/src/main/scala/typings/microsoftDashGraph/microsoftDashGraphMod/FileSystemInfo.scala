package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemInfo extends js.Object {
  // The UTC date and time the file was created on a client.
  var createdDateTime: js.UndefOr[String] = js.undefined
  // The UTC date and time the file was last accessed. Available for the recent file list only.
  var lastAccessedDateTime: js.UndefOr[String] = js.undefined
  // The UTC date and time the file was last modified on a client.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
}

object FileSystemInfo {
  @scala.inline
  def apply(
    createdDateTime: String = null,
    lastAccessedDateTime: String = null,
    lastModifiedDateTime: String = null
  ): FileSystemInfo = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (lastAccessedDateTime != null) __obj.updateDynamic("lastAccessedDateTime")(lastAccessedDateTime.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemInfo]
  }
}

