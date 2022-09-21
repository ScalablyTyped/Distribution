package typings.nats.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Headersonly extends StObject {
  
  var headers_only: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
}
object Headersonly {
  
  inline def apply(): Headersonly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Headersonly]
  }
  
  extension [Self <: Headersonly](x: Self) {
    
    inline def setHeaders_only(value: Boolean): Self = StObject.set(x, "headers_only", value.asInstanceOf[js.Any])
    
    inline def setHeaders_onlyUndefined: Self = StObject.set(x, "headers_only", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
