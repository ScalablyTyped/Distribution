package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonArtifacturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Artifacturl
}
object ApplicationjsonArtifacturl {
  
  inline def apply(applicationSlashjson: Artifacturl): ApplicationjsonArtifacturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonArtifacturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonArtifacturl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Artifacturl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
