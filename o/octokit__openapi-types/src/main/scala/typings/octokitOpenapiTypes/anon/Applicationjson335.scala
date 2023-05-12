package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson335 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `335`
}
object Applicationjson335 {
  
  inline def apply(applicationSlashjson: `335`): Applicationjson335 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson335]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson335] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `335`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
