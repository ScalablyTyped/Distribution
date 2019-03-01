package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents views of a data set. */
trait DataView extends js.Object {
  var categorical: js.UndefOr[DataViewCategorical] = js.undefined
  var matrix: js.UndefOr[DataViewMatrix] = js.undefined
  var metadata: DataViewMetadata
  var scriptResult: js.UndefOr[DataViewScriptResultData] = js.undefined
  var single: js.UndefOr[DataViewSingle] = js.undefined
  var table: js.UndefOr[DataViewTable] = js.undefined
  var tree: js.UndefOr[DataViewTree] = js.undefined
}

object DataView {
  @scala.inline
  def apply(
    metadata: DataViewMetadata,
    categorical: DataViewCategorical = null,
    matrix: DataViewMatrix = null,
    scriptResult: DataViewScriptResultData = null,
    single: DataViewSingle = null,
    table: DataViewTable = null,
    tree: DataViewTree = null
  ): DataView = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("metadata")(metadata)
    if (categorical != null) __obj.updateDynamic("categorical")(categorical)
    if (matrix != null) __obj.updateDynamic("matrix")(matrix)
    if (scriptResult != null) __obj.updateDynamic("scriptResult")(scriptResult)
    if (single != null) __obj.updateDynamic("single")(single)
    if (table != null) __obj.updateDynamic("table")(table)
    if (tree != null) __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[DataView]
  }
}

