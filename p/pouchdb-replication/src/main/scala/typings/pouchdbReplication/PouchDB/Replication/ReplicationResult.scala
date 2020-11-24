package typings.pouchdbReplication.PouchDB.Replication

import typings.pouchdbCore.PouchDB.Core.ExistingDocument
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationResult[Content /* <: js.Object */] extends js.Object {
  
  var doc_write_failures: Double = js.native
  
  var docs: js.Array[ExistingDocument[Content]] = js.native
  
  var docs_read: Double = js.native
  
  var docs_written: Double = js.native
  
  var errors: js.Array[_] = js.native
  
  var last_seq: Double = js.native
  
  var ok: Boolean = js.native
  
  var start_time: Date = js.native
}
object ReplicationResult {
  
  @scala.inline
  def apply[Content /* <: js.Object */](
    doc_write_failures: Double,
    docs: js.Array[ExistingDocument[Content]],
    docs_read: Double,
    docs_written: Double,
    errors: js.Array[_],
    last_seq: Double,
    ok: Boolean,
    start_time: Date
  ): ReplicationResult[Content] = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationResult[Content]]
  }
  
  @scala.inline
  implicit class ReplicationResultOps[Self <: ReplicationResult[_], Content /* <: js.Object */] (val x: Self with ReplicationResult[Content]) extends AnyVal {
    
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
    def setDoc_write_failures(value: Double): Self = this.set("doc_write_failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocsVarargs(value: ExistingDocument[Content]*): Self = this.set("docs", js.Array(value :_*))
    
    @scala.inline
    def setDocs(value: js.Array[ExistingDocument[Content]]): Self = this.set("docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocs_read(value: Double): Self = this.set("docs_read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocs_written(value: Double): Self = this.set("docs_written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: js.Any*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[_]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_seq(value: Double): Self = this.set("last_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: Date): Self = this.set("start_time", value.asInstanceOf[js.Any])
  }
}
