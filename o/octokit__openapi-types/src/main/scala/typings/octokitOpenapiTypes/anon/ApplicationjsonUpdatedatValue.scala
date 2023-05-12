package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonUpdatedatValue extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: UpdatedatValue
}
object ApplicationjsonUpdatedatValue {
  
  inline def apply(applicationSlashjson: UpdatedatValue): ApplicationjsonUpdatedatValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonUpdatedatValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonUpdatedatValue] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: UpdatedatValue): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
