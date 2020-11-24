package typings.mendixmodelsdk.anon

import typings.mendixmodelsdk.mendixmodelsdkStrings.Licensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.Sandbox
import typings.mendixmodelsdk.mendixmodelsdkStrings.Unlicensed
import typings.mendixmodelsdk.mendixmodelsdkStrings.success_
import typings.mendixmodelsdk.transportInterfacesMod.IBuildError
import typings.mendixmodelsdk.transportInterfacesMod.IEnvironmentStatus
import typings.mendixmodelsdk.transportInterfacesMod.IProblem
import typings.mendixmodelsdk.transportInterfacesMod.SuccessAppState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppType extends IEnvironmentStatus {
  
  var appType: js.UndefOr[Licensed | Unlicensed | Sandbox] = js.native
  
  var buildErrors: js.UndefOr[js.Array[IBuildError]] = js.native
  
  var buildstatus: String | Null = js.native
  
  var consistencyErrors: js.UndefOr[js.Array[IProblem]] = js.native
  
  var disk: Double = js.native
  
  var endpoint: String = js.native
  
  var environmentId: String = js.native
  
  var instances: Double = js.native
  
  var memory: Double = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var profile: String = js.native
  
  var state: SuccessAppState = js.native
  
  var `type`: success_ = js.native
  
  var url: String = js.native
}
object AppType {
  
  @scala.inline
  def apply(
    disk: Double,
    endpoint: String,
    environmentId: String,
    instances: Double,
    memory: Double,
    name: String,
    profile: String,
    state: SuccessAppState,
    `type`: success_,
    url: String
  ): AppType = {
    val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppType]
  }
  
  @scala.inline
  implicit class AppTypeOps[Self <: AppType] (val x: Self) extends AnyVal {
    
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
    def setDisk(value: Double): Self = this.set("disk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentId(value: String): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: Double): Self = this.set("instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemory(value: Double): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SuccessAppState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: success_): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppType(value: Licensed | Unlicensed | Sandbox): Self = this.set("appType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppType: Self = this.set("appType", js.undefined)
    
    @scala.inline
    def setBuildErrorsVarargs(value: IBuildError*): Self = this.set("buildErrors", js.Array(value :_*))
    
    @scala.inline
    def setBuildErrors(value: js.Array[IBuildError]): Self = this.set("buildErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildErrors: Self = this.set("buildErrors", js.undefined)
    
    @scala.inline
    def setBuildstatus(value: String): Self = this.set("buildstatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildstatusNull: Self = this.set("buildstatus", null)
    
    @scala.inline
    def setConsistencyErrorsVarargs(value: IProblem*): Self = this.set("consistencyErrors", js.Array(value :_*))
    
    @scala.inline
    def setConsistencyErrors(value: js.Array[IProblem]): Self = this.set("consistencyErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsistencyErrors: Self = this.set("consistencyErrors", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
}
