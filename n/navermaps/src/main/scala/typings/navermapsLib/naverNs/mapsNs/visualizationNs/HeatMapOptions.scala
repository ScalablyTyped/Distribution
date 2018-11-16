package typings
package navermapsLib.naverNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HeatMapOptions extends js.Object {
  var colorMap: js.UndefOr[SpectrumStyle] = js.undefined
  var data: js.Array[navermapsLib.naverNs.mapsNs.LatLng] | js.Array[navermapsLib.naverNs.mapsNs.PointArrayLiteral] | js.Array[WeightedLocation]
  var map: navermapsLib.naverNs.mapsNs.Map
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
}

