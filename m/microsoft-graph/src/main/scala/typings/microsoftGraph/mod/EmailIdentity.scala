package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailIdentity
  extends StObject
     with Identity {
  
  // Email address of the user.
  var email: js.UndefOr[NullableOption[String]] = js.undefined
}
object EmailIdentity {
  
  inline def apply(): EmailIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmailIdentity] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: NullableOption[String]): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
