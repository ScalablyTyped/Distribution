package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson589 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `589`
}
object Applicationjson589 {
  
  inline def apply(applicationSlashjson: `589`): Applicationjson589 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson589]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson589] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `589`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
