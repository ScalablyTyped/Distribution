package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRunnergroupsArrayTotalcountNumber extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RunnergroupsArrayTotalcountNumber
}
object ApplicationjsonRunnergroupsArrayTotalcountNumber {
  
  inline def apply(applicationSlashjson: RunnergroupsArrayTotalcountNumber): ApplicationjsonRunnergroupsArrayTotalcountNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRunnergroupsArrayTotalcountNumber]
  }
  
  extension [Self <: ApplicationjsonRunnergroupsArrayTotalcountNumber](x: Self) {
    
    inline def setApplicationSlashjson(value: RunnergroupsArrayTotalcountNumber): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
