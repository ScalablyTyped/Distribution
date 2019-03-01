package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisualObjectInstanceEnumerationObject extends js.Object {
  /** Defines a set of containers for related object instances. */
  var containers: js.UndefOr[js.Array[VisualObjectInstanceContainer]] = js.undefined
  /** The visual object instances. */
  var instances: js.Array[VisualObjectInstance]
}

object VisualObjectInstanceEnumerationObject {
  @scala.inline
  def apply(
    instances: js.Array[VisualObjectInstance],
    containers: js.Array[VisualObjectInstanceContainer] = null
  ): VisualObjectInstanceEnumerationObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instances")(instances)
    if (containers != null) __obj.updateDynamic("containers")(containers)
    __obj.asInstanceOf[VisualObjectInstanceEnumerationObject]
  }
}

