package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson276 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `276`
}
object Applicationjson276 {
  
  inline def apply(applicationSlashjson: `276`): Applicationjson276 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson276]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson276] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `276`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
