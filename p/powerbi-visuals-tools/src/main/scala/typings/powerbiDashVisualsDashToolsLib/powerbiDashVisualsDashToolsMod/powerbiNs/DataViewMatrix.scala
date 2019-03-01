package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewMatrix extends js.Object {
  var columns: DataViewHierarchy
  var rows: DataViewHierarchy
  /**
    * The metadata columns of the measure values.
    * In visual DataView, this array is sorted in projection order.
    */
  var valueSources: js.Array[DataViewMetadataColumn]
}

object DataViewMatrix {
  @scala.inline
  def apply(
    columns: DataViewHierarchy,
    rows: DataViewHierarchy,
    valueSources: js.Array[DataViewMetadataColumn]
  ): DataViewMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columns")(columns)
    __obj.updateDynamic("rows")(rows)
    __obj.updateDynamic("valueSources")(valueSources)
    __obj.asInstanceOf[DataViewMatrix]
  }
}

