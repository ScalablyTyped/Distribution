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
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketItem]
  }
}

