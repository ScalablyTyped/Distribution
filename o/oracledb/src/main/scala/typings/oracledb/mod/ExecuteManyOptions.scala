package typings.oracledb.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to control statement execution.
  */
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
  var autoCommit: js.UndefOr[Boolean] = js.undefined
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
  var batchErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the bind variable types, sizes and directions. This object is optional in some cases but it is more efficient to set it.
    *
    * It should be an array or an object, depending on the structure of the binds parameter.
    */
  var bindDefs: js.UndefOr[(Record[String, BindDefinition]) | js.Array[BindDefinition]] = js.undefined
  /**
    * When true, this optional property enables output of the number of rows affected by each input data record.
    * It can only be set true for INSERT, UPDATE, DELETE or MERGE statements.
    *
    * This feature works when node-oracledb is using version 12, or later, of the Oracle client library.
    *
    * @default false
    */
  var dmlRowCounts: js.UndefOr[Boolean] = js.undefined
}

object ExecuteManyOptions {
  @scala.inline
  def apply(
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    batchErrors: js.UndefOr[Boolean] = js.undefined,
    bindDefs: (Record[String, BindDefinition]) | js.Array[BindDefinition] = null,
    dmlRowCounts: js.UndefOr[Boolean] = js.undefined
  ): ExecuteManyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.asInstanceOf[js.Any])
    if (!js.isUndefined(batchErrors)) __obj.updateDynamic("batchErrors")(batchErrors.asInstanceOf[js.Any])
    if (bindDefs != null) __obj.updateDynamic("bindDefs")(bindDefs.asInstanceOf[js.Any])
    if (!js.isUndefined(dmlRowCounts)) __obj.updateDynamic("dmlRowCounts")(dmlRowCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteManyOptions]
  }
}

