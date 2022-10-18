package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCname extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Cname
}
object ApplicationjsonCname {
  
  inline def apply(applicationSlashjson: Cname): ApplicationjsonCname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCname]
  }
  
  extension [Self <: ApplicationjsonCname](x: Self) {
    
    inline def setApplicationSlashjson(value: Cname): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
