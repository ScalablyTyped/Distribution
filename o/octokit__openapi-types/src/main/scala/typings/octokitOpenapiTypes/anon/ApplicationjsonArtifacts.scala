package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonArtifacts extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Artifacts
}
object ApplicationjsonArtifacts {
  
  inline def apply(applicationSlashjson: Artifacts): ApplicationjsonArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonArtifacts]
  }
  
  extension [Self <: ApplicationjsonArtifacts](x: Self) {
    
    inline def setApplicationSlashjson(value: Artifacts): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
