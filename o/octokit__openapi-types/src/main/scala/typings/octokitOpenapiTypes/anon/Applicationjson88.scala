package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson88 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `88`
}
object Applicationjson88 {
  
  inline def apply(applicationSlashjson: `88`): Applicationjson88 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson88]
  }
  
  extension [Self <: Applicationjson88](x: Self) {
    
    inline def setApplicationSlashjson(value: `88`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
