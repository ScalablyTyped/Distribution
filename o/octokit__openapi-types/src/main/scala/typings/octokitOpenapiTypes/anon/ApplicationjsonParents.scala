package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonParents extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Parents
}
object ApplicationjsonParents {
  
  inline def apply(applicationSlashjson: Parents): ApplicationjsonParents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonParents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonParents] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Parents): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
