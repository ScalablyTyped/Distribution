package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson456 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `456`
}
object Applicationjson456 {
  
  inline def apply(applicationSlashjson: `456`): Applicationjson456 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson456]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson456] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `456`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
