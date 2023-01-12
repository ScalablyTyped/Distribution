package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Realm extends StObject {
  
  var realm: js.UndefOr[String] = js.undefined
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var sessionId: js.UndefOr[String] = js.undefined
  
  var waitTimeout: js.UndefOr[Double] = js.undefined
}
object Realm {
  
  inline def apply(): Realm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Realm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Realm] (val x: Self) extends AnyVal {
    
    inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
    
    inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
    
    inline def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setWaitTimeout(value: Double): Self = StObject.set(x, "waitTimeout", value.asInstanceOf[js.Any])
    
    inline def setWaitTimeoutUndefined: Self = StObject.set(x, "waitTimeout", js.undefined)
  }
}
