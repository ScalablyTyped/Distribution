package typings.oracledb.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to control statement execution.
  */
@js.native
trait ExecuteManyOptions extends js.Object {
  
  /**
    * If true, the transaction in the current connection is automatically committed at the end of statement execution.
    *
    * This optional property overrides oracledb.autoCommit.
    *
    * Note batchErrors can affect autocommit mode.
    *
    * @default false
    */
  var autoCommit: js.UndefOr[Boolean] = js.native
  
  /**
    * This optional property allows invalid data records to be rejected while still letting valid data be processed.
    * It can only be set true for INSERT, UPDATE, DELETE or MERGE statements.
    *
    * When false, the executeMany() call will stop when the first error occurs.The callback error object will be set.
    *
    * When batchErrors is true, processing will continue even if there are data errors.
    * The executeMany() callback error parameter is not set. Instead, an array containing an error per
    * input data record will be returned in the callback result parameter. All valid data records will
    * be processed and a transaction will be started but not committed, even if autoCommit is true.
    * The application can examine the errors, take action, and explicitly commit or rollback as desired.
    *
    * Note that some classes of error will always return via the executeMany() callback error object,
    * not as batch errors. No transaction is created in this case.
    *
    * @default false
    */
  var batchErrors: js.UndefOr[Boolean] = js.native
  
  /**
    * Defines the bind variable types, sizes and directions. This object is optional in some cases but it is more efficient to set it.
    *
    * It should be an array or an object, depending on the structure of the binds parameter.
    */
  var bindDefs: js.UndefOr[(Record[String, BindDefinition]) | js.Array[BindDefinition]] = js.native
  
  /**
    * When true, this optional property enables output of the number of rows affected by each input data record.
    * It can only be set true for INSERT, UPDATE, DELETE or MERGE statements.
    *
    * This feature works when node-oracledb is using version 12, or later, of the Oracle client library.
    *
    * @default false
    */
  var dmlRowCounts: js.UndefOr[Boolean] = js.native
}
object ExecuteManyOptions {
  
  @scala.inline
  def apply(): ExecuteManyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteManyOptions]
  }
  
  @scala.inline
  implicit class ExecuteManyOptionsOps[Self <: ExecuteManyOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoCommit(value: Boolean): Self = this.set("autoCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCommit: Self = this.set("autoCommit", js.undefined)
    
    @scala.inline
    def setBatchErrors(value: Boolean): Self = this.set("batchErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchErrors: Self = this.set("batchErrors", js.undefined)
    
    @scala.inline
    def setBindDefsVarargs(value: BindDefinition*): Self = this.set("bindDefs", js.Array(value :_*))
    
    @scala.inline
    def setBindDefs(value: (Record[String, BindDefinition]) | js.Array[BindDefinition]): Self = this.set("bindDefs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindDefs: Self = this.set("bindDefs", js.undefined)
    
    @scala.inline
    def setDmlRowCounts(value: Boolean): Self = this.set("dmlRowCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDmlRowCounts: Self = this.set("dmlRowCounts", js.undefined)
  }
}
