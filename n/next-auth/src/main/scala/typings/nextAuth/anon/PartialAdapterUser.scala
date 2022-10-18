package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-auth.next-auth/adapters.AdapterUser> */
trait PartialAdapterUser extends StObject {
  
  var email: js.UndefOr[String] = js.undefined
  
  var emailVerified: js.UndefOr[js.Date | Null] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object PartialAdapterUser {
  
  inline def apply(): PartialAdapterUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAdapterUser]
  }
  
  extension [Self <: PartialAdapterUser](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setEmailVerified(value: js.Date): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
    
    inline def setEmailVerifiedNull: Self = StObject.set(x, "emailVerified", null)
    
    inline def setEmailVerifiedUndefined: Self = StObject.set(x, "emailVerified", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
