package typings.minio.minioMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItem extends js.Object {
  var etag: String
  var lastModified: Date
  var name: String
  var prefix: String
  var size: Double
}

object BucketItem {
  @scala.inline
  def apply(etag: String, lastModified: Date, name: String, prefix: String, size: Double): BucketItem = {
    val __obj = js.Dynamic.literal(etag = etag, lastModified = lastModified, name = name, prefix = prefix, size = size)
  
    __obj.asInstanceOf[BucketItem]
  }
}

