package typings.minio.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketItemStat extends js.Object {
  
  var etag: String = js.native
  
  var lastModified: Date = js.native
  
  var metaData: ItemBucketMetadata = js.native
  
  var size: Double = js.native
}
object BucketItemStat {
  
  @scala.inline
  def apply(etag: String, lastModified: Date, metaData: ItemBucketMetadata, size: Double): BucketItemStat = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketItemStat]
  }
  
  @scala.inline
  implicit class BucketItemStatOps[Self <: BucketItemStat] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setMetaData(value: ItemBucketMetadata): Self = this.set("metaData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
