package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateSessionsResponse extends js.Object {
  
  /** The freshly created sessions. */
  var session: js.UndefOr[js.Array[Session]] = js.native
}
object BatchCreateSessionsResponse {
  
  @scala.inline
  def apply(): BatchCreateSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateSessionsResponse]
  }
  
  @scala.inline
  implicit class BatchCreateSessionsResponseOps[Self <: BatchCreateSessionsResponse] (val x: Self) extends AnyVal {
    
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
    def setSessionVarargs(value: Session*): Self = this.set("session", js.Array(value :_*))
    
    @scala.inline
    def setSession(value: js.Array[Session]): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}
