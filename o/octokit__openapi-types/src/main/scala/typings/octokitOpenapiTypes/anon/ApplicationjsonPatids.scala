package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonPatids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Patids
}
object ApplicationjsonPatids {
  
  inline def apply(applicationSlashjson: Patids): ApplicationjsonPatids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonPatids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonPatids] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Patids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
