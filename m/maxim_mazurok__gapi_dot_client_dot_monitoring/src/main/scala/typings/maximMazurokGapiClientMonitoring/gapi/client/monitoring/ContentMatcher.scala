package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentMatcher extends StObject {
  
  /** String or regex content to match. Maximum 1024 bytes. An empty content string indicates no content matching is to be performed. */
  var content: js.UndefOr[String] = js.undefined
  
  /** The type of content matcher that will be applied to the server output, compared to the content string when the check is run. */
  var matcher: js.UndefOr[String] = js.undefined
}
object ContentMatcher {
  
  inline def apply(): ContentMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentMatcher]
  }
  
  extension [Self <: ContentMatcher](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setMatcher(value: String): Self = StObject.set(x, "matcher", value.asInstanceOf[js.Any])
    
    inline def setMatcherUndefined: Self = StObject.set(x, "matcher", js.undefined)
  }
}
