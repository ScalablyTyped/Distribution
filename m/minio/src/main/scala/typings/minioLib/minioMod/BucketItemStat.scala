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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("lastModified")(lastModified)
    __obj.updateDynamic("metaData")(metaData)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[BucketItemStat]
  }
}

