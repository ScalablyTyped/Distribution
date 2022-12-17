package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonDraft extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Draft
}
object ApplicationjsonDraft {
  
  inline def apply(applicationSlashjson: Draft): ApplicationjsonDraft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonDraft]
  }
  
  extension [Self <: ApplicationjsonDraft](x: Self) {
    
    inline def setApplicationSlashjson(value: Draft): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
