package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Urls extends StObject {
  
  var urls: js.Array[Displayurl]
}
object Urls {
  
  inline def apply(urls: js.Array[Displayurl]): Urls = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Urls]
  }
  
  extension [Self <: Urls](x: Self) {
    
    inline def setUrls(value: js.Array[Displayurl]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: Displayurl*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
