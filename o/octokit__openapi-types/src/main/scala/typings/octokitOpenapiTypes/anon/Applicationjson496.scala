package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson496 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `496`
}
object Applicationjson496 {
  
  inline def apply(applicationSlashjson: `496`): Applicationjson496 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson496]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson496] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `496`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
