package typings
package minioLib.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItemCopy extends js.Object {
  var etag: java.lang.String
  var lastModified: stdLib.Date
}

object BucketItemCopy {
  @scala.inline
  def apply(etag: java.lang.String, lastModified: stdLib.Date): BucketItemCopy = {
    val __obj = js.Dynamic.literal(etag = etag, lastModified = lastModified)
  
    __obj.asInstanceOf[BucketItemCopy]
  }
}

