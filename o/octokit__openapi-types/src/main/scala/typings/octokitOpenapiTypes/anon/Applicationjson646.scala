package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson646 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `646`
}
object Applicationjson646 {
  
  inline def apply(applicationSlashjson: `646`): Applicationjson646 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson646]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson646] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `646`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
