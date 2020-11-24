package typings.maximMazurokGapiClientLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntryOperation extends js.Object {
  
  /** Optional. Set this to True if this is the first log entry in the operation. */
  var first: js.UndefOr[Boolean] = js.native
  
  /** Optional. An arbitrary operation identifier. Log entries with the same identifier are assumed to be part of the same operation. */
  var id: js.UndefOr[String] = js.native
  
  /** Optional. Set this to True if this is the last log entry in the operation. */
  var last: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. An arbitrary producer identifier. The combination of id and producer must be globally unique. Examples for producer: "MyDivision.MyBigCompany.com",
    * "github.com/MyProject/MyApplication".
    */
  var producer: js.UndefOr[String] = js.native
}
object LogEntryOperation {
  
  @scala.inline
  def apply(): LogEntryOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntryOperation]
  }
  
  @scala.inline
  implicit class LogEntryOperationOps[Self <: LogEntryOperation] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLast(value: Boolean): Self = this.set("last", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    
    @scala.inline
    def setProducer(value: String): Self = this.set("producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProducer: Self = this.set("producer", js.undefined)
  }
}
