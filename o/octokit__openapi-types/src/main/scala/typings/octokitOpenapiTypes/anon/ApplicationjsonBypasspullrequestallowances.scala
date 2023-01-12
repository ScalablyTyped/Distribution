package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBypasspullrequestallowances extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Bypasspullrequestallowances
}
object ApplicationjsonBypasspullrequestallowances {
  
  inline def apply(applicationSlashjson: Bypasspullrequestallowances): ApplicationjsonBypasspullrequestallowances = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBypasspullrequestallowances]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBypasspullrequestallowances] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Bypasspullrequestallowances): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
