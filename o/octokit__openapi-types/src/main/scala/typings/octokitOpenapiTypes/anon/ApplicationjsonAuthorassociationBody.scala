package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAuthorassociationBody extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: AuthorassociationBody
}
object ApplicationjsonAuthorassociationBody {
  
  inline def apply(applicationSlashjson: AuthorassociationBody): ApplicationjsonAuthorassociationBody = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAuthorassociationBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAuthorassociationBody] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: AuthorassociationBody): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
