package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonRepositorycacheusages extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Repositorycacheusages
}
object ApplicationjsonRepositorycacheusages {
  
  inline def apply(applicationSlashjson: Repositorycacheusages): ApplicationjsonRepositorycacheusages = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonRepositorycacheusages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonRepositorycacheusages] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Repositorycacheusages): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
