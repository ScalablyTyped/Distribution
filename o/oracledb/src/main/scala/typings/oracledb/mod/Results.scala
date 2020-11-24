package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information regarding the outcome of a successful connection.executeMany().
  */
@js.native
trait Results[T] extends js.Object {
  
  /**
    * An array of error objects that were reported during execution.
    *
    * The offset property of each error object corresponds to the 0-based index of the executeMany()
    * binds parameter array, indicating which record could not be processed.
    *
    * It will be present only if batchErrors was true in the executeMany() options parameter and there are
    * data errors to report. Some classes of execution error will always return via the executeMany()
    * callback error object, not in batchErrors.
    */
  var batchErrors: js.UndefOr[js.Array[DBError]] = js.native
  
  /**
    * An array of integers identifying the number of rows affected by each record of the binds parameter.
    *
    * It is present only if dmlRowCounts was true in the executeMany() options parameter and a DML statement
    * was executed.
    */
  var dmlRowCounts: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Contains the value of any returned IN OUT or OUT binds. It is an array of arrays, or an array of objects,
    * depending on the binds parameters structure. The length of the array will correspond to the length of
    * the array passed as the binds parameter. It will be present only if there is at least one OUT bind
    * variable identified.
    */
  var outBinds: js.UndefOr[js.Array[T]] = js.native
  
  /**
    * An integer identifying the total number of database rows affected by the processing of all records
    * of the binds parameter. It is only present if a DML statement was executed.
    */
  var rowsAffected: js.UndefOr[Double] = js.native
}
object Results {
  
  @scala.inline
  def apply[T](): Results[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Results[T]]
  }
  
  @scala.inline
  implicit class ResultsOps[Self <: Results[_], T] (val x: Self with Results[T]) extends AnyVal {
    
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
    def setBatchErrorsVarargs(value: DBError*): Self = this.set("batchErrors", js.Array(value :_*))
    
    @scala.inline
    def setBatchErrors(value: js.Array[DBError]): Self = this.set("batchErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchErrors: Self = this.set("batchErrors", js.undefined)
    
    @scala.inline
    def setDmlRowCountsVarargs(value: Double*): Self = this.set("dmlRowCounts", js.Array(value :_*))
    
    @scala.inline
    def setDmlRowCounts(value: js.Array[Double]): Self = this.set("dmlRowCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDmlRowCounts: Self = this.set("dmlRowCounts", js.undefined)
    
    @scala.inline
    def setOutBindsVarargs(value: T*): Self = this.set("outBinds", js.Array(value :_*))
    
    @scala.inline
    def setOutBinds(value: js.Array[T]): Self = this.set("outBinds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutBinds: Self = this.set("outBinds", js.undefined)
    
    @scala.inline
    def setRowsAffected(value: Double): Self = this.set("rowsAffected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowsAffected: Self = this.set("rowsAffected", js.undefined)
  }
}
