package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson366 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `366`
}
object Applicationjson366 {
  
  inline def apply(applicationSlashjson: `366`): Applicationjson366 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson366]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson366] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `366`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
