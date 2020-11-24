package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThirdPartyLink extends js.Object {
  
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
  implicit class ThirdPartyLinkOps[Self <: ThirdPartyLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLinkingToken(value: String): Self = this.set("linkingToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkingToken: Self = this.set("linkingToken", js.undefined)
    
    @scala.inline
    def setSnippet(value: ThirdPartyLinkSnippet): Self = this.set("snippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    
    @scala.inline
    def setStatus(value: ThirdPartyLinkStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
