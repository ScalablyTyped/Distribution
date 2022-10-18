package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBlobsurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Blobsurl
}
object ApplicationjsonBlobsurl {
  
  inline def apply(applicationSlashjson: Blobsurl): ApplicationjsonBlobsurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBlobsurl]
  }
  
  extension [Self <: ApplicationjsonBlobsurl](x: Self) {
    
    inline def setApplicationSlashjson(value: Blobsurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
