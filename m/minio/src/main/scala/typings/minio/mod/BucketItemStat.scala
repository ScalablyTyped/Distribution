package typings.minio.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItemStat extends js.Object {
  var etag: String
  var lastModified: Date
  var metaData: ItemBucketMetadata
  var size: Double
}

object BucketItemStat {
  @scala.inline
  def apply(etag: String, lastModified: Date, metaData: ItemBucketMetadata, size: Double): BucketItemStat = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketItemStat]
  }
}

