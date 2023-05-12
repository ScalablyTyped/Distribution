package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNameUpdatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NameUpdatedat
}
object ApplicationjsonNameUpdatedat {
  
  inline def apply(applicationSlashjson: NameUpdatedat): ApplicationjsonNameUpdatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNameUpdatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNameUpdatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NameUpdatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
