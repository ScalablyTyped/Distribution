package typings.octokitTypes.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @octokit/types.@octokit/types/dist-types/RequestHeaders.RequestHeaders & {  accept :string,   user-agent :string} */
trait RequestHeadersacceptstrin
  extends StObject
     with /* header */ StringDictionary[js.UndefOr[String | Double]] {
  
  /**
    * Avoid setting `headers.accept`, use `mediaType.{format|previews}` option instead.
    */
  var accept: js.UndefOr[String] & String
  
  /**
    * Use `authorization` to send authenticated request, remember `token ` / `bearer ` prefixes. Example: `token 1234567890abcdef1234567890abcdef12345678`
    */
  var authorization: js.UndefOr[String] = js.undefined
  
  /**
    * `user-agent` is set do a default and can be overwritten as needed.
    */
  var `user-agent`: js.UndefOr[String] & String
}
object RequestHeadersacceptstrin {
  
  inline def apply(accept: js.UndefOr[String] & String, `user-agent`: js.UndefOr[String] & String): RequestHeadersacceptstrin = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.updateDynamic("user-agent")(`user-agent`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHeadersacceptstrin]
  }
  
  extension [Self <: RequestHeadersacceptstrin](x: Self) {
    
    inline def setAccept(value: js.UndefOr[String] & String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def `setUser-agent`(value: js.UndefOr[String] & String): Self = StObject.set(x, "user-agent", value.asInstanceOf[js.Any])
  }
}
