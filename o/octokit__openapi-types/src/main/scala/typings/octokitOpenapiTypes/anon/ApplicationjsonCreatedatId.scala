package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonCreatedatId extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: CreatedatId
}
object ApplicationjsonCreatedatId {
  
  inline def apply(applicationSlashjson: CreatedatId): ApplicationjsonCreatedatId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonCreatedatId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonCreatedatId] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: CreatedatId): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
