package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItemStat extends js.Object {
  var etag: java.lang.String
  var lastModified: stdLib.Date
  var metaData: ItemBucketMetadata
  var size: scala.Double
}

object BucketItemStat {
  @scala.inline
  def apply(
    etag: java.lang.String,
    lastModified: stdLib.Date,
    metaData: ItemBucketMetadata,
    size: scala.Double
  ): BucketItemStat = {
    val __obj = js.Dynamic.literal(etag = etag, lastModified = lastModified, metaData = metaData, size = size)
  
    __obj.asInstanceOf[BucketItemStat]
  }
}

