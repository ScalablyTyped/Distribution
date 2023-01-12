package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonKeyprefix extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Keyprefix
}
object ApplicationjsonKeyprefix {
  
  inline def apply(applicationSlashjson: Keyprefix): ApplicationjsonKeyprefix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonKeyprefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonKeyprefix] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Keyprefix): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
