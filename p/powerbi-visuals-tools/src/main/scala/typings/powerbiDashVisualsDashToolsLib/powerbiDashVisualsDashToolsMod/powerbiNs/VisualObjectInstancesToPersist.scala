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

