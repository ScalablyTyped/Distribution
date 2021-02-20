package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.Object
import typings.parse.mod.global.Parse.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerRequest extends StObject {
  
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
  implicit class TriggerRequestMutableBuilder[Self <: TriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
    
    @scala.inline
    def setObject(value: Object[Attributes]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginal(value: Object[Attributes]): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
    
    @scala.inline
    def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: User[Attributes]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
