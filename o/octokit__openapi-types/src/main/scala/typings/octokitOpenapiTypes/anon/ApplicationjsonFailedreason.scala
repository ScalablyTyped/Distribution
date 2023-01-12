package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonFailedreason extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Failedreason
}
object ApplicationjsonFailedreason {
  
  inline def apply(applicationSlashjson: Failedreason): ApplicationjsonFailedreason = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonFailedreason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonFailedreason] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: Failedreason): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
