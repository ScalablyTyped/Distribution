package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonNodeidUpdatedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: NodeidUpdatedat
}
object ApplicationjsonNodeidUpdatedat {
  
  inline def apply(applicationSlashjson: NodeidUpdatedat): ApplicationjsonNodeidUpdatedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonNodeidUpdatedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonNodeidUpdatedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: NodeidUpdatedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
