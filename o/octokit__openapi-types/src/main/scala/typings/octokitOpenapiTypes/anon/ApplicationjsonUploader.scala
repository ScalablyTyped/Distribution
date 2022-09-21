package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUploader extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Uploader
}
object ApplicationjsonUploader {
  
  inline def apply(applicationSlashjson: Uploader): ApplicationjsonUploader = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUploader]
  }
  
  extension [Self <: ApplicationjsonUploader](x: Self) {
    
    inline def setApplicationSlashjson(value: Uploader): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
