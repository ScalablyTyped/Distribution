package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonKeyid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Keyid
}
object ApplicationjsonKeyid {
  
  inline def apply(applicationSlashjson: Keyid): ApplicationjsonKeyid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonKeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonKeyid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Keyid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
