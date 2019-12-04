package typings.popmotionDashPose.poseDashCoreLibTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AncestorValue[V] extends js.Object {
  var label: js.UndefOr[String] = js.undefined
  var values: ValueMap[V]
}

object AncestorValue {
  @scala.inline
  def apply[V](values: ValueMap[V], label: String = null): AncestorValue[V] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AncestorValue[V]]
  }
}

