package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNodeidUser extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NodeidUser
}
object ApplicationjsonNodeidUser {
  
  inline def apply(applicationSlashjson: NodeidUser): ApplicationjsonNodeidUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNodeidUser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNodeidUser] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NodeidUser): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
