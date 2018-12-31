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

