package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initiator
  extends StObject
     with Identity {
  
  // Type of initiator. Possible values are: user, application, system, unknownFutureValue.
  var initiatorType: js.UndefOr[NullableOption[InitiatorType]] = js.undefined
}
object Initiator {
  
  inline def apply(): Initiator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initiator]
  }
  
  extension [Self <: Initiator](x: Self) {
    
    inline def setInitiatorType(value: NullableOption[InitiatorType]): Self = StObject.set(x, "initiatorType", value.asInstanceOf[js.Any])
    
    inline def setInitiatorTypeNull: Self = StObject.set(x, "initiatorType", null)
    
    inline def setInitiatorTypeUndefined: Self = StObject.set(x, "initiatorType", js.undefined)
  }
}
