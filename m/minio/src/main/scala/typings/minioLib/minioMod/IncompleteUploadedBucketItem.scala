package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncompleteUploadedBucketItem extends js.Object {
  var key: java.lang.String
  var size: scala.Double
  var uploadId: java.lang.String
}

object IncompleteUploadedBucketItem {
  @scala.inline
  def apply(key: java.lang.String, size: scala.Double, uploadId: java.lang.String): IncompleteUploadedBucketItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("uploadId")(uploadId)
    __obj.asInstanceOf[IncompleteUploadedBucketItem]
  }
}

