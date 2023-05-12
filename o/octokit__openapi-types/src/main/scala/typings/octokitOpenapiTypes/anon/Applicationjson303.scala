package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson303 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `303`
}
object Applicationjson303 {
  
  inline def apply(applicationSlashjson: `303`): Applicationjson303 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson303]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson303] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `303`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
