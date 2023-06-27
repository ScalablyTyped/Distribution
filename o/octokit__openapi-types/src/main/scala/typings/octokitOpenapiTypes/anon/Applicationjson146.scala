package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson146 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `146`
}
object Applicationjson146 {
  
  inline def apply(applicationSlashjson: `146`): Applicationjson146 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson146]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson146] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `146`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
