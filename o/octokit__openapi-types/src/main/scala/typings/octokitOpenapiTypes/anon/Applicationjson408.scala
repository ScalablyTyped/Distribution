package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson408 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `408`
}
object Applicationjson408 {
  
  inline def apply(applicationSlashjson: `408`): Applicationjson408 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson408]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson408] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `408`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
