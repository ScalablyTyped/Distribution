package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson780 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `780`
}
object Applicationjson780 {
  
  inline def apply(applicationSlashjson: `780`): Applicationjson780 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson780]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson780] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `780`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
