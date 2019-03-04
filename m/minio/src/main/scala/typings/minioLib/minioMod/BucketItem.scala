package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItem extends js.Object {
  var etag: java.lang.String
  var lastModified: stdLib.Date
  var name: java.lang.String
  var prefix: java.lang.String
  var size: scala.Double
}

object BucketItem {
  @scala.inline
  def apply(
    etag: java.lang.String,
    lastModified: stdLib.Date,
    name: java.lang.String,
    prefix: java.lang.String,
    size: scala.Double
  ): BucketItem = {
    val __obj = js.Dynamic.literal(etag = etag, lastModified = lastModified, name = name, prefix = prefix, size = size)
  
    __obj.asInstanceOf[BucketItem]
  }
}

