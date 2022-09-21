package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panorama
  extends StObject
     with KVO {
  
  var aroundControl: AroundControl | Null = js.native
  
  var controls: js.Array[KVOArray] = js.native
  
  def getLocation(): PanoramaLocation = js.native
  
  def getMaxScale(): Double = js.native
  
  def getMaxZoom(): Double = js.native
  
  def getMinScale(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  def getPanoId(): String = js.native
  
  def getPosition(): LatLng = js.native
  
  def getPov(): PanoramaPov = js.native
  
  def getProjection(): PanoramaProjection = js.native
  
  def getScale(): Double = js.native
  
  def getSize(): Size = js.native
  
  def getVisible(): Boolean = js.native
  
  def getZoom(): Double = js.native
  
  def setOptions(key: String, value: Any): Unit = js.native
  def setOptions(newOptions: PanoramaOptions): Unit = js.native
  
  def setPanoId(panoId: String): Unit = js.native
  
  def setPanoIdWithPov(panoId: String, pov: PanoramaPov): Unit = js.native
  
  def setPosition(position: LatLng): Unit = js.native
  def setPosition(position: LatLngLiteral): Unit = js.native
  
  def setPov(pov: PanoramaPov): Unit = js.native
  
  def setScale(scale: Double): Unit = js.native
  
  def setSize(size: Size): Unit = js.native
  def setSize(size: SizeLiteral): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
  
  def setZoom(zoom: Double): Unit = js.native
  
  def zoomIn(): Unit = js.native
  
  def zoomOut(): Unit = js.native
}
