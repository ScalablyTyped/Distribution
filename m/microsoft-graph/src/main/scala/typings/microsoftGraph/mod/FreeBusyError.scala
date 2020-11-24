package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusyError extends js.Object {
  
  // Describes the error.
  var message: js.UndefOr[NullableOption[String]] = js.native
  
  // The response code from querying for the availability of the user, distribution list, or resource.
  var responseCode: js.UndefOr[NullableOption[String]] = js.native
}
object FreeBusyError {
  
  @scala.inline
  def apply(): FreeBusyError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyError]
  }
  
  @scala.inline
  implicit class FreeBusyErrorOps[Self <: FreeBusyError] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: NullableOption[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    
    @scala.inline
    def setResponseCode(value: NullableOption[String]): Self = this.set("responseCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseCode: Self = this.set("responseCode", js.undefined)
    
    @scala.inline
    def setResponseCodeNull: Self = this.set("responseCode", null)
  }
}
