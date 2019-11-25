package typings.nodeDashPersist.nodeDashPersistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileResult extends js.Object {
  var existed: Boolean
  var file: String
  var removed: Boolean
}

object DeleteFileResult {
  @scala.inline
  def apply(existed: Boolean, file: String, removed: Boolean): DeleteFileResult = {
    val __obj = js.Dynamic.literal(existed = existed.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteFileResult]
  }
}

