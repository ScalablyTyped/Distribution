package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMeta extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Meta
}
object ApplicationjsonMeta {
  
  inline def apply(applicationSlashjson: Meta): ApplicationjsonMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMeta]
  }
  
  extension [Self <: ApplicationjsonMeta](x: Self) {
    
    inline def setApplicationSlashjson(value: Meta): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
