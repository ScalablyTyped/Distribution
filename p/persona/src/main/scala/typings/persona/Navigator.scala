package typings.persona

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  var id: typings.persona.Persona.Persona
}
object Navigator {
  
  inline def apply(id: typings.persona.Persona.Persona): Navigator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setId(value: typings.persona.Persona.Persona): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
