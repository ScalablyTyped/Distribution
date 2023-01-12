package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonArchivedownloadurl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Archivedownloadurl
}
object ApplicationjsonArchivedownloadurl {
  
  inline def apply(applicationSlashjson: Archivedownloadurl): ApplicationjsonArchivedownloadurl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonArchivedownloadurl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonArchivedownloadurl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Archivedownloadurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
