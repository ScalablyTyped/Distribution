package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson450 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `450`
}
object Applicationjson450 {
  
  inline def apply(applicationSlashjson: `450`): Applicationjson450 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson450]
  }
  
  extension [Self <: Applicationjson450](x: Self) {
    
    inline def setApplicationSlashjson(value: `450`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
