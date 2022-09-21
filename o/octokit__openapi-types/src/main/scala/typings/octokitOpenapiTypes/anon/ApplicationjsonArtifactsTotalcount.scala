package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonArtifactsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ArtifactsTotalcount
}
object ApplicationjsonArtifactsTotalcount {
  
  inline def apply(applicationSlashjson: ArtifactsTotalcount): ApplicationjsonArtifactsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonArtifactsTotalcount]
  }
  
  extension [Self <: ApplicationjsonArtifactsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: ArtifactsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
