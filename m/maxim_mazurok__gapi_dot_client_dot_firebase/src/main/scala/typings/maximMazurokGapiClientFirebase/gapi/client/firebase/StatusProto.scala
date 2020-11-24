package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatusProto extends js.Object {
  
  /** The canonical error code (see codes.proto) that most closely corresponds to this status. May be missing. */
  var canonicalCode: js.UndefOr[Double] = js.native
  
  /** Numeric code drawn from the space specified below. Often, this is the canonical error space, and code is drawn from google3/util/task/codes.proto */
  var code: js.UndefOr[Double] = js.native
  
  /** Detail message */
  var message: js.UndefOr[String] = js.native
  
  /** message_set associates an arbitrary proto message with the status. */
  var messageSet: js.UndefOr[js.Any] = js.native
  
  /** The following are usually only present when code != 0 Space to which this status belongs */
  var space: js.UndefOr[String] = js.native
}
object StatusProto {
  
  @scala.inline
  def apply(): StatusProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusProto]
  }
  
  @scala.inline
  implicit class StatusProtoOps[Self <: StatusProto] (val x: Self) extends AnyVal {
    
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
    def setCanonicalCode(value: Double): Self = this.set("canonicalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanonicalCode: Self = this.set("canonicalCode", js.undefined)
    
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setMessageSet(value: js.Any): Self = this.set("messageSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageSet: Self = this.set("messageSet", js.undefined)
    
    @scala.inline
    def setSpace(value: String): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpace: Self = this.set("space", js.undefined)
  }
}
