package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyName
}
object ApplicationjsonBodyName {
  
  inline def apply(applicationSlashjson: BodyName): ApplicationjsonBodyName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBodyName] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: BodyName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
