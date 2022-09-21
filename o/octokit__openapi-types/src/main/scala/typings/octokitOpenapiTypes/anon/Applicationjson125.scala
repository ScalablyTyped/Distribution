package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson125 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `125`
}
object Applicationjson125 {
  
  inline def apply(applicationSlashjson: `125`): Applicationjson125 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson125]
  }
  
  extension [Self <: Applicationjson125](x: Self) {
    
    inline def setApplicationSlashjson(value: `125`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
