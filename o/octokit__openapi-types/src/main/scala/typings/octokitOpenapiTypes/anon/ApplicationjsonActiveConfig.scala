package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonActiveConfig extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ActiveConfig
}
object ApplicationjsonActiveConfig {
  
  inline def apply(applicationSlashjson: ActiveConfig): ApplicationjsonActiveConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonActiveConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonActiveConfig] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: ActiveConfig): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
