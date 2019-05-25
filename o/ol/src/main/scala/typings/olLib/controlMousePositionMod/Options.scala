package typings
package olLib.controlMousePositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var coordinateFormat: js.UndefOr[olLib.coordinateMod.CoordinateFormat] = js.undefined
  var projection: js.UndefOr[olLib.projMod.ProjectionLike] = js.undefined
  var render: js.UndefOr[js.Function1[/* param0 */ olLib.mapEventMod.default, scala.Unit]] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var undefinedHTML: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    coordinateFormat: olLib.coordinateMod.CoordinateFormat = null,
    projection: olLib.projMod.ProjectionLike = null,
    render: /* param0 */ olLib.mapEventMod.default => scala.Unit = null,
    target: stdLib.HTMLElement | java.lang.String = null,
    undefinedHTML: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (coordinateFormat != null) __obj.updateDynamic("coordinateFormat")(coordinateFormat)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (undefinedHTML != null) __obj.updateDynamic("undefinedHTML")(undefinedHTML)
    __obj.asInstanceOf[Options]
  }
}

