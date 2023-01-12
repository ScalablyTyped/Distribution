package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson572 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `572`
}
object Applicationjson572 {
  
  inline def apply(applicationSlashjson: `572`): Applicationjson572 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson572]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson572] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `572`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
