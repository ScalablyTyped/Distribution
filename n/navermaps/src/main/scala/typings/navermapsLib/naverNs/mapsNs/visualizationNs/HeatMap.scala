package typings
package navermapsLib.naverNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.visualization.HeatMap")
@js.native
class HeatMap () extends js.Object {
  def this(heatMapOptions: HeatMapOptions) = this()
  def getColorMap(): SpectrumStyle = js.native
  def getData(): js.Array[
    navermapsLib.naverNs.mapsNs.LatLng | navermapsLib.naverNs.mapsNs.PointArrayLiteral
  ] = js.native
  def getMap(): navermapsLib.naverNs.mapsNs.Map | scala.Null = js.native
  def getOptions(): HeatMapOptions = js.native
  def getOptions(key: java.lang.String): HeatMapOptions = js.native
  def redraw(): scala.Unit = js.native
  def setColorMap(colormap: SpectrumStyle, inReverse: scala.Boolean): scala.Unit = js.native
  def setData(
    data: js.Array[
      navermapsLib.naverNs.mapsNs.LatLng | navermapsLib.naverNs.mapsNs.PointArrayLiteral
    ]
  ): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: navermapsLib.naverNs.mapsNs.Map): scala.Unit = js.native
  def setOptions(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(options: HeatMapOptions): scala.Unit = js.native
}

