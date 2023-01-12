package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUselfs extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Uselfs
}
object ApplicationjsonUselfs {
  
  inline def apply(applicationSlashjson: Uselfs): ApplicationjsonUselfs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUselfs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonUselfs] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Uselfs): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
