package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionUrl extends StObject {
  
  var description: HashtagsArray
  
  var url: `1`
}
object DescriptionUrl {
  
  inline def apply(description: HashtagsArray, url: `1`): DescriptionUrl = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionUrl]
  }
  
  extension [Self <: DescriptionUrl](x: Self) {
    
    inline def setDescription(value: HashtagsArray): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: `1`): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
