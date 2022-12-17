package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContactemail extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Contactemail
}
object ApplicationjsonContactemail {
  
  inline def apply(applicationSlashjson: Contactemail): ApplicationjsonContactemail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContactemail]
  }
  
  extension [Self <: ApplicationjsonContactemail](x: Self) {
    
    inline def setApplicationSlashjson(value: Contactemail): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
