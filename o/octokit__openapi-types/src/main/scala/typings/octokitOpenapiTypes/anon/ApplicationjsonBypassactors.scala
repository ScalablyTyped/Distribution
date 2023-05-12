package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBypassactors extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Bypassactors
}
object ApplicationjsonBypassactors {
  
  inline def apply(applicationSlashjson: Bypassactors): ApplicationjsonBypassactors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBypassactors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBypassactors] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Bypassactors): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
