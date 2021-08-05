package typings.octokitTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestHeadersMod {
  
  trait RequestHeaders
    extends StObject
       with /* header */ StringDictionary[js.UndefOr[String | Double]] {
    
    /**
      * Avoid setting `headers.accept`, use `mediaType.{format|previews}` option instead.
      */
    var accept: js.UndefOr[String] = js.undefined
    
    /**
      * Use `authorization` to send authenticated request, remember `token ` / `bearer ` prefixes. Example: `token 1234567890abcdef1234567890abcdef12345678`
      */
    var authorization: js.UndefOr[String] = js.undefined
    
    /**
      * `user-agent` is set do a default and can be overwritten as needed.
      */
    var `user-agent`: js.UndefOr[String] = js.undefined
  }
  object RequestHeaders {
    
    inline def apply(): RequestHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestHeaders]
    }
    
    extension [Self <: RequestHeaders](x: Self) {
      
      inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
      
      inline def `setUser-agent`(value: String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
      
      inline def `setUser-agentUndefined`: Self = StObject.set(x, "user-agent", js.undefined)
    }
  }
}
