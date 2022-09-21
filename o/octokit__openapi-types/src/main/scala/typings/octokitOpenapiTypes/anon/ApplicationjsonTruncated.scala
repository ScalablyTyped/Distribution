package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonTruncated extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Truncated
}
object ApplicationjsonTruncated {
  
  inline def apply(applicationSlashjson: Truncated): ApplicationjsonTruncated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonTruncated]
  }
  
  extension [Self <: ApplicationjsonTruncated](x: Self) {
    
    inline def setApplicationSlashjson(value: Truncated): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
