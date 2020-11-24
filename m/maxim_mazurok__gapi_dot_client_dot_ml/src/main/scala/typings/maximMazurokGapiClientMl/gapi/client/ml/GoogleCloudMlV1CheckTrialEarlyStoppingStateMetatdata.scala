package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata extends js.Object {
  
  /** The time at which the operation was submitted. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The name of the study that the trial belongs to. */
  var study: js.UndefOr[String] = js.native
  
  /** The trial name. */
  var trial: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata {
  
  @scala.inline
  def apply(): GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdataOps[Self <: GoogleCloudMlV1CheckTrialEarlyStoppingStateMetatdata] (val x: Self) extends AnyVal {
    
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
    def setStudy(value: String): Self = this.set("study", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudy: Self = this.set("study", js.undefined)
    
    @scala.inline
    def setTrial(value: String): Self = this.set("trial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrial: Self = this.set("trial", js.undefined)
  }
}
