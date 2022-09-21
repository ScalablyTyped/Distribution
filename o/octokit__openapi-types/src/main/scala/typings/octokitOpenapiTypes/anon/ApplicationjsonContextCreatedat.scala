package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContextCreatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ContextCreatedat
}
object ApplicationjsonContextCreatedat {
  
  inline def apply(applicationSlashjson: ContextCreatedat): ApplicationjsonContextCreatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContextCreatedat]
  }
  
  extension [Self <: ApplicationjsonContextCreatedat](x: Self) {
    
    inline def setApplicationSlashjson(value: ContextCreatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
