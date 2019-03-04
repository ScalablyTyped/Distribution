package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewTable extends js.Object {
  var columns: js.Array[DataViewMetadataColumn]
  var identity: js.UndefOr[js.Array[DataViewScopeIdentity]] = js.undefined
  /** The set of expressions that define the identity for rows of the table.  This must match items in the DataViewScopeIdentity in the identity. */
  var identityFields: js.UndefOr[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ]
  ] = js.undefined
  var rows: js.UndefOr[js.Array[DataViewTableRow]] = js.undefined
  var totals: js.UndefOr[js.Array[PrimitiveValue]] = js.undefined
}

object DataViewTable {
  @scala.inline
  def apply(
    columns: js.Array[DataViewMetadataColumn],
    identity: js.Array[DataViewScopeIdentity] = null,
    identityFields: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ] = null,
    rows: js.Array[DataViewTableRow] = null,
    totals: js.Array[PrimitiveValue] = null
  ): DataViewTable = {
    val __obj = js.Dynamic.literal(columns = columns)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (identityFields != null) __obj.updateDynamic("identityFields")(identityFields)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (totals != null) __obj.updateDynamic("totals")(totals)
    __obj.asInstanceOf[DataViewTable]
  }
}

