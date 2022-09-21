package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonLine extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Line
}
object ApplicationjsonLine {
  
  inline def apply(applicationSlashjson: Line): ApplicationjsonLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonLine]
  }
  
  extension [Self <: ApplicationjsonLine](x: Self) {
    
    inline def setApplicationSlashjson(value: Line): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
