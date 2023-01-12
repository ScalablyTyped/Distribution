package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson285 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `285`
}
object Applicationjson285 {
  
  inline def apply(applicationSlashjson: `285`): Applicationjson285 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson285]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson285] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `285`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
