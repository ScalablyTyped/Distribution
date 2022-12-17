package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMergeable extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Mergeable
}
object ApplicationjsonMergeable {
  
  inline def apply(applicationSlashjson: Mergeable): ApplicationjsonMergeable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMergeable]
  }
  
  extension [Self <: ApplicationjsonMergeable](x: Self) {
    
    inline def setApplicationSlashjson(value: Mergeable): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
