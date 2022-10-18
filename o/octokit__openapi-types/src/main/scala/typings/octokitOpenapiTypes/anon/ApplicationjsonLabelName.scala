package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLabelName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: LabelName
}
object ApplicationjsonLabelName {
  
  inline def apply(applicationSlashjson: LabelName): ApplicationjsonLabelName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLabelName]
  }
  
  extension [Self <: ApplicationjsonLabelName](x: Self) {
    
    inline def setApplicationSlashjson(value: LabelName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
