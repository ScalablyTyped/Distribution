package typings.oracledb.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure to configure the properties of a B-Tree Index.
  *
  * @see https://docs.oracle.com/en/database/oracle/simple-oracle-document-access/adsdi/soda-index-specifications-reference.html#GUID-00C06941-6FFD-4CEB-81B6-9A7FBD577A2C
  */
trait BTreeIndex extends js.Object {
  /** Each object targets a field in the indexed documents that has a scalar JSON value. */
  var fields: js.Array[BTreeIndexField]
  /**
    * Specifies whether or not to index NULL values for the selected columns (by appending the numeric value 1 to the list of columns to index).
    *
    * @default false
    */
  var indexNulls: js.UndefOr[Boolean] = js.undefined
  /** Name of the index. */
  var name: String
  /**
    * Specifies whether or not the index is unique.
    *
    * @default false
    */
  var unique: js.UndefOr[Boolean] = js.undefined
}

object BTreeIndex {
  @scala.inline
  def apply(
    fields: js.Array[BTreeIndexField],
    name: String,
    indexNulls: js.UndefOr[Boolean] = js.undefined,
    unique: js.UndefOr[Boolean] = js.undefined
  ): BTreeIndex = {
    val __obj = js.Dynamic.literal(fields = fields, name = name)
    if (!js.isUndefined(indexNulls)) __obj.updateDynamic("indexNulls")(indexNulls)
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique)
    __obj.asInstanceOf[BTreeIndex]
  }
}

