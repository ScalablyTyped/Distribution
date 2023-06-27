package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson139 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `139`
}
object Applicationjson139 {
  
  inline def apply(applicationSlashjson: `139`): Applicationjson139 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson139]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson139] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `139`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
