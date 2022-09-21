package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLasteditedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Lasteditedat
}
object ApplicationjsonLasteditedat {
  
  inline def apply(applicationSlashjson: Lasteditedat): ApplicationjsonLasteditedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLasteditedat]
  }
  
  extension [Self <: ApplicationjsonLasteditedat](x: Self) {
    
    inline def setApplicationSlashjson(value: Lasteditedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
