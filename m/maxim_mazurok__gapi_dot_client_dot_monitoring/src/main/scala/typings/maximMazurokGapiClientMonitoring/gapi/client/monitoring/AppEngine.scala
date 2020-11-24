package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppEngine extends js.Object {
  
  /**
    * The ID of the App Engine module underlying this service. Corresponds to the module_id resource label in the gae_app monitored resource:
    * https://cloud.google.com/monitoring/api/resources#tag_gae_app
    */
  var moduleId: js.UndefOr[String] = js.native
}
object AppEngine {
  
  @scala.inline
  def apply(): AppEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEngine]
  }
  
  @scala.inline
  implicit class AppEngineOps[Self <: AppEngine] (val x: Self) extends AnyVal {
    
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
    def setModuleId(value: String): Self = this.set("moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModuleId: Self = this.set("moduleId", js.undefined)
  }
}
