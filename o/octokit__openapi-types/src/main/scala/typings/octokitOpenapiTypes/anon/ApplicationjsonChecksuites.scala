package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonChecksuites extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Checksuites
}
object ApplicationjsonChecksuites {
  
  inline def apply(applicationSlashjson: Checksuites): ApplicationjsonChecksuites = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonChecksuites]
  }
  
  extension [Self <: ApplicationjsonChecksuites](x: Self) {
    
    inline def setApplicationSlashjson(value: Checksuites): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
