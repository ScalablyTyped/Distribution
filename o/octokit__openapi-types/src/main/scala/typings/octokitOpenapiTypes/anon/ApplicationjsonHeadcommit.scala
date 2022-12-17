package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonHeadcommit extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Headcommit
}
object ApplicationjsonHeadcommit {
  
  inline def apply(applicationSlashjson: Headcommit): ApplicationjsonHeadcommit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonHeadcommit]
  }
  
  extension [Self <: ApplicationjsonHeadcommit](x: Self) {
    
    inline def setApplicationSlashjson(value: Headcommit): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
