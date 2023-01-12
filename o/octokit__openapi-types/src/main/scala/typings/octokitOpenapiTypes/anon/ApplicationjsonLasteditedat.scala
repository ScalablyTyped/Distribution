package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLasteditedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Lasteditedat
}
object ApplicationjsonLasteditedat {
  
  inline def apply(applicationSlashjson: Lasteditedat): ApplicationjsonLasteditedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLasteditedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonLasteditedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Lasteditedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
