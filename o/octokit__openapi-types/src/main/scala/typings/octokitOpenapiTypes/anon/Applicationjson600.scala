package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson600 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `600`
}
object Applicationjson600 {
  
  inline def apply(applicationSlashjson: `600`): Applicationjson600 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson600]
  }
  
  extension [Self <: Applicationjson600](x: Self) {
    
    inline def setApplicationSlashjson(value: `600`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
