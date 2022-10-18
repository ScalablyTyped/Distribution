package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Applicationjson213 extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: `213`
}
object Applicationjson213 {
  
  inline def apply(applicationSlashjson: `213`): Applicationjson213 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[Applicationjson213]
  }
  
  extension [Self <: Applicationjson213](x: Self) {
    
    inline def setApplicationSlashjson(value: `213`): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
