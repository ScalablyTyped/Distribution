package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson578 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `578`
}
object Applicationjson578 {
  
  inline def apply(applicationSlashjson: `578`): Applicationjson578 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson578]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson578] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `578`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
