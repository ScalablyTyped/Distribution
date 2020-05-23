package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trending extends Entity {
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[Entity] = js.undefined
  var resourceReference: js.UndefOr[ResourceReference] = js.undefined
  var resourceVisualization: js.UndefOr[ResourceVisualization] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object Trending {
  @scala.inline
  def apply(
    id: String = null,
    lastModifiedDateTime: String = null,
    resource: Entity = null,
    resourceReference: ResourceReference = null,
    resourceVisualization: ResourceVisualization = null,
    weight: js.UndefOr[Double] = js.undefined
  ): Trending = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (resourceReference != null) __obj.updateDynamic("resourceReference")(resourceReference.asInstanceOf[js.Any])
    if (resourceVisualization != null) __obj.updateDynamic("resourceVisualization")(resourceVisualization.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trending]
  }
}

