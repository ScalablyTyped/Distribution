package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information regarding the outcome of a successful connection.executeMany().
  */
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
  var batchErrors: js.UndefOr[js.Array[DBError]] = js.undefined
  /**
    * An array of integers identifying the number of rows affected by each record of the binds parameter.
    *
    * It is present only if dmlRowCounts was true in the executeMany() options parameter and a DML statement
    * was executed.
    */
  var dmlRowCounts: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Contains the value of any returned IN OUT or OUT binds. It is an array of arrays, or an array of objects,
    * depending on the binds parameters structure. The length of the array will correspond to the length of
    * the array passed as the binds parameter. It will be present only if there is at least one OUT bind
    * variable identified.
    */
  var outBinds: js.UndefOr[js.Array[T]] = js.undefined
  /**
    * An integer identifying the total number of database rows affected by the processing of all records
    * of the binds parameter. It is only present if a DML statement was executed.
    */
  var rowsAffected: js.UndefOr[Double] = js.undefined
}

object Results {
  @scala.inline
  def apply[T](
    batchErrors: js.Array[DBError] = null,
    dmlRowCounts: js.Array[Double] = null,
    outBinds: js.Array[T] = null,
    rowsAffected: Int | Double = null
  ): Results[T] = {
    val __obj = js.Dynamic.literal()
    if (batchErrors != null) __obj.updateDynamic("batchErrors")(batchErrors.asInstanceOf[js.Any])
    if (dmlRowCounts != null) __obj.updateDynamic("dmlRowCounts")(dmlRowCounts.asInstanceOf[js.Any])
    if (outBinds != null) __obj.updateDynamic("outBinds")(outBinds.asInstanceOf[js.Any])
    if (rowsAffected != null) __obj.updateDynamic("rowsAffected")(rowsAffected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results[T]]
  }
}

