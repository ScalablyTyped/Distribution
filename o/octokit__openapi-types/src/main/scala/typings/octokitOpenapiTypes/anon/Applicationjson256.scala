package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson256 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `256`
}
object Applicationjson256 {
  
  inline def apply(applicationSlashjson: `256`): Applicationjson256 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson256]
  }
  
  extension [Self <: Applicationjson256](x: Self) {
    
    inline def setApplicationSlashjson(value: `256`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
