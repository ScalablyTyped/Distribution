package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonIncludedgigabytesbandwidth extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Includedgigabytesbandwidth
}
object ApplicationjsonIncludedgigabytesbandwidth {
  
  inline def apply(applicationSlashjson: Includedgigabytesbandwidth): ApplicationjsonIncludedgigabytesbandwidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonIncludedgigabytesbandwidth]
  }
  
  extension [Self <: ApplicationjsonIncludedgigabytesbandwidth](x: Self) {
    
    inline def setApplicationSlashjson(value: Includedgigabytesbandwidth): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
