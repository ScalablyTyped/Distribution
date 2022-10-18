package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson145 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `145`
}
object Applicationjson145 {
  
  inline def apply(applicationSlashjson: `145`): Applicationjson145 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson145]
  }
  
  extension [Self <: Applicationjson145](x: Self) {
    
    inline def setApplicationSlashjson(value: `145`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
