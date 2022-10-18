package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonBodyLine extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: BodyLine
}
object ApplicationjsonBodyLine {
  
  inline def apply(applicationSlashjson: BodyLine): ApplicationjsonBodyLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonBodyLine]
  }
  
  extension [Self <: ApplicationjsonBodyLine](x: Self) {
    
    inline def setApplicationSlashjson(value: BodyLine): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
