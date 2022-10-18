package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var urls: js.Array[End]
}
object `1` {
  
  inline def apply(urls: js.Array[End]): `1` = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setUrls(value: js.Array[End]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: End*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
