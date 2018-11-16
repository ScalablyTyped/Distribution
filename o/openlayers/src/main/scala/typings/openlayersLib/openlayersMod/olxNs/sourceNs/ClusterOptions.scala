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

