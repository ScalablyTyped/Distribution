package typings.openlayers.openlayersMod.olx.interaction

import org.scalablytyped.runtime.Instantiable0
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.source.Vector
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndDropOptions extends js.Object {
  var formatConstructors: js.UndefOr[js.Array[Instantiable0[typings.openlayers.openlayersMod.format.Feature]]] = js.undefined
  var projection: ProjectionLike
  var source: js.UndefOr[Vector] = js.undefined
  var target: js.UndefOr[Element] = js.undefined
}

object DragAndDropOptions {
  @scala.inline
  def apply(
    formatConstructors: js.Array[Instantiable0[typings.openlayers.openlayersMod.format.Feature]] = null,
    projection: ProjectionLike = null,
    source: Vector = null,
    target: Element = null
  ): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    if (formatConstructors != null) __obj.updateDynamic("formatConstructors")(formatConstructors.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragAndDropOptions]
  }
}

