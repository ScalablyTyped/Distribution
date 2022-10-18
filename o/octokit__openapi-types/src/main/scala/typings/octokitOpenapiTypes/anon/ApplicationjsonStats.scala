package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonStats extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Stats
}
object ApplicationjsonStats {
  
  inline def apply(applicationSlashjson: Stats): ApplicationjsonStats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonStats]
  }
  
  extension [Self <: ApplicationjsonStats](x: Self) {
    
    inline def setApplicationSlashjson(value: Stats): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
