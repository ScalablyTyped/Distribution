package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBasebranch extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Basebranch
}
object ApplicationjsonBasebranch {
  
  inline def apply(applicationSlashjson: Basebranch): ApplicationjsonBasebranch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBasebranch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBasebranch] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Basebranch): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
