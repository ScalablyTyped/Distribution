package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Createdat
}
object ApplicationjsonCreatedat {
  
  inline def apply(applicationSlashjson: Createdat): ApplicationjsonCreatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedat]
  }
  
  extension [Self <: ApplicationjsonCreatedat](x: Self) {
    
    inline def setApplicationSlashjson(value: Createdat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
