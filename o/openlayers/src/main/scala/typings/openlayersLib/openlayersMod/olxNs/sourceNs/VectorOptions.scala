package typings
package openlayersLib.openlayersMod.olxNs.sourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorOptions extends js.Object {
  var attributions: js.UndefOr[openlayersLib.openlayersMod.AttributionLike] = js.undefined
  var features: js.UndefOr[
    js.Array[openlayersLib.openlayersMod.Feature] | openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]
  ] = js.undefined
  var format: js.UndefOr[openlayersLib.openlayersMod.formatNs.Feature] = js.undefined
  var loader: js.UndefOr[openlayersLib.openlayersMod.FeatureLoader] = js.undefined
  var logo: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.olxNs.LogoOptions] = js.undefined
  var overlaps: js.UndefOr[scala.Boolean] = js.undefined
  var strategy: js.UndefOr[openlayersLib.openlayersMod.LoadingStrategy] = js.undefined
  var url: js.UndefOr[java.lang.String | openlayersLib.openlayersMod.FeatureUrlFunction] = js.undefined
  var useSpatialIndex: js.UndefOr[scala.Boolean] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

