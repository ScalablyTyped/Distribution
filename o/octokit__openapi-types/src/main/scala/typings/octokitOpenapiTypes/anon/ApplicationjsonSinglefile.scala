package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSinglefile extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Singlefile
}
object ApplicationjsonSinglefile {
  
  inline def apply(applicationSlashjson: Singlefile): ApplicationjsonSinglefile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSinglefile]
  }
  
  extension [Self <: ApplicationjsonSinglefile](x: Self) {
    
    inline def setApplicationSlashjson(value: Singlefile): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
