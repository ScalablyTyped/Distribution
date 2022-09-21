package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonTeamreviewers extends StObject {
  
  var content: ApplicationjsonTeamreviewers
}
object ContentApplicationjsonTeamreviewers {
  
  inline def apply(content: ApplicationjsonTeamreviewers): ContentApplicationjsonTeamreviewers = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonTeamreviewers]
  }
  
  extension [Self <: ContentApplicationjsonTeamreviewers](x: Self) {
    
    inline def setContent(value: ApplicationjsonTeamreviewers): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
