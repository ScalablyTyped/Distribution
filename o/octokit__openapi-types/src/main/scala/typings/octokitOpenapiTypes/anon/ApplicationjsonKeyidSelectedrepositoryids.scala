package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonKeyidSelectedrepositoryids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: KeyidSelectedrepositoryids
}
object ApplicationjsonKeyidSelectedrepositoryids {
  
  inline def apply(applicationSlashjson: KeyidSelectedrepositoryids): ApplicationjsonKeyidSelectedrepositoryids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonKeyidSelectedrepositoryids]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationjsonKeyidSelectedrepositoryids] (val x: Self) extends AnyVal {
    
    inline def setApplicationSlashjson(value: KeyidSelectedrepositoryids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
