package typings.msRestAzure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedUser extends StObject {
  
  /**
    * The user name. This could be a display name or a GUID.
    */
  var name: String
  
  /**
    * The user type: 'user', 'servicePrincipal'.
    */
  var `type`: UserType
}
object LinkedUser {
  
  inline def apply(name: String, `type`: UserType): LinkedUser = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedUser] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: UserType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
