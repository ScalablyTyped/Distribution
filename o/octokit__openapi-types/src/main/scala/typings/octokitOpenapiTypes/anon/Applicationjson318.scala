package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson318 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `318`
}
object Applicationjson318 {
  
  inline def apply(applicationSlashjson: `318`): Applicationjson318 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson318]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson318] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `318`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
