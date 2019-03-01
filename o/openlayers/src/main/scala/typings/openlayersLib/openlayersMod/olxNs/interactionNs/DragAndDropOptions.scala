package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragAndDropOptions extends js.Object {
  var formatConstructors: js.UndefOr[
    js.Array[
      org.scalablytyped.runtime.Instantiable0[openlayersLib.openlayersMod.formatNs.Feature]
    ]
  ] = js.undefined
  var projection: openlayersLib.openlayersMod.ProjectionLike
  var source: js.UndefOr[openlayersLib.openlayersMod.sourceNs.Vector] = js.undefined
  var target: js.UndefOr[stdLib.Element] = js.undefined
}

object DragAndDropOptions {
  @scala.inline
  def apply(
    projection: openlayersLib.openlayersMod.ProjectionLike,
    formatConstructors: js.Array[
      org.scalablytyped.runtime.Instantiable0[openlayersLib.openlayersMod.formatNs.Feature]
    ] = null,
    source: openlayersLib.openlayersMod.sourceNs.Vector = null,
    target: stdLib.Element = null
  ): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (formatConstructors != null) __obj.updateDynamic("formatConstructors")(formatConstructors)
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DragAndDropOptions]
  }
}

