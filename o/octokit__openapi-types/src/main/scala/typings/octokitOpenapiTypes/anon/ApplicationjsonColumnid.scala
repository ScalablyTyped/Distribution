package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonColumnid extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Columnid
}
object ApplicationjsonColumnid {
  
  inline def apply(applicationSlashjson: Columnid): ApplicationjsonColumnid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonColumnid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonColumnid] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Columnid): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
