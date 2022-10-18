package typings.nextAuth.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultUser extends StObject {
  
  var email: js.UndefOr[String | Null] = js.undefined
  
  var id: String
  
  var image: js.UndefOr[String | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
}
object DefaultUser {
  
  inline def apply(id: String): DefaultUser = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUser]
  }
  
  extension [Self <: DefaultUser](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
