package typings.openlayers.openlayersMod.olx.source

import typings.openlayers.openlayersMod.AttributionLike
import typings.openlayers.openlayersMod.Extent
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.ProjectionLike
import typings.openlayers.openlayersMod.geom.Point
import typings.openlayers.openlayersMod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var attributions: js.UndefOr[AttributionLike] = js.undefined
  var distance: js.UndefOr[Double] = js.undefined
  var extent: js.UndefOr[Extent] = js.undefined
  var format: js.UndefOr[typings.openlayers.openlayersMod.format.Feature] = js.undefined
  var geometryFunction: js.UndefOr[js.Function1[/* feature */ Feature, Point]] = js.undefined
  var logo: js.UndefOr[String] = js.undefined
  var projection: js.UndefOr[ProjectionLike] = js.undefined
  var source: Vector
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    source: Vector,
    attributions: AttributionLike = null,
    distance: Int | Double = null,
    extent: Extent = null,
    format: typings.openlayers.openlayersMod.format.Feature = null,
    geometryFunction: /* feature */ Feature => Point = null,
    logo: String = null,
    projection: ProjectionLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): ClusterOptions = {
    val __obj = js.Dynamic.literal(source = source)
    if (attributions != null) __obj.updateDynamic("attributions")(attributions.asInstanceOf[js.Any])
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (format != null) __obj.updateDynamic("format")(format)
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction1(geometryFunction))
    if (logo != null) __obj.updateDynamic("logo")(logo)
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[ClusterOptions]
  }
}

