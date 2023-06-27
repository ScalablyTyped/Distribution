package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson441 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `441`
}
object Applicationjson441 {
  
  inline def apply(applicationSlashjson: `441`): Applicationjson441 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson441]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson441] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `441`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
