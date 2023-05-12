package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSourcerepository extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Sourcerepository
}
object ApplicationjsonSourcerepository {
  
  inline def apply(applicationSlashjson: Sourcerepository): ApplicationjsonSourcerepository = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSourcerepository]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSourcerepository] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Sourcerepository): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
