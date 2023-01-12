package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerRequest[T] extends StObject {
  
  var headers: Any
  
  var installationId: js.UndefOr[String] = js.undefined
  
  var ip: String
  
  var log: Any
  
  var master: js.UndefOr[Boolean] = js.undefined
  
  var `object`: T
  
  var original: js.UndefOr[T] = js.undefined
  
  var triggerName: String
  
  var user: js.UndefOr[User[Attributes]] = js.undefined
}
object TriggerRequest {
  
  inline def apply[T](headers: Any, ip: String, log: Any, `object`: T, triggerName: String): TriggerRequest[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerRequest[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerRequest[?], T] (val x: Self & TriggerRequest[T]) extends AnyVal {
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setInstallationId(value: String): Self = StObject.set(x, "installationId", value.asInstanceOf[js.Any])
    
    inline def setInstallationIdUndefined: Self = StObject.set(x, "installationId", js.undefined)
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    inline def setLog(value: Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
    
    inline def setObject(value: T): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOriginal(value: T): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
    
    inline def setTriggerName(value: String): Self = StObject.set(x, "triggerName", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User[Attributes]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
