package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson468 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `468`
}
object Applicationjson468 {
  
  inline def apply(applicationSlashjson: `468`): Applicationjson468 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson468]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson468] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `468`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
