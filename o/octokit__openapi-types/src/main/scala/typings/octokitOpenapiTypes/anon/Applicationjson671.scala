package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson671 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `671`
}
object Applicationjson671 {
  
  inline def apply(applicationSlashjson: `671`): Applicationjson671 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson671]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson671] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `671`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
