package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("naver.maps.Panorama")
@js.native
class Panorama protected () extends KVO {
  def this(panoramaDiv: java.lang.String, panoramaOptions: PanoramaOptions) = this()
  def this(panoramaDiv: stdLib.HTMLElement, panoramaOptions: PanoramaOptions) = this()
  def getLocation(): PanoramaLocation = js.native
  def getMaxScale(): scala.Double = js.native
  def getMaxZoom(): scala.Double = js.native
  def getMinScale(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  def getPanoId(): java.lang.String = js.native
  def getPosition(): LatLng = js.native
  def getPov(): PanoramaPov = js.native
  def getProjection(): PanoramaProjection = js.native
  def getScale(): scala.Double = js.native
  def getSize(): Size = js.native
  def getVisible(): scala.Boolean = js.native
  def getZoom(): scala.Double = js.native
  def setOptions(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def setOptions(newOptions: PanoramaOptions): scala.Unit = js.native
  def setPanoId(panoId: java.lang.String): scala.Unit = js.native
  def setPanoIdWithPov(panoId: java.lang.String, pov: PanoramaPov): scala.Unit = js.native
  def setPosition(position: LatLng): scala.Unit = js.native
  def setPosition(position: LatLngLiteral): scala.Unit = js.native
  def setPov(pov: PanoramaPov): scala.Unit = js.native
  def setScale(scale: scala.Double): scala.Unit = js.native
  def setSize(size: Size): scala.Unit = js.native
  def setSize(size: SizeLiteral): scala.Unit = js.native
  def setVisible(visible: scala.Boolean): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
  def zoomIn(): scala.Unit = js.native
  def zoomOut(): scala.Unit = js.native
}

