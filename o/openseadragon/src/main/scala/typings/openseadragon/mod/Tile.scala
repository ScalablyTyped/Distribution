package typings.openseadragon.mod

import typings.std.CanvasRenderingContext2D
import typings.std.Element
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "Tile")
@js.native
open class Tile protected () extends StObject {
  def this(
    level: Double,
    x: Double,
    y: Double,
    bounds: Rect,
    exists: Boolean,
    url: String,
    context2D: CanvasRenderingContext2D,
    loadWithAjax: Boolean,
    ajaxHeaders: js.Object,
    sourceBounds: Rect
  ) = this()
  
  var ajaxHeaders: js.Object = js.native
  
  var beingDrawn: Boolean = js.native
  
  var blendStart: Double = js.native
  
  var bounds: Rect = js.native
  
  var cacheKey: String = js.native
  
  var context2D: CanvasRenderingContext2D = js.native
  
  def drawCanvas(
    context: CanvasRenderingContext2D,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit]
  ): Unit = js.native
  def drawCanvas(
    context: CanvasRenderingContext2D,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit],
    scale: Double
  ): Unit = js.native
  def drawCanvas(
    context: CanvasRenderingContext2D,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit],
    scale: Double,
    translate: Point
  ): Unit = js.native
  def drawCanvas(
    context: CanvasRenderingContext2D,
    drawingHandler: js.Function3[/* context */ CanvasRenderingContext2D, /* tile */ Any, /* rendered */ Any, Unit],
    scale: Unit,
    translate: Point
  ): Unit = js.native
  
  def drawHTML(container: Element): Unit = js.native
  
  var element: Element = js.native
  
  var exists: Boolean = js.native
  
  var flipped: Boolean = js.native
  
  def getScaleForEdgeSmoothing(): Double = js.native
  
  def getTranslationForEdgeSmoothing(): Point = js.native
  def getTranslationForEdgeSmoothing(scale: Double): Point = js.native
  
  var image: js.Object = js.native
  
  var imgElement: HTMLImageElement = js.native
  
  var isBottomMost: Boolean = js.native
  
  var isRightMost: Boolean = js.native
  
  var lastTouchTime: Double = js.native
  
  var level: Double = js.native
  
  var loadWithAjax: Boolean = js.native
  
  var loaded: Boolean = js.native
  
  var loading: Boolean = js.native
  
  var opacity: Double = js.native
  
  var position: Point = js.native
  
  var size: Point = js.native
  
  var sourceBounds: Rect = js.native
  
  var style: String = js.native
  
  def unload(): Unit = js.native
  
  var url: String = js.native
  
  var visibility: Double = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
