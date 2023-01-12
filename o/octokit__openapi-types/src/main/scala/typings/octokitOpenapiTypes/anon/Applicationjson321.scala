package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson321 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `321`
}
object Applicationjson321 {
  
  inline def apply(applicationSlashjson: `321`): Applicationjson321 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson321]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson321] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `321`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
