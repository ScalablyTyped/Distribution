package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson587 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `587`
}
object Applicationjson587 {
  
  inline def apply(applicationSlashjson: `587`): Applicationjson587 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson587]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson587] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `587`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
