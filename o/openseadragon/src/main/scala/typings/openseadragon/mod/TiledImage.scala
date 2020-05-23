package typings.openseadragon.mod

import typings.openseadragon.anon.AjaxHeaders
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "TiledImage")
@js.native
class TiledImage protected () extends js.Object {
  def this(options: AjaxHeaders) = this()
  var source: TileSource = js.native
  def addHandler(eventName: String, handler: EventHandler[TiledImageEvent]): Unit = js.native
  def addHandler(eventName: String, handler: EventHandler[TiledImageEvent], userData: js.Object): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TiledImageEvent]): Unit = js.native
  def addOnceHandler(eventName: String, handler: EventHandler[TiledImageEvent], userData: js.Object): Unit = js.native
  def destroy(): Unit = js.native
  def draw(): Unit = js.native
  def fitBounds(bounds: Rect): Unit = js.native
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
  def getFullyLoaded(): Boolean = js.native
  def getHandler(eventName: String): js.Function2[/* source */ Event, /* repeated */ js.Any, Unit] = js.native
  def getOpacity(): Double = js.native
  def getPreload(): Boolean = js.native
  def getRotation(): Double = js.native
  def getRotation(current: Boolean): Double = js.native
  def imageToViewerElementCoordinats(pixel: Point): Point = js.native
  def imageToViewportCoordinates(imageX: Double, imageY: Double): Point = js.native
  def imageToViewportCoordinates(imageX: Double, imageY: Double, current: Boolean): Point = js.native
  def imageToViewportCoordinates(position: Point): Point = js.native
  def imageToViewportCoordinates(position: Point, current: Boolean): Point = js.native
  def imageToViewportRectangle(imageX: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportRectangle(position: Rect): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(position: Rect, pixelWidth: Double, pixelHeight: Double, current: Boolean): Rect = js.native
  def imageToViewportZoom(imageZoom: Double): Double = js.native
  def imageToWindowCoordinates(pixel: Point): Point = js.native
  def needsDraw(): Boolean = js.native
  def raiseEvent(eventName: String, eventArgs: js.Object): Unit = js.native
  def removeAllHandlers(eventName: String): Unit = js.native
  def removeHandler(eventName: String, handler: EventHandler[TiledImageEvent]): Unit = js.native
  def reset(): Unit = js.native
  def setClip(): Unit = js.native
  def setClip(newClip: Rect): Unit = js.native
  def setCompositeOperation(compositeOperation: String): Unit = js.native
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
  def viewportToImageZoom(viewportZoom: Double): Double = js.native
  def windowToImageCoordinates(pixel: Point): Point = js.native
}

