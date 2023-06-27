package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson191 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `191`
}
object Applicationjson191 {
  
  inline def apply(applicationSlashjson: `191`): Applicationjson191 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson191]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson191] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `191`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
