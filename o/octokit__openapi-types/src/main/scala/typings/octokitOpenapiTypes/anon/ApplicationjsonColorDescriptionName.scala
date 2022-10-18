package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonColorDescriptionName extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ColorDescriptionName
}
object ApplicationjsonColorDescriptionName {
  
  inline def apply(applicationSlashjson: ColorDescriptionName): ApplicationjsonColorDescriptionName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonColorDescriptionName]
  }
  
  extension [Self <: ApplicationjsonColorDescriptionName](x: Self) {
    
    inline def setApplicationSlashjson(value: ColorDescriptionName): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
