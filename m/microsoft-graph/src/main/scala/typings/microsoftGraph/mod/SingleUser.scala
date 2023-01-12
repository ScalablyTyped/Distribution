package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleUser
  extends StObject
     with SubjectSet {
  
  // The name of the user in Azure AD. Read only.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the user in Azure AD.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SingleUser {
  
  inline def apply(): SingleUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleUser] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
