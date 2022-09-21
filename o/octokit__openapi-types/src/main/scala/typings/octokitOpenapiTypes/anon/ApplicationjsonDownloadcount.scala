package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDownloadcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Downloadcount
}
object ApplicationjsonDownloadcount {
  
  inline def apply(applicationSlashjson: Downloadcount): ApplicationjsonDownloadcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDownloadcount]
  }
  
  extension [Self <: ApplicationjsonDownloadcount](x: Self) {
    
    inline def setApplicationSlashjson(value: Downloadcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
