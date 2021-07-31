package typings.navermaps.naver.maps

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map
@js.native
trait Map
  extends StObject
     with KVO {
  
  def addPane(name: String, elementOrIndex: Double): Unit = js.native
  def addPane(name: String, elementOrIndex: HTMLElement): Unit = js.native
  
  var controls: js.Any = js.native
  
  var data: js.Any = js.native
  
  def destory(): Unit = js.native
  
  def fitBounds(bounds: js.Any): Unit = js.native
  def fitBounds(bounds: js.Any, margin: js.Any): Unit = js.native
  
  def getBounds(): Bounds = js.native
  
  def getCenter(): Coord = js.native
  
  def getCenterPoint(): Coord = js.native
  
  def getElement(): HTMLElement = js.native
  
  def getMapTypeId(): String = js.native
  
  def getOptions(): js.Any = js.native
  def getOptions(key: String): js.Any = js.native
  
  def getPanes(): MapPanes = js.native
  
  def getPrimitiveProjection(): Projection = js.native
  
  def getProjection(): MapSystemProjection = js.native
  
  def getSize(): Size = js.native
  
  def getZoom(): Double = js.native
  
  var layers: js.Any = js.native
  
  var mapSystemProjection: js.Any = js.native
  
  var mapTypes: js.Any = js.native
  
  def morph(coord: Coord): Unit = js.native
  def morph(coord: CoordLiteral): Unit = js.native
  def morph(coord: CoordLiteral, zoom: Double): Unit = js.native
  def morph(coord: CoordLiteral, zoom: Double, transitionOptions: TransitionOptions): Unit = js.native
  def morph(coord: CoordLiteral, zoom: Unit, transitionOptions: TransitionOptions): Unit = js.native
  def morph(coord: Coord, zoom: Double): Unit = js.native
  def morph(coord: Coord, zoom: Double, transitionOptions: TransitionOptions): Unit = js.native
  def morph(coord: Coord, zoom: Unit, transitionOptions: TransitionOptions): Unit = js.native
  
  def panBy(offset: Point): Unit = js.native
  def panBy(offset: PointLiteral): Unit = js.native
  
  def panTo(coord: CoordLiteral, transitionOptions: TransitionOptions): Unit = js.native
  def panTo(coord: Coord, transitionOptions: TransitionOptions): Unit = js.native
  
  def panToBounds(bounds: BoundsLiteral, transitionOptions: TransitionOptions): Unit = js.native
  def panToBounds(bounds: BoundsLiteral, transitionOptions: TransitionOptions, margin: Margin): Unit = js.native
  def panToBounds(bounds: Bounds, transitionOptions: TransitionOptions): Unit = js.native
  def panToBounds(bounds: Bounds, transitionOptions: TransitionOptions, margin: Margin): Unit = js.native
  
  def refresh(): Unit = js.native
  def refresh(noEffect: Boolean): Unit = js.native
  
  def removePane(name: String): Unit = js.native
  
  def setCenter(center: Coord): Unit = js.native
  def setCenter(center: CoordLiteral): Unit = js.native
  
  def setCenterPoint(point: Point): Unit = js.native
  def setCenterPoint(point: PointLiteral): Unit = js.native
  
  def setMapTypeId(mapTypeId: String): Unit = js.native
  
  def setOptions(newOptionsOrKey: js.Any): Unit = js.native
  def setOptions(newOptionsOrKey: js.Any, value: js.Any): Unit = js.native
  
  def setSize(size: Size): Unit = js.native
  def setSize(size: SizeLiteral): Unit = js.native
  
  def setZoom(zoom: Double): Unit = js.native
  def setZoom(zoom: Double, effect: Boolean): Unit = js.native
  
  def updateBy(coord: CoordLiteral, zoom: Double): Unit = js.native
  def updateBy(coord: Coord, zoom: Double): Unit = js.native
  
  def zoomBy(deltaZoom: Double): Unit = js.native
  def zoomBy(deltaZoom: Double, zoomOrigin: Unit, effect: Boolean): Unit = js.native
  def zoomBy(deltaZoom: Double, zoomOrigin: Coord): Unit = js.native
  def zoomBy(deltaZoom: Double, zoomOrigin: CoordLiteral): Unit = js.native
  def zoomBy(deltaZoom: Double, zoomOrigin: CoordLiteral, effect: Boolean): Unit = js.native
  def zoomBy(deltaZoom: Double, zoomOrigin: Coord, effect: Boolean): Unit = js.native
}
