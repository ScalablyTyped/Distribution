package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson448 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `448`
}
object Applicationjson448 {
  
  inline def apply(applicationSlashjson: `448`): Applicationjson448 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson448]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson448] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `448`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
