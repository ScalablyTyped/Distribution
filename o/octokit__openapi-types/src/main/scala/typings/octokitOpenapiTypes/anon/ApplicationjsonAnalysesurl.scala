package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAnalysesurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Analysesurl
}
object ApplicationjsonAnalysesurl {
  
  inline def apply(applicationSlashjson: Analysesurl): ApplicationjsonAnalysesurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAnalysesurl]
  }
  
  extension [Self <: ApplicationjsonAnalysesurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Analysesurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
