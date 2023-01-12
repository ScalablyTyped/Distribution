package typings.openid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Authenticated extends StObject {
    
    var authenticated: Boolean
    
    var claimedIdentifier: js.UndefOr[String] = js.undefined
  }
  object Authenticated {
    
    inline def apply(authenticated: Boolean): Authenticated = {
      val __obj = js.Dynamic.literal(authenticated = authenticated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Authenticated]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Authenticated] (val x: Self) extends AnyVal {
      
      inline def setAuthenticated(value: Boolean): Self = StObject.set(x, "authenticated", value.asInstanceOf[js.Any])
      
      inline def setClaimedIdentifier(value: String): Self = StObject.set(x, "claimedIdentifier", value.asInstanceOf[js.Any])
      
      inline def setClaimedIdentifierUndefined: Self = StObject.set(x, "claimedIdentifier", js.undefined)
    }
  }
}
