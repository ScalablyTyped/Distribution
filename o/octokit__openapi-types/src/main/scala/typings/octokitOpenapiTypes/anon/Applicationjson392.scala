package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson392 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `392`
}
object Applicationjson392 {
  
  inline def apply(applicationSlashjson: `392`): Applicationjson392 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson392]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson392] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `392`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
