package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonConfig extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Config
}
object ApplicationjsonConfig {
  
  inline def apply(applicationSlashjson: Config): ApplicationjsonConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonConfig] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Config): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
