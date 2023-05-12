package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLanguages extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Languages
}
object ApplicationjsonLanguages {
  
  inline def apply(applicationSlashjson: Languages): ApplicationjsonLanguages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLanguages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLanguages] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Languages): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
