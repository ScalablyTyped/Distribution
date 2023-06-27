package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson586 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `586`
}
object Applicationjson586 {
  
  inline def apply(applicationSlashjson: `586`): Applicationjson586 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson586]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson586] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `586`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
