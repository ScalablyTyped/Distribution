package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson643 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `643`
}
object Applicationjson643 {
  
  inline def apply(applicationSlashjson: `643`): Applicationjson643 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson643]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson643] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `643`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
