package typings.oracledb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of connection.getStatementInfo().
  */
trait StatementInfo[T] extends js.Object {
  /** Array of strings corresponding to the unique names of the bind variables used in the SQL statement. */
  var bindNames: js.UndefOr[js.Array[String]] = js.undefined
  /** Extended metadata properties. */
  var metaData: js.UndefOr[js.Array[Metadata[T]]] = js.undefined
  /** One of the SQL Statement Type Constants. */
  var statementType: js.UndefOr[Double] = js.undefined
}

object StatementInfo {
  @scala.inline
  def apply[T](
    bindNames: js.Array[String] = null,
    metaData: js.Array[Metadata[T]] = null,
    statementType: js.UndefOr[Double] = js.undefined
  ): StatementInfo[T] = {
    val __obj = js.Dynamic.literal()
    if (bindNames != null) __obj.updateDynamic("bindNames")(bindNames.asInstanceOf[js.Any])
    if (metaData != null) __obj.updateDynamic("metaData")(metaData.asInstanceOf[js.Any])
    if (!js.isUndefined(statementType)) __obj.updateDynamic("statementType")(statementType.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatementInfo[T]]
  }
}

