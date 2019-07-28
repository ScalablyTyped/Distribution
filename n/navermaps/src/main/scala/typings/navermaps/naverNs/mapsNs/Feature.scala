package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Feature")
@js.native
class Feature protected () extends KVO {
  def this(rawFeature: js.Any) = this()
  def forEachOverlay(callback: forEachOverlayCallback): Unit = js.native
  def getBounds(): Bounds = js.native
  def getGeometries(): js.Array[Geometry] = js.native
  def getId(): String = js.native
  def getOverlays(): js.Array[Marker | Polygon | Polyline] = js.native
  def getProperty(name: String): js.Any = js.native
  def getRaw(): GeoJSON = js.native
  def setProperty(name: String, value: js.Any): Unit = js.native
  def setStyle(styleOptions: StyleOptions): Unit = js.native
}

