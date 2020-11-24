package typings.maximMazurokGapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GdataObjectId extends js.Object {
  
  /** gdata */
  var bucketName: js.UndefOr[String] = js.native
  
  /** gdata */
  var generation: js.UndefOr[String] = js.native
  
  /** gdata */
  var objectName: js.UndefOr[String] = js.native
}
object GdataObjectId {
  
  @scala.inline
  def apply(): GdataObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GdataObjectId]
  }
  
  @scala.inline
  implicit class GdataObjectIdOps[Self <: GdataObjectId] (val x: Self) extends AnyVal {
    
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
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setObjectName(value: String): Self = this.set("objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectName: Self = this.set("objectName", js.undefined)
  }
}
