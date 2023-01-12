package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson573 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `573`
}
object Applicationjson573 {
  
  inline def apply(applicationSlashjson: `573`): Applicationjson573 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson573]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson573] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `573`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
