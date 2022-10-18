package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson35 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `35`
}
object Applicationjson35 {
  
  inline def apply(applicationSlashjson: `35`): Applicationjson35 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson35]
  }
  
  extension [Self <: Applicationjson35](x: Self) {
    
    inline def setApplicationSlashjson(value: `35`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
