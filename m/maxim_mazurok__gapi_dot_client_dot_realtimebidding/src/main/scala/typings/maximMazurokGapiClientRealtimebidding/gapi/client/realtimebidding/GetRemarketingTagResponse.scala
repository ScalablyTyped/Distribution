package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRemarketingTagResponse extends StObject {
  
  /**
    * A HTML tag that can be placed on the advertiser's page to add users to a user list. For more information and code samples on using snippet on your website refer to [Tag your site
    * for remarketing]( https://support.google.com/google-ads/answer/2476688).
    */
  var snippet: js.UndefOr[String] = js.undefined
}
object GetRemarketingTagResponse {
  
  inline def apply(): GetRemarketingTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRemarketingTagResponse]
  }
  
  extension [Self <: GetRemarketingTagResponse](x: Self) {
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
