package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataViewTree extends js.Object {
  var root: DataViewTreeNode
}

object DataViewTree {
  @scala.inline
  def apply(root: DataViewTreeNode): DataViewTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[DataViewTree]
  }
}

