package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBillableWINDOWS extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BillableWINDOWS
}
object ApplicationjsonBillableWINDOWS {
  
  inline def apply(applicationSlashjson: BillableWINDOWS): ApplicationjsonBillableWINDOWS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBillableWINDOWS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBillableWINDOWS] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BillableWINDOWS): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
