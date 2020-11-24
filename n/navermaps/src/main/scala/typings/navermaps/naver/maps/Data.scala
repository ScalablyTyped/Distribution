package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Data Layer
@js.native
trait Data extends KVO {
  
  def addFeature(feature: Feature, autoStyle: Boolean): Unit = js.native
  
  def addGeoJson(geojson: GeoJSON, autoStyle: Boolean): Unit = js.native
  
  def addGpx(xmlDoc: GPX, autoStyle: Boolean): Unit = js.native
  
  def addKml(xmlDoc: KML, autoStyle: Boolean): Unit = js.native
  
  def forEach(callback: js.Function2[/* feature */ Feature, /* index */ Double, Unit]): Unit = js.native
  
  def getAllFeature(): js.Array[Feature] = js.native
  
  def getFeatureById(id: String): Feature = js.native
  def getFeatureById(id: Double): Feature = js.native
  
  def getMap(): Map | Null = js.native
  
  def getStyle(): StyleOptions | StylingFunction = js.native
  
  def overrideStyle(feature: Feature, style: StyleOptions): Unit = js.native
  
  def removeFeature(feature: Feature): Unit = js.native
  
  def removeGeoJson(geojson: GeoJSON): Unit = js.native
  
  def revertStyle(feature: Feature): Unit = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setStyle(style: StyleOptions): Unit = js.native
  def setStyle(style: StylingFunction): Unit = js.native
  
  def toGeoJson(): GeoJSON = js.native
}
