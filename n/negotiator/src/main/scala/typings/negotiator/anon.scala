package typings.negotiator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Headers extends StObject {
    
    var headers: typings.negotiator.mod.Headers = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(headers: typings.negotiator.mod.Headers): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: typings.negotiator.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
}
