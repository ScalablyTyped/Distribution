package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSelectedrepositoryids extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Selectedrepositoryids
}
object ApplicationjsonSelectedrepositoryids {
  
  inline def apply(applicationSlashjson: Selectedrepositoryids): ApplicationjsonSelectedrepositoryids = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSelectedrepositoryids]
  }
  
  extension [Self <: ApplicationjsonSelectedrepositoryids](x: Self) {
    
    inline def setApplicationSlashjson(value: Selectedrepositoryids): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
