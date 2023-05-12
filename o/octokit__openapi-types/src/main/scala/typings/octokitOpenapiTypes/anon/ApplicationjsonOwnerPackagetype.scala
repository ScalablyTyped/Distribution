package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonOwnerPackagetype extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: OwnerPackagetype
}
object ApplicationjsonOwnerPackagetype {
  
  inline def apply(applicationSlashjson: OwnerPackagetype): ApplicationjsonOwnerPackagetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonOwnerPackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonOwnerPackagetype] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: OwnerPackagetype): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
