package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSinglefilepaths extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Singlefilepaths
}
object ApplicationjsonSinglefilepaths {
  
  inline def apply(applicationSlashjson: Singlefilepaths): ApplicationjsonSinglefilepaths = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSinglefilepaths]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonSinglefilepaths] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Singlefilepaths): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
