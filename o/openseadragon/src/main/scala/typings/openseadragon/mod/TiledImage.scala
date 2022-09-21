package typings.openseadragon.mod

import typings.openseadragon.anon.AjaxHeaders
import typings.openseadragon.openseadragonStrings.`bounds-change`
import typings.openseadragon.openseadragonStrings.`clip-change`
import typings.openseadragon.openseadragonStrings.`composite-operation-change`
import typings.openseadragon.openseadragonStrings.`fully-loaded-change`
import typings.openseadragon.openseadragonStrings.`opacity-change`
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "TiledImage")
@js.native
open class TiledImage protected () extends StObject {
  def this(options: AjaxHeaders) = this()
  
  @JSName("addHandler")
  def addHandler_boundschange(eventName: `bounds-change`, handler: EventHandler[TiledImageEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_boundschange(eventName: `bounds-change`, handler: EventHandler[TiledImageEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_clipchange(eventName: `clip-change`, handler: EventHandler[TiledImageEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_clipchange(eventName: `clip-change`, handler: EventHandler[TiledImageEvent], userData: js.Object): Unit = js.native
  @JSName("addHandler")
  def addHandler_compositeoperationchange(
    eventName: `composite-operation-change`,
    handler: EventHandler[CompositeOperationChangeTiledImageEvent]
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_compositeoperationchange(
    eventName: `composite-operation-change`,
    handler: EventHandler[CompositeOperationChangeTiledImageEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_fullyloadedchange(eventName: `fully-loaded-change`, handler: EventHandler[FullyLoadedChangeTiledImageEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_fullyloadedchange(
    eventName: `fully-loaded-change`,
    handler: EventHandler[FullyLoadedChangeTiledImageEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addHandler")
  def addHandler_opacitychange(eventName: `opacity-change`, handler: EventHandler[OpacityChangeTiledImageEvent]): Unit = js.native
  @JSName("addHandler")
  def addHandler_opacitychange(
    eventName: `opacity-change`,
    handler: EventHandler[OpacityChangeTiledImageEvent],
    userData: js.Object
  ): Unit = js.native
  
  @JSName("addOnceHandler")
  def addOnceHandler_boundschange(eventName: `bounds-change`, handler: EventHandler[TiledImageEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_boundschange(eventName: `bounds-change`, handler: EventHandler[TiledImageEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_clipchange(eventName: `clip-change`, handler: EventHandler[TiledImageEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_clipchange(eventName: `clip-change`, handler: EventHandler[TiledImageEvent], userData: js.Object): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_compositeoperationchange(
    eventName: `composite-operation-change`,
    handler: EventHandler[CompositeOperationChangeTiledImageEvent]
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_compositeoperationchange(
    eventName: `composite-operation-change`,
    handler: EventHandler[CompositeOperationChangeTiledImageEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullyloadedchange(eventName: `fully-loaded-change`, handler: EventHandler[FullyLoadedChangeTiledImageEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_fullyloadedchange(
    eventName: `fully-loaded-change`,
    handler: EventHandler[FullyLoadedChangeTiledImageEvent],
    userData: js.Object
  ): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_opacitychange(eventName: `opacity-change`, handler: EventHandler[OpacityChangeTiledImageEvent]): Unit = js.native
  @JSName("addOnceHandler")
  def addOnceHandler_opacitychange(
    eventName: `opacity-change`,
    handler: EventHandler[OpacityChangeTiledImageEvent],
    userData: js.Object
  ): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def draw(): Unit = js.native
  
  def fitBounds(bounds: Rect): Unit = js.native
  def fitBounds(bounds: Rect, anchor: Unit, immediately: Boolean): Unit = js.native
  def fitBounds(bounds: Rect, anchor: Placement): Unit = js.native
  def fitBounds(bounds: Rect, anchor: Placement, immediately: Boolean): Unit = js.native
  
  def getBounds(): Rect = js.native
  def getBounds(current: Boolean): Rect = js.native
  
  def getBoundsNoRotate(): Rect = js.native
  def getBoundsNoRotate(current: Boolean): Rect = js.native
  
  def getClip(): Rect | Null = js.native
  
  def getClippedBounds(): Rect = js.native
  def getClippedBounds(current: Boolean): Rect = js.native
  
  def getCompositeOperation(): String = js.native
  
  def getContentSize(): Point = js.native
  
  def getFlip(): Boolean = js.native
  
  def getFullyLoaded(): Boolean = js.native
  
  def getHandler(eventName: String): js.Function2[/* source */ Event, /* repeated */ Any, Unit] = js.native
  
  def getOpacity(): Double = js.native
  
  def getPreload(): Boolean = js.native
  
  def getRotation(): Double = js.native
  def getRotation(current: Boolean): Double = js.native
  
  def getSizeInWindowCoordinates(): Point = js.native
  
  def getTileBounds(level: Double, x: Double, y: Double): Rect = js.native
  
  def imageToViewerElementCoordinates(pixel: Point): Point = js.native
  
  def imageToViewportCoordinates(imageX: Double, imageY: Double): Point = js.native
  def imageToViewportCoordinates(imageX: Double, imageY: Double, current: Boolean): Point = js.native
  def imageToViewportCoordinates(position: Point): Point = js.native
  def imageToViewportCoordinates(position: Point, current: Boolean): Point = js.native
  
  def imageToViewportRectangle(imageX: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double, pixelHeight: Unit, current: Boolean): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Unit, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Unit, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Unit, pixelHeight: Unit, current: Boolean): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Unit, pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Unit, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Unit, pixelWidth: Double, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Unit, pixelWidth: Double, pixelHeight: Unit, current: Boolean): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Unit, pixelWidth: Unit, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Unit, pixelWidth: Unit, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Unit, pixelWidth: Unit, pixelHeight: Unit, current: Boolean): Rect = js.native
  def imageToViewportRectangle(position: Rect): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Double, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Double, pixelHeight: Unit, current: Boolean): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Unit, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Unit, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Unit, pixelHeight: Unit, current: Boolean): Rect = js.native
  
  def imageToViewportZoom(imageZoom: Double): Double = js.native
  
  def imageToWindowCoordinates(pixel: Point): Point = js.native
  
  def needsDraw(): Boolean = js.native
  
  def raiseEvent(eventName: String, eventArgs: js.Object): Unit = js.native
  
  def removeAllHandlers(
    eventName: `bounds-change` | `clip-change` | `composite-operation-change` | `fully-loaded-change` | `opacity-change`
  ): Unit = js.native
  
  @JSName("removeHandler")
  def removeHandler_boundschange(eventName: `bounds-change`, handler: EventHandler[TiledImageEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_clipchange(eventName: `clip-change`, handler: EventHandler[TiledImageEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_compositeoperationchange(
    eventName: `composite-operation-change`,
    handler: EventHandler[CompositeOperationChangeTiledImageEvent]
  ): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_fullyloadedchange(eventName: `fully-loaded-change`, handler: EventHandler[FullyLoadedChangeTiledImageEvent]): Unit = js.native
  @JSName("removeHandler")
  def removeHandler_opacitychange(eventName: `opacity-change`, handler: EventHandler[OpacityChangeTiledImageEvent]): Unit = js.native
  
  def reset(): Unit = js.native
  
  def resetCroppingPolygons(): Unit = js.native
  
  def setClip(): Unit = js.native
  def setClip(newClip: Rect): Unit = js.native
  
  def setCompositeOperation(compositeOperation: String): Unit = js.native
  
  def setCroppingPolygons(polygons: js.Array[js.Array[Point]]): Unit = js.native
  
  def setFlip(flip: Boolean): Unit = js.native
  
  def setHeight(height: Double): Unit = js.native
  def setHeight(height: Double, immediately: Boolean): Unit = js.native
  
  def setOpacity(opacity: Double): Unit = js.native
  
  def setPosition(position: Point): Unit = js.native
  def setPosition(position: Point, immediately: Boolean): Unit = js.native
  
  def setPreload(preload: Boolean): Unit = js.native
  
  def setRotation(degrees: Double): Unit = js.native
  def setRotation(degrees: Double, immediately: Boolean): Unit = js.native
  
  def setWidth(width: Double): Unit = js.native
  def setWidth(width: Double, immediately: Boolean): Unit = js.native
  
  var source: TileSource = js.native
  
  def update(): Boolean = js.native
  
  def viewerElementToImageCoordinates(pixel: Point): Point = js.native
  
  def viewportToImageCoordinates(position: Point): Point = js.native
  def viewportToImageCoordinates(position: Point, current: Boolean): Point = js.native
  def viewportToImageCoordinates(viewerX: Double, viewerY: Double): Point = js.native
  def viewportToImageCoordinates(viewerX: Double, viewerY: Double, current: Boolean): Point = js.native
  
  def viewportToImageRectangle(position: Rect): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double, pixelWidth: Double): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double, pixelWidth: Double, pixelHeight: Double, current: Boolean): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double, pixelWidth: Double, pixelHeight: Unit, current: Boolean): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double, pixelWidth: Unit, pixelHeight: Double): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double, pixelWidth: Unit, pixelHeight: Double, current: Boolean): Rect = js.native
  def viewportToImageRectangle(viewportX: Double, viewportY: Double, pixelWidth: Unit, pixelHeight: Unit, current: Boolean): Rect = js.native
  
  def viewportToImageZoom(viewportZoom: Double): Double = js.native
  
  def windowToImageCoordinates(pixel: Point): Point = js.native
}
