package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSyncedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Syncedat
}
object ApplicationjsonSyncedat {
  
  inline def apply(applicationSlashjson: Syncedat): ApplicationjsonSyncedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSyncedat]
  }
  
  extension [Self <: ApplicationjsonSyncedat](x: Self) {
    
    inline def setApplicationSlashjson(value: Syncedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
