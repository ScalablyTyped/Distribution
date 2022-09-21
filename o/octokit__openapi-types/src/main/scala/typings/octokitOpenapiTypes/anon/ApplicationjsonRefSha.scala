package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRefSha extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RefSha
}
object ApplicationjsonRefSha {
  
  inline def apply(applicationSlashjson: RefSha): ApplicationjsonRefSha = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRefSha]
  }
  
  extension [Self <: ApplicationjsonRefSha](x: Self) {
    
    inline def setApplicationSlashjson(value: RefSha): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
