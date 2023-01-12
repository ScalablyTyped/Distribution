package typings.p2.anon

import typings.p2.mod.ContactEquation
import typings.p2.mod.FrictionEquation
import typings.p2.p2Strings.preSolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactEquations extends StObject {
  
  var contactEquations: js.Array[ContactEquation]
  
  var frictionEquations: js.Array[FrictionEquation]
  
  var `type`: preSolve
}
object ContactEquations {
  
  inline def apply(contactEquations: js.Array[ContactEquation], frictionEquations: js.Array[FrictionEquation]): ContactEquations = {
    val __obj = js.Dynamic.literal(contactEquations = contactEquations.asInstanceOf[js.Any], frictionEquations = frictionEquations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("preSolve")
    __obj.asInstanceOf[ContactEquations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactEquations] (val x: Self) extends AnyVal {
    
    inline def setContactEquations(value: js.Array[ContactEquation]): Self = StObject.set(x, "contactEquations", value.asInstanceOf[js.Any])
    
    inline def setContactEquationsVarargs(value: ContactEquation*): Self = StObject.set(x, "contactEquations", js.Array(value*))
    
    inline def setFrictionEquations(value: js.Array[FrictionEquation]): Self = StObject.set(x, "frictionEquations", value.asInstanceOf[js.Any])
    
    inline def setFrictionEquationsVarargs(value: FrictionEquation*): Self = StObject.set(x, "frictionEquations", js.Array(value*))
    
    inline def setType(value: preSolve): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
