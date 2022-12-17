package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDescriptionId extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DescriptionId
}
object ApplicationjsonDescriptionId {
  
  inline def apply(applicationSlashjson: DescriptionId): ApplicationjsonDescriptionId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDescriptionId]
  }
  
  extension [Self <: ApplicationjsonDescriptionId](x: Self) {
    
    inline def setApplicationSlashjson(value: DescriptionId): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
