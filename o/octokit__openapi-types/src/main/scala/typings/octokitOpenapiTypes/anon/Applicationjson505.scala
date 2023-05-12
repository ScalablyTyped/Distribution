package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson505 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `505`
}
object Applicationjson505 {
  
  inline def apply(applicationSlashjson: `505`): Applicationjson505 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson505]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson505] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `505`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
