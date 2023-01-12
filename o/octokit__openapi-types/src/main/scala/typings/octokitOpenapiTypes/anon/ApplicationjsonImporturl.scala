package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonImporturl extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Importurl
}
object ApplicationjsonImporturl {
  
  inline def apply(applicationSlashjson: Importurl): ApplicationjsonImporturl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonImporturl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonImporturl] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Importurl): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
