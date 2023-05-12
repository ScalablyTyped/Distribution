package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson227 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `227`
}
object Applicationjson227 {
  
  inline def apply(applicationSlashjson: `227`): Applicationjson227 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson227]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Applicationjson227] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: `227`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
