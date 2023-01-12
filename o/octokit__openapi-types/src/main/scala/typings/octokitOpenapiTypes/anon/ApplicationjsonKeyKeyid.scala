package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonKeyKeyid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: KeyKeyid
}
object ApplicationjsonKeyKeyid {
  
  inline def apply(applicationSlashjson: KeyKeyid): ApplicationjsonKeyKeyid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonKeyKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonKeyKeyid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: KeyKeyid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
