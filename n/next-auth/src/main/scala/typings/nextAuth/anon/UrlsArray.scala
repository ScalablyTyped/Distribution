package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlsArray extends StObject {
  
  var urls: js.Array[Any]
}
object UrlsArray {
  
  inline def apply(urls: js.Array[Any]): UrlsArray = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlsArray]
  }
  
  extension [Self <: UrlsArray](x: Self) {
    
    inline def setUrls(value: js.Array[Any]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: Any*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
