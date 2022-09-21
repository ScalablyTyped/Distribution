package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonClonesCount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ClonesCount
}
object ApplicationjsonClonesCount {
  
  inline def apply(applicationSlashjson: ClonesCount): ApplicationjsonClonesCount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonClonesCount]
  }
  
  extension [Self <: ApplicationjsonClonesCount](x: Self) {
    
    inline def setApplicationSlashjson(value: ClonesCount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
