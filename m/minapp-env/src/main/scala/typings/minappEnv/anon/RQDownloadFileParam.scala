package typings.minappEnv.anon

import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined minapp-env.RQ<minapp-env.ICloud.DownloadFileParam> */
@js.native
trait RQDownloadFileParam extends js.Object {
  
  var cloudPath: js.UndefOr[String] = js.native
  
  var config: js.UndefOr[ICloudConfig] = js.native
  
  var fileID: String = js.native
}
object RQDownloadFileParam {
  
  @scala.inline
  def apply(fileID: String): RQDownloadFileParam = {
    val __obj = js.Dynamic.literal(fileID = fileID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQDownloadFileParam]
  }
  
  @scala.inline
  implicit class RQDownloadFileParamOps[Self <: RQDownloadFileParam] (val x: Self) extends AnyVal {
    
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
    def setFileID(value: String): Self = this.set("fileID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudPath(value: String): Self = this.set("cloudPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudPath: Self = this.set("cloudPath", js.undefined)
    
    @scala.inline
    def setConfig(value: ICloudConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
  }
}
