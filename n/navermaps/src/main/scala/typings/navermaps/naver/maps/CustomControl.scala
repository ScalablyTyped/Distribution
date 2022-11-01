package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Deprecated!!
// See https://navermaps.github.io/maps.js.ncp/docs/naver.maps.NaverMapTypeOptions.html
// class NaverMapTypeOptions {
//     static getBicycleLayer(opts: NaverImageMapTypeOptions): ImageMapType;
//     static getBlankMap(opts: NaverImageMapTypeOptions): ImageMapType;
//     static getCadastralLayer(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getHybridMap(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getMapTypes(opts?: NaverImageMapTypeOptions): MapTypeRegistry;
//     static getNormalLabelLayer(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getNormalMap(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getSatelliteLabelLayer(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getSatelliteMap(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getStreetLayer(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getTerrainMap(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getTrafficLayer(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getVectorMap(opts?: NaverImageMapTypeOptions): ImageMapType;
//     static getWorldMap(opts?: NaverImageMapTypeOptions): ImageMapType;
// }
/**
  * CustomControl
  */
@js.native
trait CustomControl
  extends StObject
     with KVO {
  
  def getElement(): HTMLElement = js.native
  
  def getMap(): Map | Null = js.native
  
  def getOptions(): Any = js.native
  def getOptions(key: String): Any = js.native
  
  def html(): String = js.native
  def html(html: String): String = js.native
  
  def setMap(): Unit = js.native
  def setMap(map: Map): Unit = js.native
  
  def setOptions(newOptions: ControlOptions): Unit = js.native
  
  def setPosition(position: Position): Unit = js.native
}
