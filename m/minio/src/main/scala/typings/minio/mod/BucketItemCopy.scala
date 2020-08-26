package typings.minio.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketItemCopy extends js.Object {
  var etag: String = js.native
  var lastModified: Date = js.native
}

object BucketItemCopy {
  @scala.inline
  def apply(etag: String, lastModified: Date): BucketItemCopy = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketItemCopy]
  }
  @scala.inline
  implicit class BucketItemCopyOps[Self <: BucketItemCopy] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModified(value: Date): Self = this.set("lastModified", value.asInstanceOf[js.Any])
  }
  
}

