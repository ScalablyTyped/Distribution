package typings.minio.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncompleteUploadedBucketItem extends js.Object {
  var key: String
  var size: Double
  var uploadId: String
}

object IncompleteUploadedBucketItem {
  @scala.inline
  def apply(key: String, size: Double, uploadId: String): IncompleteUploadedBucketItem = {
    val __obj = js.Dynamic.literal(key = key, size = size, uploadId = uploadId)
  
    __obj.asInstanceOf[IncompleteUploadedBucketItem]
  }
}

