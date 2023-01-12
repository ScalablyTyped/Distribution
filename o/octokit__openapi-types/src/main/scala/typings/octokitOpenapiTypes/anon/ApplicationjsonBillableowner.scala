package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBillableowner extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Billableowner
}
object ApplicationjsonBillableowner {
  
  inline def apply(applicationSlashjson: Billableowner): ApplicationjsonBillableowner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBillableowner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBillableowner] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Billableowner): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
