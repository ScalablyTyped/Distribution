package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson502 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `502`
}
object Applicationjson502 {
  
  inline def apply(applicationSlashjson: `502`): Applicationjson502 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson502]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson502] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `502`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
