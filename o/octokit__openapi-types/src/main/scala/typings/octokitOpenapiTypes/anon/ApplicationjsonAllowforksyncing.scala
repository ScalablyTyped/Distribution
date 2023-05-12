package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowforksyncing extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowforksyncing
}
object ApplicationjsonAllowforksyncing {
  
  inline def apply(applicationSlashjson: Allowforksyncing): ApplicationjsonAllowforksyncing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowforksyncing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowforksyncing] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Allowforksyncing): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
