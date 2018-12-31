package typings
package openlayersLib.openlayersMod.olxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object literal with config options for the projection.
  */
trait ProjectionOptions extends js.Object {
  var axisOrientation: js.UndefOr[java.lang.String] = js.undefined
  var code: java.lang.String
  var extent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
  var getPointResolution: js.UndefOr[
    js.Function2[
      /* resolution */ scala.Double, 
      /* coords */ openlayersLib.openlayersMod.Coordinate, 
      scala.Double
    ]
  ] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var metersPerUnit: js.UndefOr[scala.Double] = js.undefined
  var units: js.UndefOr[openlayersLib.openlayersMod.projNs.Units | java.lang.String] = js.undefined
  var worldExtent: js.UndefOr[openlayersLib.openlayersMod.Extent] = js.undefined
}

