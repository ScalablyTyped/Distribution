package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonSize extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Size
}
object ApplicationjsonSize {
  
  inline def apply(applicationSlashjson: Size): ApplicationjsonSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonSize]
  }
  
  extension [Self <: ApplicationjsonSize](x: Self) {
    
    inline def setApplicationSlashjson(value: Size): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
