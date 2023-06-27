package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson778 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `778`
}
object Applicationjson778 {
  
  inline def apply(applicationSlashjson: `778`): Applicationjson778 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson778]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson778] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `778`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
