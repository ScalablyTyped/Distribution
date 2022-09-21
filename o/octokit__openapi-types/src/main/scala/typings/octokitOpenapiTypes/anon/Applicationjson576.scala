package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson576 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `576`
}
object Applicationjson576 {
  
  inline def apply(applicationSlashjson: `576`): Applicationjson576 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson576]
  }
  
  extension [Self <: Applicationjson576](x: Self) {
    
    inline def setApplicationSlashjson(value: `576`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
