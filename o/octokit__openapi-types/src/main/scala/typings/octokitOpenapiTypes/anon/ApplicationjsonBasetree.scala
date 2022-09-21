package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBasetree extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Basetree
}
object ApplicationjsonBasetree {
  
  inline def apply(applicationSlashjson: Basetree): ApplicationjsonBasetree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBasetree]
  }
  
  extension [Self <: ApplicationjsonBasetree](x: Self) {
    
    inline def setApplicationSlashjson(value: Basetree): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
