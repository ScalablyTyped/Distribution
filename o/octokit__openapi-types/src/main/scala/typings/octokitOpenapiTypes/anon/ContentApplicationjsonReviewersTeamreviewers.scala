package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonReviewersTeamreviewers extends StObject {
  
  var content: ApplicationjsonReviewersTeamreviewers
}
object ContentApplicationjsonReviewersTeamreviewers {
  
  inline def apply(content: ApplicationjsonReviewersTeamreviewers): ContentApplicationjsonReviewersTeamreviewers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonReviewersTeamreviewers]
  }
  
  extension [Self <: ContentApplicationjsonReviewersTeamreviewers](x: Self) {
    
    inline def setContent(value: ApplicationjsonReviewersTeamreviewers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
