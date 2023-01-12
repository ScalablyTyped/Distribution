package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonAllowspublicrepositories extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Allowspublicrepositories
}
object ApplicationjsonAllowspublicrepositories {
  
  inline def apply(applicationSlashjson: Allowspublicrepositories): ApplicationjsonAllowspublicrepositories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonAllowspublicrepositories]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonAllowspublicrepositories] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Allowspublicrepositories): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
