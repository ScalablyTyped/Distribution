package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonContenttype extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Contenttype
}
object ApplicationjsonContenttype {
  
  inline def apply(applicationSlashjson: Contenttype): ApplicationjsonContenttype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonContenttype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonContenttype] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Contenttype): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
