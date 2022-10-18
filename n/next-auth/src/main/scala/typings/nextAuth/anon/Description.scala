package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: UrlsArray
  
  var url: Urls
}
object Description {
  
  inline def apply(description: UrlsArray, url: Urls): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: UrlsArray): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Urls): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
