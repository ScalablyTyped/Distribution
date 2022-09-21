package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBasecommit extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Basecommit
}
object ApplicationjsonBasecommit {
  
  inline def apply(applicationSlashjson: Basecommit): ApplicationjsonBasecommit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBasecommit]
  }
  
  extension [Self <: ApplicationjsonBasecommit](x: Self) {
    
    inline def setApplicationSlashjson(value: Basecommit): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
