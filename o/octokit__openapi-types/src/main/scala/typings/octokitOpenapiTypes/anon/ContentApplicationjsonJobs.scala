package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentApplicationjsonJobs extends StObject {
  
  var content: ApplicationjsonJobs
}
object ContentApplicationjsonJobs {
  
  inline def apply(content: ApplicationjsonJobs): ContentApplicationjsonJobs = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentApplicationjsonJobs]
  }
  
  extension [Self <: ContentApplicationjsonJobs](x: Self) {
    
    inline def setContent(value: ApplicationjsonJobs): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
