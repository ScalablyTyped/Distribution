package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualObjectInstancesToPersist extends js.Object {
  /** Instances which should be merged with existing instances. */
  var merge: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
  /** Instances which should be deleted from the existing instances. */
  var remove: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
  /** Instances which should be deleted from the existing objects. */
  var removeObject: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
  /** Instances which should replace existing instances. */
  var replace: js.UndefOr[js.Array[VisualObjectInstance]] = js.undefined
}

object VisualObjectInstancesToPersist {
  @scala.inline
  def apply(
    merge: js.Array[VisualObjectInstance] = null,
    remove: js.Array[VisualObjectInstance] = null,
    removeObject: js.Array[VisualObjectInstance] = null,
    replace: js.Array[VisualObjectInstance] = null
  ): VisualObjectInstancesToPersist = {
    val __obj = js.Dynamic.literal()
    if (merge != null) __obj.updateDynamic("merge")(merge)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeObject != null) __obj.updateDynamic("removeObject")(removeObject)
    if (replace != null) __obj.updateDynamic("replace")(replace)
    __obj.asInstanceOf[VisualObjectInstancesToPersist]
  }
}

