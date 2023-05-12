package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson381 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `381`
}
object Applicationjson381 {
  
  inline def apply(applicationSlashjson: `381`): Applicationjson381 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson381]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson381] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `381`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
