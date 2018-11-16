package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Feature")
@js.native
class Feature protected () extends KVO {
  def this(rawFeature: js.Any) = this()
  def forEachOverlay(callback: forEachOverlayCallback): scala.Unit = js.native
  def getBounds(): Bounds = js.native
  def getGeometries(): js.Array[Geometry] = js.native
  def getId(): java.lang.String = js.native
  def getOverlays(): js.Array[Marker] | js.Array[Polyline] | js.Array[Polygon] = js.native
  def getProperty(name: java.lang.String): js.Any = js.native
  def getRaw(): GeoJSON = js.native
  def setProperty(name: java.lang.String, value: js.Any): scala.Unit = js.native
  def setStyle(styleOptions: StyleOptions): scala.Unit = js.native
}

