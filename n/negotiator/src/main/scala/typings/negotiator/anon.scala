package typings.negotiator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Headers extends StObject {
    
    var headers: typings.negotiator.mod.Headers
  }
  object Headers {
    
    inline def apply(headers: typings.negotiator.mod.Headers): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: typings.negotiator.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
