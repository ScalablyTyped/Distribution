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

