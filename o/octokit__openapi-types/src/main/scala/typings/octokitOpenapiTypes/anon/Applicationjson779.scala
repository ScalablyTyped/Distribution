package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson779 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `779`
}
object Applicationjson779 {
  
  inline def apply(applicationSlashjson: `779`): Applicationjson779 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson779]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson779] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `779`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
