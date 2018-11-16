package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataViewValueColumns
  extends stdLib.Array[DataViewValueColumn] {
  /** The set of expressions that define the identity for instances of the value group.  This must match items in the DataViewScopeIdentity in the grouped items result. */
  var identityFields: js.UndefOr[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQExpr
    ]
  ] = js.native
  var source: js.UndefOr[DataViewMetadataColumn] = js.native
  /** Returns an array that groups the columns in this group together. */
  def grouped(): js.Array[DataViewValueColumnGroup] = js.native
}

