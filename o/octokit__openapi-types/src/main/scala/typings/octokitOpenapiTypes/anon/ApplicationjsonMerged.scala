package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonMerged extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Merged
}
object ApplicationjsonMerged {
  
  inline def apply(applicationSlashjson: Merged): ApplicationjsonMerged = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonMerged]
  }
  
  extension [Self <: ApplicationjsonMerged](x: Self) {
    
    inline def setApplicationSlashjson(value: Merged): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
