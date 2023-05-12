package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson373 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `373`
}
object Applicationjson373 {
  
  inline def apply(applicationSlashjson: `373`): Applicationjson373 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson373]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson373] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `373`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
