package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDevcontainerpath extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Devcontainerpath
}
object ApplicationjsonDevcontainerpath {
  
  inline def apply(applicationSlashjson: Devcontainerpath): ApplicationjsonDevcontainerpath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDevcontainerpath]
  }
  
  extension [Self <: ApplicationjsonDevcontainerpath](x: Self) {
    
    inline def setApplicationSlashjson(value: Devcontainerpath): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
