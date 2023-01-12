package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDownloadurlEncoding extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: DownloadurlEncoding
}
object ApplicationjsonDownloadurlEncoding {
  
  inline def apply(applicationSlashjson: DownloadurlEncoding): ApplicationjsonDownloadurlEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDownloadurlEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonDownloadurlEncoding] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: DownloadurlEncoding): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
