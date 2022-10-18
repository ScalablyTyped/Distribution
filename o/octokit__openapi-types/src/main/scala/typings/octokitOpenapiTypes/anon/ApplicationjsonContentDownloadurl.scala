package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContentDownloadurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ContentDownloadurl
}
object ApplicationjsonContentDownloadurl {
  
  inline def apply(applicationSlashjson: ContentDownloadurl): ApplicationjsonContentDownloadurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContentDownloadurl]
  }
  
  extension [Self <: ApplicationjsonContentDownloadurl](x: Self) {
    
    inline def setApplicationSlashjson(value: ContentDownloadurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
