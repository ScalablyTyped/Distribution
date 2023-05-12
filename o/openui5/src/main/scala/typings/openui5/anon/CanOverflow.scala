package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanOverflow extends StObject {
  
  var canOverflow: Boolean
  
  var invalidationEvents: js.Array[String]
}
object CanOverflow {
  
  inline def apply(canOverflow: Boolean, invalidationEvents: js.Array[String]): CanOverflow = {
    val __obj = js.Dynamic.literal(canOverflow = canOverflow.asInstanceOf[js.Any], invalidationEvents = invalidationEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanOverflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanOverflow] (val x: Self) extends AnyVal {
    
    inline def setCanOverflow(value: Boolean): Self = StObject.set(x, "canOverflow", value.asInstanceOf[js.Any])
    
    inline def setInvalidationEvents(value: js.Array[String]): Self = StObject.set(x, "invalidationEvents", value.asInstanceOf[js.Any])
    
    inline def setInvalidationEventsVarargs(value: String*): Self = StObject.set(x, "invalidationEvents", js.Array(value*))
  }
}
