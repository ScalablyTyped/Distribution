package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson326 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `326`
}
object Applicationjson326 {
  
  inline def apply(applicationSlashjson: `326`): Applicationjson326 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson326]
  }
  
  extension [Self <: Applicationjson326](x: Self) {
    
    inline def setApplicationSlashjson(value: `326`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
