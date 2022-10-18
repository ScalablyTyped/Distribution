package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<next-auth.next-auth/adapters.AdapterUser, 'id'> */
trait OmitAdapterUserid extends StObject {
  
  var email: String
  
  var emailVerified: js.UndefOr[js.Date | Null] = js.undefined
  
  var image: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object OmitAdapterUserid {
  
  inline def apply(email: String): OmitAdapterUserid = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitAdapterUserid]
  }
  
  extension [Self <: OmitAdapterUserid](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailVerified(value: js.Date): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedNull: Self = StObject.set(x, "emailVerified", null)
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
