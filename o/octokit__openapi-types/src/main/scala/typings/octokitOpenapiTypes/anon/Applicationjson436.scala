package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson436 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `436`
}
object Applicationjson436 {
  
  inline def apply(applicationSlashjson: `436`): Applicationjson436 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson436]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson436] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `436`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
