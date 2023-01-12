package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCheckouturi extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Checkouturi
}
object ApplicationjsonCheckouturi {
  
  inline def apply(applicationSlashjson: Checkouturi): ApplicationjsonCheckouturi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCheckouturi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCheckouturi] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Checkouturi): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
