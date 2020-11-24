package typings.openseadragon.mod

import typings.openseadragon.anon.DefaultZoomLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Viewport")
@js.native
class Viewport protected () extends js.Object {
  def this(options: DefaultZoomLevel) = this()
  
  def applyConstraints(): Viewport = js.native
  def applyConstraints(immediately: Boolean): Viewport = js.native
  
  def deltaPixelsFromPoints(deltaPoints: Point): Point = js.native
  def deltaPixelsFromPoints(deltaPoints: Point, current: Boolean): Point = js.native
  
  def deltaPixelsFromPointsNoRotate(deltaPoints: Point): Point = js.native
  def deltaPixelsFromPointsNoRotate(deltaPoints: Point, current: Boolean): Point = js.native
  
  def deltaPointsFromPixels(deltaPoints: Point): Point = js.native
  def deltaPointsFromPixels(deltaPoints: Point, current: Boolean): Point = js.native
  
  def deltaPointsFromPixelsNoRotate(deltaPoints: Point): Point = js.native
  def deltaPointsFromPixelsNoRotate(deltaPoints: Point, current: Boolean): Point = js.native
  
  def ensureVisible(): Viewport = js.native
  def ensureVisible(immediately: Boolean): Viewport = js.native
  
  def fitBounds(bounds: Rect): Viewport = js.native
  def fitBounds(bounds: Rect, immediately: Boolean): Viewport = js.native
  
  def fitBoundsWithConstraints(bounds: Rect): Viewport = js.native
  def fitBoundsWithConstraints(bounds: Rect, immediately: Boolean): Viewport = js.native
  
  def fitHorizontally(): Viewport = js.native
  def fitHorizontally(immediately: Boolean): Viewport = js.native
  
  def fitVertically(): Viewport = js.native
  def fitVertically(immediately: Boolean): Viewport = js.native
  
  def getAspectRatio(): js.Any = js.native
  
   // TODO: determine return type
  def getBounds(): Rect = js.native
  def getBounds(current: Boolean): Rect = js.native
  
  def getBoundsNoRotate(): Rect = js.native
  def getBoundsNoRotate(current: Boolean): Rect = js.native
  
  def getBoundsNoRotateWithMargins(): Rect = js.native
  def getBoundsNoRotateWithMargins(current: Boolean): Rect = js.native
  
  def getBoundsWithMargins(): Rect = js.native
  def getBoundsWithMargins(current: Boolean): Rect = js.native
  
  def getCenter(): Point = js.native
  def getCenter(current: Boolean): Point = js.native
  
  def getConstrainedBounds(): Viewport = js.native
  def getConstrainedBounds(current: Boolean): Viewport = js.native
  
  def getContainerSize(): Point = js.native
  
  def getFlip(): Boolean = js.native
  
  def getHomeBounds(): Rect = js.native
  
  def getHomeBoundsNoRotate(): Rect = js.native
  
  def getHomeZoom(): Double = js.native
  
  def getMargins(): js.Object = js.native
  
  def getMaxZoom(): Double = js.native
  
  def getMinZoom(): Double = js.native
  
  def getRotation(): Double = js.native
  
  def getZoom(): Double = js.native
  def getZoom(current: Boolean): Double = js.native
  
  def goHome(): Unit = js.native
  def goHome(immediately: Boolean): Unit = js.native
  
  def imageToViewerElementCoordinates(pixel: Point): Point = js.native
  
  def imageToViewportCoordinates(imageX: Double, imageY: Double): Point = js.native
  def imageToViewportCoordinates(imageX: Double, imageY: Double, pixelWidth: Double, pixelHeight: Double): Point = js.native
  def imageToViewportCoordinates(position: Point): Point = js.native
  
