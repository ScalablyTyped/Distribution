package typings.ol.interactionDragAndDropMod

import typings.ol.projMod.ProjectionLike
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var formatConstructors: js.UndefOr[js.Array[typings.ol.formatFeatureMod.default]] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default]] = js.undefined
  var target: js.UndefOr[HTMLElement] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    formatConstructors: js.Array[typings.ol.formatFeatureMod.default] = null,
    projection: ProjectionLike = null,
    source: typings.ol.sourceVectorMod.default[typings.ol.geomGeometryMod.default] = null,
    target: HTMLElement = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (formatConstructors != null) __obj.updateDynamic("formatConstructors")(formatConstructors.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

