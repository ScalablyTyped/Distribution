package typings
package poseDashCoreLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AncestorValue[V] extends js.Object {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var values: ValueMap[V]
}

object AncestorValue {
  @scala.inline
  def apply[V](values: ValueMap[V], label: java.lang.String = null): AncestorValue[V] = {
    val __obj = js.Dynamic.literal(values = values)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[AncestorValue[V]]
  }
}

