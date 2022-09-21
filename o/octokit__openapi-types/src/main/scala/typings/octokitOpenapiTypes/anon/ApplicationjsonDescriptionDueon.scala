package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDescriptionDueon extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DescriptionDueon
}
object ApplicationjsonDescriptionDueon {
  
  inline def apply(applicationSlashjson: DescriptionDueon): ApplicationjsonDescriptionDueon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDescriptionDueon]
  }
  
  extension [Self <: ApplicationjsonDescriptionDueon](x: Self) {
    
    inline def setApplicationSlashjson(value: DescriptionDueon): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
