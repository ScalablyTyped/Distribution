package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonGitstatus extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Gitstatus
}
object ApplicationjsonGitstatus {
  
  inline def apply(applicationSlashjson: Gitstatus): ApplicationjsonGitstatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonGitstatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonGitstatus] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Gitstatus): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
