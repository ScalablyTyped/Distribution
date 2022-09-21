package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositorycacheusagesTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: RepositorycacheusagesTotalcount
}
object ApplicationjsonRepositorycacheusagesTotalcount {
  
  inline def apply(applicationSlashjson: RepositorycacheusagesTotalcount): ApplicationjsonRepositorycacheusagesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositorycacheusagesTotalcount]
  }
  
  extension [Self <: ApplicationjsonRepositorycacheusagesTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: RepositorycacheusagesTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
