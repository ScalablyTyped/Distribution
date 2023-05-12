package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson165 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `165`
}
object Applicationjson165 {
  
  inline def apply(applicationSlashjson: `165`): Applicationjson165 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson165]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson165] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `165`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
