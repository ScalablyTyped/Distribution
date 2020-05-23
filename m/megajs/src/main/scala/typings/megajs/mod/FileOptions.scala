package typings.megajs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var directory: js.UndefOr[Boolean] = js.undefined
  var downloadId: String
  var key: String
}

object FileOptions {
  @scala.inline
  def apply(downloadId: String, key: String, directory: js.UndefOr[Boolean] = js.undefined): FileOptions = {
    val __obj = js.Dynamic.literal(downloadId = downloadId.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

