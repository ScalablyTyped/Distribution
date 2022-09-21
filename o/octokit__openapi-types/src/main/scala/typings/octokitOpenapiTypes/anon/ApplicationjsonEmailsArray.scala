package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEmailsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: EmailsArray
}
object ApplicationjsonEmailsArray {
  
  inline def apply(applicationSlashjson: EmailsArray): ApplicationjsonEmailsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEmailsArray]
  }
  
  extension [Self <: ApplicationjsonEmailsArray](x: Self) {
    
    inline def setApplicationSlashjson(value: EmailsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
