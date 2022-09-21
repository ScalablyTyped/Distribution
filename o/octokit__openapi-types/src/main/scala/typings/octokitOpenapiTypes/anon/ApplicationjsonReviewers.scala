package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonReviewers extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: Reviewers
}
object ApplicationjsonReviewers {
  
  inline def apply(applicationSlashjson: Reviewers): ApplicationjsonReviewers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonReviewers]
  }
  
  extension [Self <: ApplicationjsonReviewers](x: Self) {
    
    inline def setApplicationSlashjson(value: Reviewers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
