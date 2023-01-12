package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rate extends StObject {
  
  var rate: Remaining
  
  var resources: Actionsrunnerregistration
}
object Rate {
  
  inline def apply(rate: Remaining, resources: Actionsrunnerregistration): Rate = {
    val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rate] (val x: Self) extends AnyVal {
    
    inline def setRate(value: Remaining): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setResources(value: Actionsrunnerregistration): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
  }
}
