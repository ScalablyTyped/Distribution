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

