package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreditsdetailed extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Creditsdetailed
}
object ApplicationjsonCreditsdetailed {
  
  inline def apply(applicationSlashjson: Creditsdetailed): ApplicationjsonCreditsdetailed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreditsdetailed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCreditsdetailed] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Creditsdetailed): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
