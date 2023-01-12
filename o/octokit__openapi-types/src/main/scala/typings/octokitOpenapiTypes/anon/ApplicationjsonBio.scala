package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBio extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Bio
}
object ApplicationjsonBio {
  
  inline def apply(applicationSlashjson: Bio): ApplicationjsonBio = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonBio] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Bio): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
