package typings.openlayers.openlayersMod.olx.style

import typings.openlayers.openlayersStrings.point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text placement. One of `'point'`, `'line'`. Default is `'point'`. Note that
  * `'line'` requires the underlying geometry to be a {@link ol.geom.LineString},
  * {@link ol.geom.Polygon}, {@link ol.geom.MultiLineString} or
  * {@link ol.geom.MultiPolygon}.
  */
/* Rewritten from type alias, can be one of: 
  - typings.openlayers.openlayersStrings.point_
  - typings.openlayers.openlayersStrings.line
*/
trait TextPlacement extends js.Object

object TextPlacement {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def line: typings.openlayers.openlayersStrings.line = this.cast("line")
  @scala.inline
  def point: point_ = this.cast("point")
}

