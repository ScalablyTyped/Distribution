package typings.openseadragon.mod

import typings.openseadragon.anon.Bounds
import typings.openseadragon.anon.DebugGridColor
import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.HTMLCanvasElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Drawer")
@js.native
class Drawer protected () extends StObject {
  // element : Element; // Deprecated
  def this(options: DebugGridColor) = this()
  
  def blendSketch(options: Bounds): Unit = js.native
  
  def canRotate(): Boolean = js.native
  
  var canvas: HTMLCanvasElement | HTMLElement = js.native
  
  def clear(): Unit = js.native
  
  def clipWithPolygons(polygons: js.Array[js.Array[Point]]): Unit = js.native
  def clipWithPolygons(polygons: js.Array[js.Array[Point]], useSketch: Boolean): Unit = js.native
  
  var container: Element = js.native
  
  var context: CanvasRenderingContext2D | Null = js.native
  
  def destroy(): Unit = js.native
  
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ js.Any, /* rendered */ js.Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean
  ): Unit = js.native
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ js.Any, /* rendered */ js.Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean,
    scale: js.UndefOr[scala.Nothing],
    translate: Point
  ): Unit = js.native
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ js.Any, /* rendered */ js.Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean,
    scale: Double
  ): Unit = js.native
  def drawTile(
    tile: Tile,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ js.Any, /* rendered */ js.Any, Unit],
    // TODO: determine handler parameter types
  useSketch: Boolean,
    scale: Double,
    translate: Point
  ): Unit = js.native
  
  def getCanvasSize(sketch: Boolean): Point = js.native
  
  def getOpacity(): Double = js.native
  
  def setImageSmoothingEnabled(): Unit = js.native
  def setImageSmoothingEnabled(imageSmoothingEnabled: Boolean): Unit = js.native
  
  def setOpacity(opacity: Double): Drawer = js.native
  
  def viewportCoordToDrawerCoord(point: Point): Point = js.native
  
  def viewportToDrawerRectangle(rectangle: Rect): Rect = js.native
}
