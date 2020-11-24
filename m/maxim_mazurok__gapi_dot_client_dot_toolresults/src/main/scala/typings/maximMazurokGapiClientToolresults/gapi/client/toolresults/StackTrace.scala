package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackTrace extends js.Object {
  
  /** The stack trace message. Required */
  var exception: js.UndefOr[String] = js.native
}
object StackTrace {
  
  @scala.inline
  def apply(): StackTrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackTrace]
  }
  
  @scala.inline
  implicit class StackTraceOps[Self <: StackTrace] (val x: Self) extends AnyVal {
    
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
    def setException(value: String): Self = this.set("exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteException: Self = this.set("exception", js.undefined)
  }
}
