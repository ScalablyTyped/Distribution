package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Registrations extends StObject {
  
  var __typename: String
  
  var registrations: js.Array[Domain]
}
object Registrations {
  
  inline def apply(__typename: String, registrations: js.Array[Domain]): Registrations = {
    val __obj = js.Dynamic.literal(__typename = __typename.asInstanceOf[js.Any], registrations = registrations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Registrations]
  }
  
  extension [Self <: Registrations](x: Self) {
    
    inline def setRegistrations(value: js.Array[Domain]): Self = StObject.set(x, "registrations", value.asInstanceOf[js.Any])
    
    inline def setRegistrationsVarargs(value: Domain*): Self = StObject.set(x, "registrations", js.Array(value*))
    
    inline def set__typename(value: String): Self = StObject.set(x, "__typename", value.asInstanceOf[js.Any])
  }
}
