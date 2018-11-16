package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Data Layer
@JSGlobal("naver.maps.Data")
@js.native
class Data () extends KVO {
  def addFeature(feature: Feature, autoStyle: scala.Boolean): scala.Unit = js.native
  def addGeoJson(geojson: GeoJSON, autoStyle: scala.Boolean): scala.Unit = js.native
  def addGpx(xmlDoc: GPX, autoStyle: scala.Boolean): scala.Unit = js.native
  def addKml(xmlDoc: KML, autoStyle: scala.Boolean): scala.Unit = js.native
  def forEach(callback: js.Function2[/* feature */ Feature, /* index */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getAllFeature(): js.Array[Feature] = js.native
  def getFeatureById(id: java.lang.String): Feature = js.native
  def getFeatureById(id: scala.Double): Feature = js.native
  def getMap(): Map | scala.Null = js.native
  def getStyle(): StyleOptions | StylingFunction = js.native
  def overrideStyle(feature: Feature, style: StyleOptions): scala.Unit = js.native
  def removeFeature(feature: Feature): scala.Unit = js.native
  def removeGeoJson(geojson: GeoJSON): scala.Unit = js.native
  def revertStyle(feature: Feature): scala.Unit = js.native
  def setMap(): scala.Unit = js.native
  def setMap(map: Map): scala.Unit = js.native
  def setStyle(style: StyleOptions): scala.Unit = js.native
  def setStyle(style: StylingFunction): scala.Unit = js.native
  def toGeoJson(): GeoJSON = js.native
}

