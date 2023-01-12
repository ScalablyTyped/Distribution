package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DDPRateLimiter {
  
  trait Matcher extends StObject {
    
    var clientAddress: js.UndefOr[String | (js.Function1[/* clientAddress */ String, Boolean])] = js.undefined
    
    var connectionId: js.UndefOr[String | (js.Function1[/* connectionId */ String, Boolean])] = js.undefined
    
    var name: js.UndefOr[String | (js.Function1[/* name */ String, Boolean])] = js.undefined
    
    var `type`: js.UndefOr[String | (js.Function1[/* type */ String, Boolean])] = js.undefined
    
    var userId: js.UndefOr[String | (js.Function1[/* userId */ String, Boolean])] = js.undefined
  }
  object Matcher {
    
    inline def apply(): Matcher = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Matcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Matcher] (val x: Self) extends AnyVal {
      
      inline def setClientAddress(value: String | (js.Function1[/* clientAddress */ String, Boolean])): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
      
      inline def setClientAddressFunction1(value: /* clientAddress */ String => Boolean): Self = StObject.set(x, "clientAddress", js.Any.fromFunction1(value))
      
      inline def setClientAddressUndefined: Self = StObject.set(x, "clientAddress", js.undefined)
      
      inline def setConnectionId(value: String | (js.Function1[/* connectionId */ String, Boolean])): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      inline def setConnectionIdFunction1(value: /* connectionId */ String => Boolean): Self = StObject.set(x, "connectionId", js.Any.fromFunction1(value))
      
      inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
      
      inline def setName(value: String | (js.Function1[/* name */ String, Boolean])): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameFunction1(value: /* name */ String => Boolean): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String | (js.Function1[/* type */ String, Boolean])): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeFunction1(value: /* type */ String => Boolean): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUserId(value: String | (js.Function1[/* userId */ String, Boolean])): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdFunction1(value: /* userId */ String => Boolean): Self = StObject.set(x, "userId", js.Any.fromFunction1(value))
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
}
