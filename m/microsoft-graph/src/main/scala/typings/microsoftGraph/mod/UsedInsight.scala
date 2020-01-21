package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsedInsight extends Entity {
  var lastUsed: js.UndefOr[UsageDetails] = js.undefined
  var resource: js.UndefOr[Entity] = js.undefined
  var resourceReference: js.UndefOr[ResourceReference] = js.undefined
  var resourceVisualization: js.UndefOr[ResourceVisualization] = js.undefined
}

object UsedInsight {
  @scala.inline
  def apply(
    id: String = null,
    lastUsed: UsageDetails = null,
    resource: Entity = null,
    resourceReference: ResourceReference = null,
    resourceVisualization: ResourceVisualization = null
  ): UsedInsight = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastUsed != null) __obj.updateDynamic("lastUsed")(lastUsed.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceReference != null) __obj.updateDynamic("resourceReference")(resourceReference.asInstanceOf[js.Any])
    if (resourceVisualization != null) __obj.updateDynamic("resourceVisualization")(resourceVisualization.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsedInsight]
  }
}

