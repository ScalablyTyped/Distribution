package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBlock extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Block
}
object ApplicationjsonBlock {
  
  inline def apply(applicationSlashjson: Block): ApplicationjsonBlock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBlock]
  }
  
  extension [Self <: ApplicationjsonBlock](x: Self) {
    
    inline def setApplicationSlashjson(value: Block): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
