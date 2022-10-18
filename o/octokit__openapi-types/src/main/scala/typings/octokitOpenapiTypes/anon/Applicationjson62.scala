package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson62 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `62`
}
object Applicationjson62 {
  
  inline def apply(applicationSlashjson: `62`): Applicationjson62 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson62]
  }
  
  extension [Self <: Applicationjson62](x: Self) {
    
    inline def setApplicationSlashjson(value: `62`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
