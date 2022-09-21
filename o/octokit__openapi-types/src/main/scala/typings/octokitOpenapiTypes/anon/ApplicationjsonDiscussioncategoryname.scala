package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDiscussioncategoryname extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Discussioncategoryname
}
object ApplicationjsonDiscussioncategoryname {
  
  inline def apply(applicationSlashjson: Discussioncategoryname): ApplicationjsonDiscussioncategoryname = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDiscussioncategoryname]
  }
  
  extension [Self <: ApplicationjsonDiscussioncategoryname](x: Self) {
    
    inline def setApplicationSlashjson(value: Discussioncategoryname): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
