package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemInfo extends js.Object {
  // The UTC date and time the file was created on a client.
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The UTC date and time the file was last accessed. Available for the recent file list only.
  var lastAccessedDateTime: js.UndefOr[java.lang.String] = js.undefined
  // The UTC date and time the file was last modified on a client.
  var lastModifiedDateTime: js.UndefOr[java.lang.String] = js.undefined
}

object FileSystemInfo {
  @scala.inline
  def apply(
    createdDateTime: java.lang.String = null,
    lastAccessedDateTime: java.lang.String = null,
    lastModifiedDateTime: java.lang.String = null
  ): FileSystemInfo = {
    val __obj = js.Dynamic.literal()
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (lastAccessedDateTime != null) __obj.updateDynamic("lastAccessedDateTime")(lastAccessedDateTime)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    __obj.asInstanceOf[FileSystemInfo]
  }
}

