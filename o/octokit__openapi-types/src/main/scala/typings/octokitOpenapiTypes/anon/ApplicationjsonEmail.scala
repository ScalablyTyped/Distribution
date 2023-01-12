package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonEmail extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Email
}
object ApplicationjsonEmail {
  
  inline def apply(applicationSlashjson: Email): ApplicationjsonEmail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonEmail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonEmail] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Email): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
