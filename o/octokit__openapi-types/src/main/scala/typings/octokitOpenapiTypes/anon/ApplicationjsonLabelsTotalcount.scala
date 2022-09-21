package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLabelsTotalcount extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: LabelsTotalcount
}
object ApplicationjsonLabelsTotalcount {
  
  inline def apply(applicationSlashjson: LabelsTotalcount): ApplicationjsonLabelsTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLabelsTotalcount]
  }
  
  extension [Self <: ApplicationjsonLabelsTotalcount](x: Self) {
    
    inline def setApplicationSlashjson(value: LabelsTotalcount): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
