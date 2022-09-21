package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonReviewrequester extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Reviewrequester
}
object ApplicationjsonReviewrequester {
  
  inline def apply(applicationSlashjson: Reviewrequester): ApplicationjsonReviewrequester = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonReviewrequester]
  }
  
  extension [Self <: ApplicationjsonReviewrequester](x: Self) {
    
    inline def setApplicationSlashjson(value: Reviewrequester): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
