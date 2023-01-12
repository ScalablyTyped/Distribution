package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedorganizationids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Selectedorganizationids
}
object ApplicationjsonSelectedorganizationids {
  
  inline def apply(applicationSlashjson: Selectedorganizationids): ApplicationjsonSelectedorganizationids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedorganizationids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSelectedorganizationids] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Selectedorganizationids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
