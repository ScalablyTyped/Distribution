package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerRequest extends js.Object {
  
  var headers: js.Any = js.native
  
  var installationId: js.UndefOr[String] = js.native
  
  var ip: String = js.native
  
  var log: js.Any = js.native
  
  var master: js.UndefOr[Boolean] = js.native
  
  var `object`: Object[Attributes] = js.native
  
  var original: js.UndefOr[Object[Attributes]] = js.native
  
  var triggerName: String = js.native
  
  var user: js.UndefOr[User[Attributes]] = js.native
}
object TriggerRequest {
  
  @scala.inline
  def apply(headers: js.Any, ip: String, log: js.Any, `object`: Object[Attributes], triggerName: String): TriggerRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerRequest]
  }
  
  @scala.inline
  implicit class TriggerRequestOps[Self <: TriggerRequest] (val x: Self) extends AnyVal {
    
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
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Object[Attributes]): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerName(value: String): Self = this.set("triggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationId(value: String): Self = this.set("installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstallationId: Self = this.set("installationId", js.undefined)
    
    @scala.inline
    def setMaster(value: Boolean): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaster: Self = this.set("master", js.undefined)
    
    @scala.inline
    def setOriginal(value: Object[Attributes]): Self = this.set("original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
    
    @scala.inline
    def setUser(value: User[Attributes]): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
