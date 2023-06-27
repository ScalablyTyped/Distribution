package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson151 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `151`
}
object Applicationjson151 {
  
  inline def apply(applicationSlashjson: `151`): Applicationjson151 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson151]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson151] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `151`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
