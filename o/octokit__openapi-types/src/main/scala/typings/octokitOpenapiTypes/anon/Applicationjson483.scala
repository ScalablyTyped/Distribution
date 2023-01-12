package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson483 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `483`
}
object Applicationjson483 {
  
  inline def apply(applicationSlashjson: `483`): Applicationjson483 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson483]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson483] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `483`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
