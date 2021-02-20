package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyLink extends StObject {
  
  /** Etag of this resource */
  var etag: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#thirdPartyLink". */
  var kind: js.UndefOr[String] = js.native
  
  /** The linking_token identifies a YouTube account and channel with which the third party account is linked. */
  var linkingToken: js.UndefOr[String] = js.native
  
  /** The snippet object contains basic details about the third- party account link. */
  var snippet: js.UndefOr[ThirdPartyLinkSnippet] = js.native
  
  /** The status object contains information about the status of the link. */
  var status: js.UndefOr[ThirdPartyLinkStatus] = js.native
}
object ThirdPartyLink {
  
  @scala.inline
  def apply(): ThirdPartyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThirdPartyLink]
  }
  
  @scala.inline
  implicit class ThirdPartyLinkMutableBuilder[Self <: ThirdPartyLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLinkingToken(value: String): Self = StObject.set(x, "linkingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkingTokenUndefined: Self = StObject.set(x, "linkingToken", js.undefined)
    
    @scala.inline
    def setSnippet(value: ThirdPartyLinkSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
    
    @scala.inline
    def setStatus(value: ThirdPartyLinkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
