package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentMatcher extends js.Object {
  
  /** String or regex content to match. Maximum 1024 bytes. An empty content string indicates no content matching is to be performed. */
  var content: js.UndefOr[String] = js.native
  
  /** The type of content matcher that will be applied to the server output, compared to the content string when the check is run. */
  var matcher: js.UndefOr[String] = js.native
}
object ContentMatcher {
  
  @scala.inline
  def apply(): ContentMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentMatcher]
  }
  
  @scala.inline
  implicit class ContentMatcherOps[Self <: ContentMatcher] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setMatcher(value: String): Self = this.set("matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatcher: Self = this.set("matcher", js.undefined)
  }
}
