package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson58 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `58`
}
object Applicationjson58 {
  
  inline def apply(applicationSlashjson: `58`): Applicationjson58 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson58]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson58] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `58`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
