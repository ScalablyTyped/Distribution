package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCompany extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Company
}
object ApplicationjsonCompany {
  
  inline def apply(applicationSlashjson: Company): ApplicationjsonCompany = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCompany]
  }
  
  extension [Self <: ApplicationjsonCompany](x: Self) {
    
    inline def setApplicationSlashjson(value: Company): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
