package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson644 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `644`
}
object Applicationjson644 {
  
  inline def apply(applicationSlashjson: `644`): Applicationjson644 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson644]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson644] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `644`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
