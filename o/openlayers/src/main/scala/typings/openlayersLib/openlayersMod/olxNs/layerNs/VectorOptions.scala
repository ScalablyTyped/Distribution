package typings
package openlayersLib.openlayersMod.olxNs.layerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorOptions extends js.Object {
  var declutter: js.UndefOr[scala.Boolean] = js.undefined
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var map: js.UndefOr[openlayersLib.openlayersMod.Map] = js.undefined
  var maxResolution: js.UndefOr[scala.Double] = js.undefined
  var minResolution: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var renderBuffer: js.UndefOr[scala.Double] = js.undefined
  var renderMode: js.UndefOr[VectorRenderType | java.lang.String] = js.undefined
  var renderOrder: js.UndefOr[
    js.Function2[
      /* feature1 */ openlayersLib.openlayersMod.Feature, 
      /* feature2 */ openlayersLib.openlayersMod.Feature, 
      scala.Double
    ]
  ] = js.undefined
  var source: openlayersLib.openlayersMod.sourceNs.Vector
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var updateWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var updateWhileInteracting: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

