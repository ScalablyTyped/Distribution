package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson416 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `416`
}
object Applicationjson416 {
  
  inline def apply(applicationSlashjson: `416`): Applicationjson416 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson416]
  }
  
  extension [Self <: Applicationjson416](x: Self) {
    
    inline def setApplicationSlashjson(value: `416`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
