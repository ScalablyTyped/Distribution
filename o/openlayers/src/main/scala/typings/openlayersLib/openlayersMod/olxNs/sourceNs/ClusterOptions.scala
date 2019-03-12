package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var distance: js.UndefOr[scala.Double] = js.undefined
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var format: js.UndefOr[openlayersLib.openlayersMod.formatNs.Feature] = js.undefined
  var geometryFunction: js.UndefOr[
    js.Function1[
      /* feature */ openlayersLib.openlayersMod.Feature, 
      openlayersLib.openlayersMod.geomNs.Point
    ]
  ] = js.undefined
  var logo: js.UndefOr[java.lang.String] = js.undefined
  var projection: js.UndefOr[openlayersLib.openlayersMod.ProjectionLike] = js.undefined
  var source: openlayersLib.openlayersMod.sourceNs.Vector
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object ClusterOptions {
  @scala.inline
  def apply(
    source: openlayersLib.openlayersMod.sourceNs.Vector,
    attributions: openlayersLib.openlayersMod.AttributionLike = null,
    distance: scala.Int | scala.Double = null,
    extent: openlayersLib.openlayersMod.Extent = null,
    format: openlayersLib.openlayersMod.formatNs.Feature = null,
    geometryFunction: /* feature */ openlayersLib.openlayersMod.Feature => openlayersLib.openlayersMod.geomNs.Point = null,
    logo: java.lang.String = null,
    projection: openlayersLib.openlayersMod.ProjectionLike = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
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

