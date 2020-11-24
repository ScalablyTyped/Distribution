package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReleaseExecutableResponse extends js.Object {
  
  /** Executable view of the `Ruleset` referenced by the `Release`. */
  var executable: js.UndefOr[String] = js.native
  
  /** The Rules runtime version of the executable. */
  var executableVersion: js.UndefOr[String] = js.native
  
  /** `Language` used to generate the executable bytes. */
  var language: js.UndefOr[String] = js.native
  
  /** `Ruleset` name associated with the `Release` executable. */
  var rulesetName: js.UndefOr[String] = js.native
  
  /** Optional, indicates the freshness of the result. The response is guaranteed to be the latest within an interval up to the sync_time (inclusive). */
  var syncTime: js.UndefOr[String] = js.native
  
  /** Timestamp for the most recent `Release.update_time`. */
  var updateTime: js.UndefOr[String] = js.native
}
object GetReleaseExecutableResponse {
  
  @scala.inline
  def apply(): GetReleaseExecutableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReleaseExecutableResponse]
  }
  
  @scala.inline
  implicit class GetReleaseExecutableResponseOps[Self <: GetReleaseExecutableResponse] (val x: Self) extends AnyVal {
    
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
    def setExecutable(value: String): Self = this.set("executable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutable: Self = this.set("executable", js.undefined)
    
    @scala.inline
    def setExecutableVersion(value: String): Self = this.set("executableVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutableVersion: Self = this.set("executableVersion", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setRulesetName(value: String): Self = this.set("rulesetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRulesetName: Self = this.set("rulesetName", js.undefined)
    
    @scala.inline
    def setSyncTime(value: String): Self = this.set("syncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncTime: Self = this.set("syncTime", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
