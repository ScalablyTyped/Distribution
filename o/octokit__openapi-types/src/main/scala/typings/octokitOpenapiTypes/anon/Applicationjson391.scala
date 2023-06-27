package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson391 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `391`
}
object Applicationjson391 {
  
  inline def apply(applicationSlashjson: `391`): Applicationjson391 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson391]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson391] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `391`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