  def imageToViewportRectangle(imageX: Double): Rect = js.native
  def imageToViewportRectangle(
    imageX: Double,
    imageY: js.UndefOr[scala.Nothing],
    pixelWidth: js.UndefOr[scala.Nothing],
    pixelHeight: Double
  ): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: js.UndefOr[scala.Nothing], pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: js.UndefOr[scala.Nothing], pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: js.UndefOr[scala.Nothing], pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Double, imageY: Double, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Rect): Rect = js.native
  def imageToViewportRectangle(
    imageX: Rect,
    imageY: js.UndefOr[scala.Nothing],
    pixelWidth: js.UndefOr[scala.Nothing],
    pixelHeight: Double
  ): Rect = js.native
  def imageToViewportRectangle(imageX: Rect, imageY: js.UndefOr[scala.Nothing], pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Rect, imageY: js.UndefOr[scala.Nothing], pixelWidth: Double, pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Rect, imageY: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Rect, imageY: Double, pixelWidth: js.UndefOr[scala.Nothing], pixelHeight: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Rect, imageY: Double, pixelWidth: Double): Rect = js.native
  def imageToViewportRectangle(imageX: Rect, imageY: Double, pixelWidth: Double, pixelHeight: Double): Rect = js.native
  
  def imageToViewportZoom(imageZoom: Double): Double = js.native
  
  def imageToWindowCoordinates(pixel: Point): Point = js.native
  
  def panBy(delta: Point): Viewport = js.native
  def panBy(delta: Point, immediately: Boolean): Viewport = js.native
  
  def panTo(center: Point): Viewport = js.native
  def panTo(center: Point, immediately: Boolean): Viewport = js.native
  
  def pixelFromPoint(point: Point): Point = js.native
  def pixelFromPoint(point: Point, current: Boolean): Point = js.native
  
  def pixelFromPointNoRotate(point: Point): Point = js.native
  def pixelFromPointNoRotate(point: Point, current: Boolean): Point = js.native
  
  def pointFromPixel(point: Point): Point = js.native
  def pointFromPixel(point: Point, current: Boolean): Point = js.native
  
  def pointFromPixelNoRotate(point: Point): Point = js.native
  def pointFromPixelNoRotate(point: Point, current: Boolean): Point = js.native
  
  def resetContentSize(contentSize: Point): Viewport = js.native
  
  def resize(): Viewport = js.native
  
  def setFlip(state: Boolean): Viewport = js.native
  
  def setMargins(margins: js.Object): Unit = js.native
  
  def setRotation(degrees: Double): Viewport = js.native
  
  def toggleFlip(): Viewport = js.native
  
  def update(): Boolean = js.native
  
  def viewerElementToImageCoordinates(pixel: Point): Point = js.native
  
  def viewerElementToViewportCoordinates(pixel: Point): Point = js.native
  
  def viewerElementToViewportRectangle(rectangle: Rect): Rect = js.native
  
  def viewportToImageCoordinates(position: Point): Point = js.native
  def viewportToImageCoordinates(viewerX: Double, viewerY: Double): Point = js.native
  
  def viewportToImageRectangle(rectangle: Rect): Rect = js.native
  def viewportToImageRectangle(viewerX: Double, viewerY: Double, pointWidth: Double, pointHeight: Double): Rect = js.native
  
  def viewportToImageZoom(viewportZoom: Double): Double = js.native
  
  def viewportToViewerElementCoordinates(point: Point): Point = js.native
  
  def viewportToViewerElementRectangle(rectangle: Rect): Rect = js.native
  
  def viewportToWindowCoordinates(point: Point): Point = js.native
  
  def windowToImageCoordinates(pixel: Point): Point = js.native
  
  def windowToViewportCoordinates(pixel: Point): Point = js.native
  
  def zoomBy(factor: Double): Viewport = js.native
  def zoomBy(factor: Double, refPoint: js.UndefOr[scala.Nothing], immediately: Boolean): Viewport = js.native
  def zoomBy(factor: Double, refPoint: Point): Viewport = js.native
  def zoomBy(factor: Double, refPoint: Point, immediately: Boolean): Viewport = js.native
  
  def zoomTo(factor: Double): Viewport = js.native
  def zoomTo(factor: Double, refPoint: js.UndefOr[scala.Nothing], immediately: Boolean): Viewport = js.native
  def zoomTo(factor: Double, refPoint: Point): Viewport = js.native
  def zoomTo(factor: Double, refPoint: Point, immediately: Boolean): Viewport = js.native
}
