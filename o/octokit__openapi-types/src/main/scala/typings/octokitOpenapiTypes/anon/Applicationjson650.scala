package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson650 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `650`
}
object Applicationjson650 {
  
  inline def apply(applicationSlashjson: `650`): Applicationjson650 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson650]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson650] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `650`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
