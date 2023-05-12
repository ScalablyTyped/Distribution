package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonQuerysuite extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Querysuite
}
object ApplicationjsonQuerysuite {
  
  inline def apply(applicationSlashjson: Querysuite): ApplicationjsonQuerysuite = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonQuerysuite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonQuerysuite] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Querysuite): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
