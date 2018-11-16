package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Map
@JSGlobal("naver.maps.Map")
@js.native
class Map protected () extends KVO {
  def this(mapDiv: java.lang.String) = this()
  def this(mapDiv: stdLib.HTMLElement) = this()
  def this(mapDiv: java.lang.String, mapOptions: MapOptions) = this()
  def this(mapDiv: stdLib.HTMLElement, mapOptions: MapOptions) = this()
  var controls: js.Any = js.native
  var data: js.Any = js.native
  var layers: js.Any = js.native
  var mapSystemProjection: js.Any = js.native
  var mapTypes: js.Any = js.native
  def addPane(name: java.lang.String, elementOrIndex: scala.Double): scala.Unit = js.native
  def addPane(name: java.lang.String, elementOrIndex: stdLib.HTMLElement): scala.Unit = js.native
  def destory(): scala.Unit = js.native
  def fitBounds(bounds: js.Any): scala.Unit = js.native
  def fitBounds(bounds: js.Any, margin: js.Any): scala.Unit = js.native
  def getBounds(): Bounds = js.native
  def getCenter(): Coord = js.native
  def getCenterPoint(): Coord = js.native
  def getElement(): stdLib.HTMLElement = js.native
  def getMapTypeId(): java.lang.String = js.native
  def getOptions(): js.Any = js.native
  def getOptions(key: java.lang.String): js.Any = js.native
  def getPanes(): MapPanes = js.native
  def getPrimitiveProjection(): Projection = js.native
  def getProjection(): MapSystemProjection = js.native
  def getSize(): Size = js.native
  def getZoom(): scala.Double = js.native
  def morph(coord: Coord | CoordLiteral): scala.Unit = js.native
  def morph(coord: Coord | CoordLiteral, zoom: scala.Double): scala.Unit = js.native
  def morph(coord: Coord | CoordLiteral, zoom: scala.Double, transitionOptions: TransitionOptions): scala.Unit = js.native
  def panBy(offset: Point): scala.Unit = js.native
  def panBy(offset: PointLiteral): scala.Unit = js.native
  def panTo(coord: Coord | CoordLiteral, transitionOptions: TransitionOptions): scala.Unit = js.native
  def panToBounds(bounds: Bounds | BoundsLiteral, transitionOptions: TransitionOptions): scala.Unit = js.native
  def panToBounds(bounds: Bounds | BoundsLiteral, transitionOptions: TransitionOptions, margin: Margin): scala.Unit = js.native
  def refresh(): scala.Unit = js.native
  def refresh(noEffect: scala.Boolean): scala.Unit = js.native
  def removePane(name: java.lang.String): scala.Unit = js.native
  def setCenter(center: Coord | CoordLiteral): scala.Unit = js.native
  def setCenterPoint(point: Point): scala.Unit = js.native
  def setCenterPoint(point: PointLiteral): scala.Unit = js.native
  def setMapTypeId(mapTypeId: java.lang.String): scala.Unit = js.native
  def setOptions(newOptionsOrKey: js.Any): scala.Unit = js.native
  def setOptions(newOptionsOrKey: js.Any, value: js.Any): scala.Unit = js.native
  def setSize(size: Size): scala.Unit = js.native
  def setSize(size: SizeLiteral): scala.Unit = js.native
  def setZoom(zoom: scala.Double): scala.Unit = js.native
  def setZoom(zoom: scala.Double, effect: scala.Boolean): scala.Unit = js.native
  def updateBy(coord: Coord | CoordLiteral, zoom: scala.Double): scala.Unit = js.native
  def zoomBy(deltaZoom: scala.Double): scala.Unit = js.native
  def zoomBy(deltaZoom: scala.Double, zoomOrigin: Coord | CoordLiteral): scala.Unit = js.native
  def zoomBy(deltaZoom: scala.Double, zoomOrigin: Coord | CoordLiteral, effect: scala.Boolean): scala.Unit = js.native
}

