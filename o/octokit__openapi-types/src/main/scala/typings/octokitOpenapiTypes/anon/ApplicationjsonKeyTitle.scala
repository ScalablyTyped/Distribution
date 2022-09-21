package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonKeyTitle extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: KeyTitle
}
object ApplicationjsonKeyTitle {
  
  inline def apply(applicationSlashjson: KeyTitle): ApplicationjsonKeyTitle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonKeyTitle]
  }
  
  extension [Self <: ApplicationjsonKeyTitle](x: Self) {
    
    inline def setApplicationSlashjson(value: KeyTitle): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
