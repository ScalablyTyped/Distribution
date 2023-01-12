package typings.maximMazurokGapiClientMemcache.gapi.client.memcache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMessage extends StObject {
  
  /** A code that correspond to one type of user-facing message. */
  var code: js.UndefOr[String] = js.undefined
  
  /** Message on memcached instance which will be exposed to users. */
  var message: js.UndefOr[String] = js.undefined
}
object InstanceMessage {
  
  inline def apply(): InstanceMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceMessage] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
