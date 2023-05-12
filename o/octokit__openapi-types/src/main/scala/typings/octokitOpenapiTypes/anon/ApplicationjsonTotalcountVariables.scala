package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTotalcountVariables extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: TotalcountVariables
}
object ApplicationjsonTotalcountVariables {
  
  inline def apply(applicationSlashjson: TotalcountVariables): ApplicationjsonTotalcountVariables = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTotalcountVariables]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonTotalcountVariables] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: TotalcountVariables): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
