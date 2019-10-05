package typings.ol.controlMousePositionMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.coordinateMod.CoordinateFormat
import typings.ol.projMod.ProjectionLike
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var coordinateFormat: js.UndefOr[CoordinateFormat] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var render: js.UndefOr[js.Function1[/* p0 */ typings.ol.mapEventMod.default, Unit]] = js.undefined
  var target: js.UndefOr[HTMLElement | String] = js.undefined
  var undefinedHTML: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: String = null,
    coordinateFormat: /* p0 */ js.UndefOr[Coordinate] => String = null,
    projection: ProjectionLike = null,
    render: /* p0 */ typings.ol.mapEventMod.default => Unit = null,
    target: HTMLElement | String = null,
    undefinedHTML: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (coordinateFormat != null) __obj.updateDynamic("coordinateFormat")(js.Any.fromFunction1(coordinateFormat))
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (undefinedHTML != null) __obj.updateDynamic("undefinedHTML")(undefinedHTML)
    __obj.asInstanceOf[Options]
  }
}

