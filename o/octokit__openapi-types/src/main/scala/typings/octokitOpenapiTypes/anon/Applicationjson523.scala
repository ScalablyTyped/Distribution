package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson523 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `523`
}
object Applicationjson523 {
  
  inline def apply(applicationSlashjson: `523`): Applicationjson523 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson523]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson523] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `523`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
