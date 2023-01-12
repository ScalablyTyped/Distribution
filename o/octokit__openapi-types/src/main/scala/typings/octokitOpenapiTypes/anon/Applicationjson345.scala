package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson345 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `345`
}
object Applicationjson345 {
  
  inline def apply(applicationSlashjson: `345`): Applicationjson345 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson345]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson345] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `345`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
