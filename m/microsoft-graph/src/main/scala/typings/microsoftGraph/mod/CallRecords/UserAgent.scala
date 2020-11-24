package typings.microsoftGraph.mod.CallRecords

import typings.microsoftGraph.mod.NullableOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserAgent extends js.Object {
  
  // Identifies the version of application software used by this endpoint.
  var applicationVersion: js.UndefOr[NullableOption[String]] = js.native
  
  // User-agent header value reported by this endpoint.
  var headerValue: js.UndefOr[NullableOption[String]] = js.native
}
object UserAgent {
  
  @scala.inline
  def apply(): UserAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAgent]
  }
  
  @scala.inline
  implicit class UserAgentOps[Self <: UserAgent] (val x: Self) extends AnyVal {
    
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
    def setApplicationVersion(value: NullableOption[String]): Self = this.set("applicationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationVersion: Self = this.set("applicationVersion", js.undefined)
    
    @scala.inline
    def setApplicationVersionNull: Self = this.set("applicationVersion", null)
    
    @scala.inline
    def setHeaderValue(value: NullableOption[String]): Self = this.set("headerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderValue: Self = this.set("headerValue", js.undefined)
    
    @scala.inline
    def setHeaderValueNull: Self = this.set("headerValue", null)
  }
}
