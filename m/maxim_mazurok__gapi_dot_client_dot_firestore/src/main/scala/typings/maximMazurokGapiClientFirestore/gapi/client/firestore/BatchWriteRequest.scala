package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchWriteRequest extends js.Object {
  
  /** Labels associated with this batch write. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.BatchWriteRequest with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The writes to apply. Method does not apply writes atomically and does not guarantee ordering. Each write succeeds or fails independently. You cannot write to the same document more
    * than once per request.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.native
}
object BatchWriteRequest {
  
  @scala.inline
  def apply(): BatchWriteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchWriteRequest]
  }
  
  @scala.inline
  implicit class BatchWriteRequestOps[Self <: BatchWriteRequest] (val x: Self) extends AnyVal {
    
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
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientFirestore.maximMazurokGapiClientFirestoreStrings.BatchWriteRequest with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setWritesVarargs(value: Write*): Self = this.set("writes", js.Array(value :_*))
    
    @scala.inline
    def setWrites(value: js.Array[Write]): Self = this.set("writes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrites: Self = this.set("writes", js.undefined)
  }
}
