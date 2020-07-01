package typings.pixiJs.PIXI

import typings.pixiJs.anon.Alignment
import typings.pixiJs.anon.Color
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Graphics class contains methods used to draw primitive shapes such as lines, circles and
  * rectangles to the display, and to color and fill them.
  *
  * Note that because Graphics can share a GraphicsGeometry with other instances,
  * it is necessary to call `destroy()` to properly dereference the underlying
  * GraphicsGeometry and avoid a memory leak. Alternatively, keep using the same
  * Graphics instance and call `clear()` between redraws.
  *
  * @class
  * @extends PIXI.Container
  * @memberof PIXI
  */
@js.native
trait Graphics extends Container {
  /**
    * Current fill style
    *
    * @member {PIXI.FillStyle} PIXI.Graphics#_fillStyle
    * @protected
    */
  var _fillStyle: FillStyle = js.native
  /**
    * Current hole mode is enabled.
    *
    * @member {boolean} PIXI.Graphics#_holeMode
    * @default false
    * @protected
    */
  var _holeMode: Boolean = js.native
  /**
    * Current line style
    *
    * @member {PIXI.LineStyle} PIXI.Graphics#_lineStyle
    * @protected
    */
  var _lineStyle: LineStyle = js.native
  /**
    * Current shape transform matrix.
    *
    * @member {PIXI.Matrix} PIXI.Graphics#_matrix
    * @protected
    */
  var _matrix: Matrix = js.native
  /**
    * Update dirty for limiting calculating batches.
    *
    * @protected
    * @member {number} PIXI.Graphics#batchDirty
    * @default -1
    */
  var batchDirty: Double = js.native
  /**
    * Update dirty for limiting calculating tints for batches.
    *
    * @protected
    * @member {number} PIXI.Graphics#batchTint
    * @default -1
    */
  var batchTint: Double = js.native
  /**
    * A collections of batches! These can be drawn by the renderer batch system.
    *
    * @protected
    * @member {object[]} PIXI.Graphics#batches
    */
  var batches: js.Array[_] = js.native
  /**
    * The blend mode to be applied to the graphic shape. Apply a value of
    * `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
    *
    * @member {number}
    * @default PIXI.BLEND_MODES.NORMAL;
    * @see PIXI.BLEND_MODES
    */
  var blendMode: Double = js.native
  /**
    * Current path
    *
    * @member {PIXI.Polygon} PIXI.Graphics#currentPath
    * @protected
    */
  var currentPath: Polygon = js.native
  /**
    * The current fill style.
    *
    * @member {PIXI.FillStyle}
    * @readonly
    */
  val fill: FillStyle = js.native
  /**
    * Includes vertex positions, face indices, normals, colors, UVs, and
    * custom attributes within buffers, reducing the cost of passing all
    * this data to the GPU. Can be shared between multiple Mesh or Graphics objects.
    *
    * @member {PIXI.GraphicsGeometry}
    * @readonly
    */
  val geometry: GraphicsGeometry = js.native
  /**
    * The current line style.
    *
    * @member {PIXI.LineStyle}
    * @readonly
    */
  val line: LineStyle = js.native
  /**
    * Renderer plugin for batching
    *
    * @member {string} PIXI.Graphics#pluginName
    * @default 'batch'
    */
  var pluginName: String = js.native
  /**
    * Represents the vertex and fragment shaders that processes the geometry and runs on the GPU.
    * Can be shared between multiple Graphics objects.
    *
    * @member {PIXI.Shader} PIXI.Graphics#shader
    */
  var shader: Shader = js.native
  /**
    * Represents the WebGL state the Graphics required to render, excludes shader and geometry. E.g.,
    * blend mode, culling, depth testing, direction of rendering triangles, backface, etc.
    *
    * @member {PIXI.State} PIXI.Graphics#state
    */
  var state: State = js.native
  /**
    * The tint applied to the graphic shape. This is a hex value. A value of
    * 0xFFFFFF will remove any tint effect.
    *
    * @member {number}
    * @default 0xFFFFFF
    */
  var tint: Double = js.native
  /**
    * Copy of the object vertex data.
    *
    * @protected
    * @member {Float32Array} PIXI.Graphics#vertexData
    */
  var vertexData: Float32Array = js.native
  /**
    * Initialize the curve
    *
    * @protected
    * @param {number} [x=0]
    * @param {number} [y=0]
    */
  /* protected */ def _initCurve(): Unit = js.native
  /* protected */ def _initCurve(x: Double): Unit = js.native
  /* protected */ def _initCurve(x: Double, y: Double): Unit = js.native
  /**
    * Populating batches for rendering
    *
    * @protected
    */
  /* protected */ def _populateBatches(): Unit = js.native
  /**
    * Renders the batches using the BathedRenderer plugin
    *
    * @protected
    * @param {PIXI.Renderer} renderer - The renderer
    */
  /* protected */ def _renderBatched(renderer: Renderer): Unit = js.native
  /**
    * Renders the graphics direct
    *
    * @protected
    * @param {PIXI.Renderer} renderer - The renderer
    */
  /* protected */ def _renderDirect(renderer: Renderer): Unit = js.native
  /**
    * Renders specific DrawCall
    *
    * @param {PIXI.Renderer} renderer
    * @param {PIXI.BatchDrawCall} drawCall
    */
  def _renderDrawCallDirect(renderer: Renderer, drawCall: BatchDrawCall): Unit = js.native
  /**
    * Resolves shader for direct rendering
    *
    * @protected
    * @param {PIXI.Renderer} renderer - The renderer
    */
  /* protected */ def _resolveDirectShader(renderer: Renderer): Unit = js.native
  /**
    * The arc method creates an arc/curve (used to create circles, or parts of circles).
    *
    * @param {number} cx - The x-coordinate of the center of the circle
    * @param {number} cy - The y-coordinate of the center of the circle
    * @param {number} radius - The radius of the circle
    * @param {number} startAngle - The starting angle, in radians (0 is at the 3 o'clock position
    *  of the arc's circle)
    * @param {number} endAngle - The ending angle, in radians
    * @param {boolean} [anticlockwise=false] - Specifies whether the drawing should be
    *  counter-clockwise or clockwise. False is default, and indicates clockwise, while true
    *  indicates counter-clockwise.
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def arc(cx: Double, cy: Double, radius: Double, startAngle: Double, endAngle: Double): Graphics = js.native
  def arc(
    cx: Double,
    cy: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean
  ): Graphics = js.native
  /**
    * The arcTo() method creates an arc/curve between two tangents on the canvas.
    *
    * "borrowed" from https://code.google.com/p/fxcanvas/ - thanks google!
    *
    * @param {number} x1 - The x-coordinate of the first tangent point of the arc
    * @param {number} y1 - The y-coordinate of the first tangent point of the arc
    * @param {number} x2 - The x-coordinate of the end of the arc
    * @param {number} y2 - The y-coordinate of the end of the arc
    * @param {number} radius - The radius of the arc
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Graphics = js.native
  /**
    * Specifies a simple one-color fill that subsequent calls to other Graphics methods
    * (such as lineTo() or drawCircle()) use when drawing.
    *
    * @param {number} [color=0] - the color of the fill
    * @param {number} [alpha=1] - the alpha of the fill
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def beginFill(): Graphics = js.native
  def beginFill(color: Double): Graphics = js.native
  def beginFill(color: Double, alpha: Double): Graphics = js.native
  /**
    * Begin adding holes to the last draw shape
    * IMPORTANT: holes must be fully inside a shape to work
    * Also weirdness ensues if holes overlap!
    * Ellipses, Circles, Rectangles and Rounded Rectangles cannot be holes or host for holes in CanvasRenderer,
    * please use `moveTo` `lineTo`, `quadraticCurveTo` if you rely on pixi-legacy bundle.
    * @return {PIXI.Graphics} Returns itself.
    */
  def beginHole(): Graphics = js.native
  /**
    * Begin the texture fill
    *
    * @param {object} [options] - Object object.
    * @param {PIXI.Texture} [options.texture=PIXI.Texture.WHITE] - Texture to fill
    * @param {number} [options.color=0xffffff] - Background to fill behind texture
    * @param {number} [options.alpha=1] - Alpha of fill
    * @param {PIXI.Matrix} [options.matrix=null] - Transform matrix
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def beginTextureFill(): Graphics = js.native
  def beginTextureFill(options: Color): Graphics = js.native
  /**
    * Calculate the points for a bezier curve and then draws it.
    *
    * @param {number} cpX - Control point x
    * @param {number} cpY - Control point y
    * @param {number} cpX2 - Second Control point x
    * @param {number} cpY2 - Second Control point y
    * @param {number} toX - Destination point x
    * @param {number} toY - Destination point y
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def bezierCurveTo(cpX: Double, cpY: Double, cpX2: Double, cpY2: Double, toX: Double, toY: Double): Graphics = js.native
  /**
    * Recalcuate the tint by applying tin to batches using Graphics tint.
    * @protected
    */
  /* protected */ def calculateTints(): Unit = js.native
  /**
    * If there's a transform update or a change to the shape of the
    * geometry, recaculate the vertices.
    * @protected
    */
  /* protected */ def calculateVertices(): Unit = js.native
  /**
    * Clears the graphics that were drawn to this Graphics object, and resets fill and line style settings.
    *
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def clear(): Graphics = js.native
  /**
    * Closes the current path.
    *
    * @return {PIXI.Graphics} Returns itself.
    */
  def closePath(): Graphics = js.native
  /**
    * Tests if a point is inside this graphics object
    *
    * @param {PIXI.IPointData} point - the point to test
    * @return {boolean} the result of the test
    */
  def containsPoint(point: IPointData): Boolean = js.native
  /**
    * Draw Rectangle with chamfer corners.
    *
    * _Note: Only available with **@pixi/graphics-extras**._
    *
    * @method PIXI.Graphics#drawChamferRect
    * @param {number} x - Upper left corner of rect
    * @param {number} y - Upper right corner of rect
    * @param {number} width - Width of rect
    * @param {number} height - Height of rect
    * @param {number} chamfer - accept negative or positive values
    * @return {PIXI.Graphics} Returns self.
    */
  def drawChamferRect(x: Double, y: Double, width: Double, height: Double, chamfer: Double): Graphics = js.native
  /**
    * Draws a circle.
    *
    * @param {number} x - The X coordinate of the center of the circle
    * @param {number} y - The Y coordinate of the center of the circle
    * @param {number} radius - The radius of the circle
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def drawCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  /**
    * Draws an ellipse.
    *
    * @param {number} x - The X coordinate of the center of the ellipse
    * @param {number} y - The Y coordinate of the center of the ellipse
    * @param {number} width - The half width of the ellipse
    * @param {number} height - The half height of the ellipse
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def drawEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  /**
    * Draw Rectangle with fillet corners.
    *
    * _Note: Only available with **@pixi/graphics-extras**._
    *
    * @method PIXI.Graphics#drawFilletRect
    * @param {number} x - Upper left corner of rect
    * @param {number} y - Upper right corner of rect
    * @param {number} width - Width of rect
    * @param {number} height - Height of rect
    * @param {number} fillet - non-zero real number, size of corner cutout
    * @return {PIXI.Graphics} Returns self.
    */
  def drawFilletRect(x: Double, y: Double, width: Double, height: Double, fillet: Double): Graphics = js.native
  /**
    * Draws a polygon using the given path.
    *
    * @param {number[]|PIXI.Point[]|PIXI.Polygon} path - The path data used to construct the polygon.
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def drawPolygon(path: ((js.Array[Double | Point]) | Polygon)*): Graphics = js.native
  /**
    * Draws a rectangle shape.
    *
    * @param {number} x - The X coord of the top-left of the rectangle
    * @param {number} y - The Y coord of the top-left of the rectangle
    * @param {number} width - The width of the rectangle
    * @param {number} height - The height of the rectangle
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def drawRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  /**
    * Draw a regular polygon where all sides are the same length.
    *
    * _Note: Only available with **@pixi/graphics-extras**._
    *
    * @method PIXI.Graphics#drawRegularPolygon
    * @param {number} x - X position
    * @param {number} y - Y position
    * @param {number} radius - Polygon radius
    * @param {number} sides - Minimum value is 3
    * @param {number} rotation - Starting rotation values in radians..
    * @return {PIXI.Graphics}
    */
  def drawRegularPolygon(x: Double, y: Double, radius: Double, sides: Double, rotation: Double): Graphics = js.native
  /**
    * Draw a rectangle shape with rounded/beveled corners.
    *
    * @param {number} x - The X coord of the top-left of the rectangle
    * @param {number} y - The Y coord of the top-left of the rectangle
    * @param {number} width - The width of the rectangle
    * @param {number} height - The height of the rectangle
    * @param {number} radius - Radius of the rectangle corners
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def drawRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  /**
    * Draw any shape.
    *
    * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - Shape to draw
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def drawShape(shape: Circle): Graphics = js.native
  def drawShape(shape: Ellipse): Graphics = js.native
  def drawShape(shape: Polygon): Graphics = js.native
  def drawShape(shape: Rectangle): Graphics = js.native
  def drawShape(shape: RoundedRectangle): Graphics = js.native
  /**
    * Draw a star shape with an arbitrary number of points.
    *
    * @param {number} x - Center X position of the star
    * @param {number} y - Center Y position of the star
    * @param {number} points - The number of points of the star, must be > 1
    * @param {number} radius - The outer radius of the star
    * @param {number} [innerRadius] - The inner radius between points, default half `radius`
    * @param {number} [rotation=0] - The rotation of the star in radians, where 0 is vertical
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def drawStar(x: Double, y: Double, points: Double, radius: Double): Graphics = js.native
  def drawStar(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double): Graphics = js.native
  def drawStar(x: Double, y: Double, points: Double, radius: Double, innerRadius: Double, rotation: Double): Graphics = js.native
  /**
    * Draw a torus shape, like a donut. Can be used for something like a circle loader.
    *
    * _Note: Only available with **@pixi/graphics-extras**._
    *
    * @method PIXI.Graphics#drawTorus
    * @param {number} x - X position
    * @param {number} y - Y position
    * @param {number} innerRadius - Inner circle radius
    * @param {number} outerRadius - Outer circle radius
    * @param {number} sweep - How much of the circle to fill, in radius
    * @return {PIXI.Graphics}
    */
  def drawTorus(x: Double, y: Double, innerRadius: Double, outerRadius: Double, sweep: Double): Graphics = js.native
  /**
    * Applies a fill to the lines and shapes that were added since the last call to the beginFill() method.
    *
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def endFill(): Graphics = js.native
  /**
    * End adding holes to the last draw shape
    * @return {PIXI.Graphics} Returns itself.
    */
  def endHole(): Graphics = js.native
  /**
    * Finish the polygon object.
    * @protected
    */
  /* protected */ def finishPoly(): Unit = js.native
  /**
    * True if graphics consists of one rectangle, and thus, can be drawn like a Sprite and
    * masked with gl.scissor.
    *
    * @returns {boolean} True if only 1 rect.
    */
  def isFastRect(): Boolean = js.native
  /**
    * Specifies the line style used for subsequent calls to Graphics methods such as the lineTo()
    * method or the drawCircle() method.
    *
    * @method PIXI.Graphics#lineStyle
    * @param {number} [width=0] - width of the line to draw, will update the objects stored style
    * @param {number} [color=0x0] - color of the line to draw, will update the objects stored style
    * @param {number} [alpha=1] - alpha of the line to draw, will update the objects stored style
    * @param {number} [alignment=0.5] - alignment of the line to draw, (0 = inner, 0.5 = middle, 1 = outter)
    * @param {boolean} [native=false] - If true the lines will be draw using LINES instead of TRIANGLE_STRIP
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def lineStyle(): Graphics = js.native
  def lineStyle(width: Double): Graphics = js.native
  def lineStyle(width: Double, color: Double): Graphics = js.native
  def lineStyle(width: Double, color: Double, alpha: Double): Graphics = js.native
  def lineStyle(width: Double, color: Double, alpha: Double, alignment: Double): Graphics = js.native
  def lineStyle(width: Double, color: Double, alpha: Double, alignment: Double, native: Boolean): Graphics = js.native
  /**
    * Like line style but support texture for line fill.
    *
    * @param {object} [options] - Collection of options for setting line style.
    * @param {number} [options.width=0] - width of the line to draw, will update the objects stored style
    * @param {PIXI.Texture} [options.texture=PIXI.Texture.WHITE] - Texture to use
    * @param {number} [options.color=0x0] - color of the line to draw, will update the objects stored style.
    *  Default 0xFFFFFF if texture present.
    * @param {number} [options.alpha=1] - alpha of the line to draw, will update the objects stored style
    * @param {PIXI.Matrix} [options.matrix=null] - Texture matrix to transform texture
    * @param {number} [options.alignment=0.5] - alignment of the line to draw, (0 = inner, 0.5 = middle, 1 = outter)
    * @param {boolean} [options.native=false] - If true the lines will be draw using LINES instead of TRIANGLE_STRIP
    * @param {PIXI.LINE_CAP}[options.cap=PIXI.LINE_CAP.BUTT] - line cap style
    * @param {PIXI.LINE_JOIN}[options.join=PIXI.LINE_JOIN.MITER] - line join style
    * @param {number}[options.miterLimit=10] - miter limit ratio
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def lineTextureStyle(): Graphics = js.native
  def lineTextureStyle(options: Alignment): Graphics = js.native
  /**
    * Draws a line using the current line style from the current drawing position to (x, y);
    * The current drawing position is then set to (x, y).
    *
    * @param {number} x - the X coordinate to draw to
    * @param {number} y - the Y coordinate to draw to
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def lineTo(x: Double, y: Double): Graphics = js.native
  /**
    * Moves the current drawing position to x, y.
    *
    * @param {number} x - the X coordinate to move to
    * @param {number} y - the Y coordinate to move to
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def moveTo(x: Double, y: Double): Graphics = js.native
  /**
    * Calculate the points for a quadratic bezier curve and then draws it.
    * Based on: https://stackoverflow.com/questions/785097/how-do-i-implement-a-bezier-curve-in-c
    *
    * @param {number} cpX - Control point x
    * @param {number} cpY - Control point y
    * @param {number} toX - Destination point x
    * @param {number} toY - Destination point y
    * @return {PIXI.Graphics} This Graphics object. Good for chaining method calls
    */
  def quadraticCurveTo(cpX: Double, cpY: Double, toX: Double, toY: Double): Graphics = js.native
  /**
    * Apply a matrix to the positional data.
    *
    * @param {PIXI.Matrix} matrix - Matrix to use for transform current shape.
    * @return {PIXI.Graphics} Returns itself.
    */
  def setMatrix(matrix: Matrix): Graphics = js.native
  /**
    * Start a polygon object internally
    * @protected
    */
  /* protected */ def startPoly(): Unit = js.native
}

