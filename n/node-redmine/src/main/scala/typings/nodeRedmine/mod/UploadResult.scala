package typings.nodeRedmine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadResult extends js.Object {
  var upload: UploadRecord
}

object UploadResult {
  @scala.inline
  def apply(upload: UploadRecord): UploadResult = {
    val __obj = js.Dynamic.literal(upload = upload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadResult]
  }
}

