package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewHierarchyLevel extends js.Object {
  /**
    * The metadata columns of this hierarchy level.
    * In visual DataView, this array is sorted in projection order.
    */
  var sources: js.Array[DataViewMetadataColumn]
}

object DataViewHierarchyLevel {
  @scala.inline
  def apply(sources: js.Array[DataViewMetadataColumn]): DataViewHierarchyLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sources")(sources)
    __obj.asInstanceOf[DataViewHierarchyLevel]
  }
}

