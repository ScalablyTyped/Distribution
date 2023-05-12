package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonScope extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Scope
}
object ApplicationjsonScope {
  
  inline def apply(applicationSlashjson: Scope): ApplicationjsonScope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonScope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonScope] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Scope): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
