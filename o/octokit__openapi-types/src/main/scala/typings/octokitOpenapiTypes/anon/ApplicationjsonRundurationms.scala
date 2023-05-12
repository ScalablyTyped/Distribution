package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRundurationms extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Rundurationms
}
object ApplicationjsonRundurationms {
  
  inline def apply(applicationSlashjson: Rundurationms): ApplicationjsonRundurationms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRundurationms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRundurationms] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Rundurationms): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
