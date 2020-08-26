package typings.minio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncompleteUploadedBucketItem extends js.Object {
  var key: String = js.native
  var size: Double = js.native
  var uploadId: String = js.native
}

object IncompleteUploadedBucketItem {
  @scala.inline
  def apply(key: String, size: Double, uploadId: String): IncompleteUploadedBucketItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncompleteUploadedBucketItem]
  }
  @scala.inline
  implicit class IncompleteUploadedBucketItemOps[Self <: IncompleteUploadedBucketItem] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
  }
  
}

