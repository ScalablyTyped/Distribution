package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTeamsArray extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: TeamsArray
}
object ApplicationjsonTeamsArray {
  
  inline def apply(applicationSlashjson: TeamsArray): ApplicationjsonTeamsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTeamsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonTeamsArray] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: TeamsArray): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
