package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson359 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `359`
}
object Applicationjson359 {
  
  inline def apply(applicationSlashjson: `359`): Applicationjson359 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson359]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson359] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `359`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
