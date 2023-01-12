package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlBasedRequestPrepareOptions
  extends StObject
     with RequestPrepareOptions {
  
  var url: String
}
object UrlBasedRequestPrepareOptions {
  
  inline def apply(deserializationMapper: Mapper, method: String, serializationMapper: Mapper, url: String): UrlBasedRequestPrepareOptions = {
    val __obj = js.Dynamic.literal(deserializationMapper = deserializationMapper.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], serializationMapper = serializationMapper.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlBasedRequestPrepareOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlBasedRequestPrepareOptions] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
