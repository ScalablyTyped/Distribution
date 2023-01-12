package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPrivate extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Private
}
object ApplicationjsonPrivate {
  
  inline def apply(applicationSlashjson: Private): ApplicationjsonPrivate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPrivate] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Private): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
