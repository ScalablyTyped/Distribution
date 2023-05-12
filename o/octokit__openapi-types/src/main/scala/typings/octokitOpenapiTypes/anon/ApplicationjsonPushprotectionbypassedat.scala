package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPushprotectionbypassedat extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Pushprotectionbypassedat
}
object ApplicationjsonPushprotectionbypassedat {
  
  inline def apply(applicationSlashjson: Pushprotectionbypassedat): ApplicationjsonPushprotectionbypassedat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPushprotectionbypassedat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPushprotectionbypassedat] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Pushprotectionbypassedat): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
