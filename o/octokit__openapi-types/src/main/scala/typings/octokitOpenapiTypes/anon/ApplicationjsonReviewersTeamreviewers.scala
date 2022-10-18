package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonReviewersTeamreviewers extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: ReviewersTeamreviewers
}
object ApplicationjsonReviewersTeamreviewers {
  
  inline def apply(applicationSlashjson: ReviewersTeamreviewers): ApplicationjsonReviewersTeamreviewers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonReviewersTeamreviewers]
  }
  
  extension [Self <: ApplicationjsonReviewersTeamreviewers](x: Self) {
    
    inline def setApplicationSlashjson(value: ReviewersTeamreviewers): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
  }
}
