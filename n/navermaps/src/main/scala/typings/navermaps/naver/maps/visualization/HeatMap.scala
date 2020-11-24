package typings.navermaps.naver.maps.visualization

import typings.navermaps.naver.maps.LatLng
import typings.navermaps.naver.maps.Map
import typings.navermaps.naver.maps.PointArrayLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatMap extends js.Object {
  
  def getColorMap(): SpectrumStyle = js.native
  
  def getData(): js.Array[LatLng | PointArrayLiteral] = js.native
  
  def getMap(): Map | Null = js.native
  
  def getOptions(): HeatMapOptions = js.native
  def getOptions(key: String): HeatMapOptions = js.native
  
  def redraw(): Unit = js.native
  
  def setColorMap(colormap: SpectrumStyle, inReverse: Boolean): Unit = js.native
  
  def setData(data: js.Array[LatLng | PointArrayLiteral]): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(key: String, value: js.Any): Unit = js.native
  def setOptions(options: HeatMapOptions): Unit = js.native
}
