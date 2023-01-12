package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson117 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `117`
}
object Applicationjson117 {
  
  inline def apply(applicationSlashjson: `117`): Applicationjson117 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson117]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson117] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `117`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
