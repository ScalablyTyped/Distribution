package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedInsight extends Entity {
  var lastShared: js.UndefOr[SharingDetail] = js.undefined
  var lastSharedMethod: js.UndefOr[Entity] = js.undefined
  var resource: js.UndefOr[Entity] = js.undefined
  var resourceReference: js.UndefOr[ResourceReference] = js.undefined
  var resourceVisualization: js.UndefOr[ResourceVisualization] = js.undefined
  var sharingHistory: js.UndefOr[js.Array[SharingDetail]] = js.undefined
}

object SharedInsight {
  @scala.inline
  def apply(
    id: String = null,
    lastShared: SharingDetail = null,
    lastSharedMethod: Entity = null,
    resource: Entity = null,
    resourceReference: ResourceReference = null,
    resourceVisualization: ResourceVisualization = null,
    sharingHistory: js.Array[SharingDetail] = null
  ): SharedInsight = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastShared != null) __obj.updateDynamic("lastShared")(lastShared)
    if (lastSharedMethod != null) __obj.updateDynamic("lastSharedMethod")(lastSharedMethod)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (resourceReference != null) __obj.updateDynamic("resourceReference")(resourceReference)
    if (resourceVisualization != null) __obj.updateDynamic("resourceVisualization")(resourceVisualization)
    if (sharingHistory != null) __obj.updateDynamic("sharingHistory")(sharingHistory)
    __obj.asInstanceOf[SharedInsight]
  }
}

