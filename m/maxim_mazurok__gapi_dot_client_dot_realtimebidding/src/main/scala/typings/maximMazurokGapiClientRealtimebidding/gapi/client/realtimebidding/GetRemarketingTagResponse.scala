package typings.maximMazurokGapiClientRealtimebidding.gapi.client.realtimebidding

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRemarketingTagResponse extends StObject {
  
  /**
    * A HTML tag that can be placed on the advertiser's page to add users to a user list. For more information and code samples on using snippet on your website refer to [Tag your site
    * for remarketing]( https://support.google.com/google-ads/answer/2476688).
    */
  var snippet: js.UndefOr[String] = js.native
}
object GetRemarketingTagResponse {
  
  @scala.inline
  def apply(): GetRemarketingTagResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRemarketingTagResponse]
  }
  
  @scala.inline
  implicit class GetRemarketingTagResponseMutableBuilder[Self <: GetRemarketingTagResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
