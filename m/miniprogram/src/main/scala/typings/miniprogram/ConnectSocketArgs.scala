package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectSocketArgs
  extends StObject
     with AsyncCallback[Any] {
  
  var data: Common
  
  var header: Common
  
  var url: String
}
object ConnectSocketArgs {
  
  inline def apply(data: Common, header: Common, url: String): ConnectSocketArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectSocketArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectSocketArgs] (val x: Self) extends AnyVal {
    
    inline def setData(value: Common): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Common): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
