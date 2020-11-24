package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexMatcher extends js.Object {
  
  /** Google's RE2 regex engine. */
  var googleRe2: js.UndefOr[GoogleRE2] = js.native
  
  /** The regex match string. The string must be supported by the configured engine. */
  var regex: js.UndefOr[String] = js.native
}
object RegexMatcher {
  
  @scala.inline
  def apply(): RegexMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegexMatcher]
  }
  
  @scala.inline
  implicit class RegexMatcherOps[Self <: RegexMatcher] (val x: Self) extends AnyVal {
    
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
    def setGoogleRe2(value: GoogleRE2): Self = this.set("googleRe2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleRe2: Self = this.set("googleRe2", js.undefined)
    
    @scala.inline
    def setRegex(value: String): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
}
