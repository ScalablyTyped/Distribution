package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonChecksContexts extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ChecksContexts
}
object ApplicationjsonChecksContexts {
  
  inline def apply(applicationSlashjson: ChecksContexts): ApplicationjsonChecksContexts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonChecksContexts]
  }
  
  extension [Self <: ApplicationjsonChecksContexts](x: Self) {
    
    inline def setApplicationSlashjson(value: ChecksContexts): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
