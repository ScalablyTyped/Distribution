package typings.openlayers.openlayersMod.olxNs.interactionNs

import org.scalablytyped.runtime.Instantiable0
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.sourceNs.Vector
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndDropOptions extends js.Object {
  var formatConstructors: js.UndefOr[js.Array[Instantiable0[typings.openlayers.openlayersMod.formatNs.Feature]]] = js.undefined
  var projection: ProjectionLike
  var source: js.UndefOr[Vector] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object DragAndDropOptions {
  @scala.inline
  def apply(
    projection: ProjectionLike,
    formatConstructors: js.Array[Instantiable0[typings.openlayers.openlayersMod.formatNs.Feature]] = null,
    source: Vector = null,
    target: Element = null
  ): DragAndDropOptions = {
    val __obj = js.Dynamic.literal(projection = projection.asInstanceOf[js.Any])
    if (formatConstructors != null) __obj.updateDynamic("formatConstructors")(formatConstructors)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DragAndDropOptions]
  }
}

