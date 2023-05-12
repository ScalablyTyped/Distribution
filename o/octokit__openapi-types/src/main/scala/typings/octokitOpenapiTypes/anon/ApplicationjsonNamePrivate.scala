package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNamePrivate extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NamePrivate
}
object ApplicationjsonNamePrivate {
  
  inline def apply(applicationSlashjson: NamePrivate): ApplicationjsonNamePrivate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNamePrivate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNamePrivate] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NamePrivate): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
