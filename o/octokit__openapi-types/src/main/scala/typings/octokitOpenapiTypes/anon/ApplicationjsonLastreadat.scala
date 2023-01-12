package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLastreadat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Lastreadat
}
object ApplicationjsonLastreadat {
  
  inline def apply(applicationSlashjson: Lastreadat): ApplicationjsonLastreadat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLastreadat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLastreadat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Lastreadat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
