package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SdfDownloadTaskMetadata extends js.Object {
  
  /** The time when the operation was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The time when execution was completed. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The SDF version used to execute this download task. */
  var version: js.UndefOr[String] = js.native
}
object SdfDownloadTaskMetadata {
  
  @scala.inline
  def apply(): SdfDownloadTaskMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdfDownloadTaskMetadata]
  }
  
  @scala.inline
  implicit class SdfDownloadTaskMetadataOps[Self <: SdfDownloadTaskMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
