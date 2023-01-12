package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson261 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `261`
}
object Applicationjson261 {
  
  inline def apply(applicationSlashjson: `261`): Applicationjson261 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson261]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson261] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `261`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
