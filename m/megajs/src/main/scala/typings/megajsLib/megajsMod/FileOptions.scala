package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var directory: js.UndefOr[scala.Boolean] = js.undefined
  var downloadId: java.lang.String
  var key: java.lang.String
}

object FileOptions {
  @scala.inline
  def apply(
    downloadId: java.lang.String,
    key: java.lang.String,
    directory: js.UndefOr[scala.Boolean] = js.undefined
  ): FileOptions = {
    val __obj = js.Dynamic.literal(downloadId = downloadId, key = key)
    if (!js.isUndefined(directory)) __obj.updateDynamic("directory")(directory)
    __obj.asInstanceOf[FileOptions]
  }
}

