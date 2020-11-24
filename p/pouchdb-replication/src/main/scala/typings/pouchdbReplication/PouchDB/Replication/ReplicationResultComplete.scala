package typings.pouchdbReplication.PouchDB.Replication

import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationResultComplete[Content /* <: js.Object */] extends ReplicationResult[Content] {
  
  var end_time: Date = js.native
  
  var status: String = js.native
}
object ReplicationResultComplete {
  
  @scala.inline
  def apply[Content /* <: js.Object */](
    doc_write_failures: Double,
    docs: js.Array[ExistingDocument[Content]],
    docs_read: Double,
    docs_written: Double,
    end_time: Date,
    errors: js.Array[_],
    last_seq: Double,
    ok: Boolean,
    start_time: Date,
    status: String
  ): ReplicationResultComplete[Content] = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationResultComplete[Content]]
  }
  
  @scala.inline
  implicit class ReplicationResultCompleteOps[Self <: ReplicationResultComplete[_], Content /* <: js.Object */] (val x: Self with ReplicationResultComplete[Content]) extends AnyVal {
    
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
    def setEnd_time(value: Date): Self = this.set("end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
