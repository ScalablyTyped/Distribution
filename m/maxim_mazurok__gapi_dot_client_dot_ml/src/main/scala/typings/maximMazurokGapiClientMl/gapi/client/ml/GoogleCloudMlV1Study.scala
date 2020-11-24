package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Study extends js.Object {
  
  /** Output only. Time at which the study was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. A human readable reason why the Study is inactive. This should be empty if a study is ACTIVE or COMPLETED. */
  var inactiveReason: js.UndefOr[String] = js.native
  
  /** Output only. The name of a study. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The detailed state of a study. */
  var state: js.UndefOr[String] = js.native
  
  /** Required. Configuration of the study. */
  var studyConfig: js.UndefOr[GoogleCloudMlV1StudyConfig] = js.native
}
object GoogleCloudMlV1Study {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Study = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Study]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1StudyOps[Self <: GoogleCloudMlV1Study] (val x: Self) extends AnyVal {
    
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
    def setInactiveReason(value: String): Self = this.set("inactiveReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInactiveReason: Self = this.set("inactiveReason", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStudyConfig(value: GoogleCloudMlV1StudyConfig): Self = this.set("studyConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudyConfig: Self = this.set("studyConfig", js.undefined)
  }
}
