package typings
package olLib.interactionDragAndDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var formatConstructors: js.UndefOr[js.Array[olLib.formatFeatureMod.default]] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var source: js.UndefOr[olLib.sourceVectorMod.default] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    formatConstructors: js.Array[olLib.formatFeatureMod.default] = null,
    projection: olLib.projMod.ProjectionLike = null,
    source: olLib.sourceVectorMod.default = null,
    target: stdLib.HTMLElement = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (formatConstructors != null) __obj.updateDynamic("formatConstructors")(formatConstructors)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Options]
  }
}

