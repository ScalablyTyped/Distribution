package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson645 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `645`
}
object Applicationjson645 {
  
  inline def apply(applicationSlashjson: `645`): Applicationjson645 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson645]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson645] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `645`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
