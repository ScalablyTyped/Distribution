package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewHierarchy extends js.Object {
  var levels: js.Array[DataViewHierarchyLevel]
  var root: DataViewMatrixNode
}

object DataViewHierarchy {
  @scala.inline
  def apply(levels: js.Array[DataViewHierarchyLevel], root: DataViewMatrixNode): DataViewHierarchy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("levels")(levels)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[DataViewHierarchy]
  }
}

