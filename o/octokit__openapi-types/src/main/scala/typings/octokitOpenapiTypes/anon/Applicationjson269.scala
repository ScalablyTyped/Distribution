package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson269 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `269`
}
object Applicationjson269 {
  
  inline def apply(applicationSlashjson: `269`): Applicationjson269 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson269]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson269] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `269`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
