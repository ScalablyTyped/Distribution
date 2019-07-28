package typings.phaser.PhaserNs.GameObjectsNs

import typings.phaser.PhaserNs.CamerasNs.Scene2DNs.Camera
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Alpha
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.BlendMode
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Depth
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Mask
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Pipeline
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.ScrollFactor
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Transform
import typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.Visible
import typings.phaser.PhaserNs.GeomNs.Circle
import typings.phaser.PhaserNs.GeomNs.Point
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs.Options
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs.RoundedRectRadius
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs.Styles
import typings.phaser.integer
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Graphics object is a way to draw primitive shapes to your game. Primitives include forms of geometry, such as
  * Rectangles, Circles, and Polygons. They also include lines, arcs and curves. When you initially create a Graphics
  * object it will be empty.
  * 
  * To draw to it you must first specify a line style or fill style (or both), draw shapes using paths, and finally
  * fill or stroke them. For example:
  * 
  * ```javascript
  * graphics.lineStyle(5, 0xFF00FF, 1.0);
  * graphics.beginPath();
  * graphics.moveTo(100, 100);
  * graphics.lineTo(200, 200);
  * graphics.closePath();
  * graphics.strokePath();
  * ```
  * 
  * There are also many helpful methods that draw and fill/stroke common shapes for you.
  * 
  * ```javascript
  * graphics.lineStyle(5, 0xFF00FF, 1.0);
  * graphics.fillStyle(0xFFFFFF, 1.0);
  * graphics.fillRect(50, 50, 400, 200);
  * graphics.strokeRect(50, 50, 400, 200);
  * ```
  * 
  * When a Graphics object is rendered it will render differently based on if the game is running under Canvas or WebGL.
  * Under Canvas it will use the HTML Canvas context drawing operations to draw the path.
  * Under WebGL the graphics data is decomposed into polygons. Both of these are expensive processes, especially with
  * complex shapes.
  * 
  * If your Graphics object doesn't change much (or at all) once you've drawn your shape to it, then you will help
  * performance by calling {@link Phaser.GameObjects.Graphics#generateTexture}. This will 'bake' the Graphics object into
  * a Texture, and return it. You can then use this Texture for Sprites or other display objects. If your Graphics object
  * updates frequently then you should avoid doing this, as it will constantly generate new textures, which will consume
  * memory.
  * 
  * As you can tell, Graphics objects are a bit of a trade-off. While they are extremely useful, you need to be careful
  * in their complexity and quantity of them in your game.
  */
@JSGlobal("Phaser.GameObjects.Graphics")
@js.native
class Graphics protected ()
  extends GameObject
     with Alpha
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with Transform
     with Visible
     with ScrollFactor {
  /**
    * 
    * @param scene The Scene to which this Graphics object belongs.
    * @param options Options that set the position and default style of this Graphics object.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, options: Options) = this()
  /**
    * The array of commands used to render the Graphics.
    */
  var commandBuffer: js.Array[_] = js.native
  /**
    * The default fill alpha for shapes rendered by this Graphics object.
    */
  var defaultFillAlpha: Double = js.native
  /**
    * The default fill color for shapes rendered by this Graphics object.
    */
  var defaultFillColor: Double = js.native
  /**
    * The default stroke alpha for shapes rendered by this Graphics object.
    */
  var defaultStrokeAlpha: Double = js.native
  /**
    * The default stroke color for shapes rendered by this Graphics object.
    */
  var defaultStrokeColor: Double = js.native
  /**
    * The default stroke width for shapes rendered by this Graphics object.
    */
  var defaultStrokeWidth: Double = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: Double = js.native
  /**
    * The horizontal display origin of the Graphics.
    */
  var displayOriginX: Double = js.native
  /**
    * The vertical display origin of the Graphics.
    */
  var displayOriginY: Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * Draw an arc.
    * 
    * This method can be used to create circles, or parts of circles.
    * 
    * Make sure you call `beginPath` before starting the arc unless you wish for the arc to automatically
    * close when filled or stroked.
    * 
    * Use the optional `overshoot` argument increase the number of iterations that take place when
    * the arc is rendered in WebGL. This is useful if you're drawing an arc with an especially thick line,
    * as it will allow the arc to fully join-up. Try small values at first, i.e. 0.01.
    * 
    * Call {@link Phaser.GameObjects.Graphics#fillPath} or {@link Phaser.GameObjects.Graphics#strokePath} after calling
    * this method to draw the arc.
    * @param x The x coordinate of the center of the circle.
    * @param y The y coordinate of the center of the circle.
    * @param radius The radius of the circle.
    * @param startAngle The starting angle, in radians.
    * @param endAngle The ending angle, in radians.
    * @param anticlockwise Whether the drawing should be anticlockwise or clockwise. Default false.
    * @param overshoot This value allows you to increase the segment iterations in WebGL rendering. Useful if the arc has a thick stroke and needs to overshoot to join-up cleanly. Use small numbers such as 0.01 to start with and increase as needed. Default 0.
    */
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Graphics = js.native
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean,
    overshoot: Double
  ): Graphics = js.native
  /**
    * Start a new shape path.
    */
  def beginPath(): Graphics = js.native
  /**
    * Clear the command buffer and reset the fill style and line style to their defaults.
    */
  def clear(): Graphics = js.native
  /**
    * Close the current path.
    */
  def closePath(): Graphics = js.native
  /**
    * Fill the current path.
    * 
    * This is an alias for `Graphics.fillPath` and does the same thing.
    * It was added to match the CanvasRenderingContext 2D API.
    */
  def fill(): Graphics = js.native
  /**
    * Fill a circle with the given position and radius.
    * @param x The x coordinate of the center of the circle.
    * @param y The y coordinate of the center of the circle.
    * @param radius The radius of the circle.
    */
  def fillCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  /**
    * Fill the given circle.
    * @param circle The circle to fill.
    */
  def fillCircleShape(circle: Circle): Graphics = js.native
  /**
    * Fill an ellipse with the given position and size.
    * @param x The x coordinate of the center of the ellipse.
    * @param y The y coordinate of the center of the ellipse.
    * @param width The width of the ellipse.
    * @param height The height of the ellipse.
    * @param smoothness The number of points to draw the ellipse with. Default 32.
    */
  def fillEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def fillEllipse(x: Double, y: Double, width: Double, height: Double, smoothness: integer): Graphics = js.native
  /**
    * Fill the given ellipse.
    * @param ellipse The ellipse to fill.
    * @param smoothness The number of points to draw the ellipse with. Default 32.
    */
  def fillEllipseShape(ellipse: typings.phaser.PhaserNs.GeomNs.Ellipse): Graphics = js.native
  def fillEllipseShape(ellipse: typings.phaser.PhaserNs.GeomNs.Ellipse, smoothness: integer): Graphics = js.native
  /**
    * Sets a gradient fill style. This is a WebGL only feature.
    * 
    * The gradient color values represent the 4 corners of an untransformed rectangle.
    * The gradient is used to color all filled shapes and paths drawn after calling this method.
    * If you wish to turn a gradient off, call `fillStyle` and provide a new single fill color.
    * 
    * When filling a triangle only the first 3 color values provided are used for the 3 points of a triangle.
    * 
    * This feature is best used only on rectangles and triangles. All other shapes will give strange results.
    * 
    * Note that for objects such as arcs or ellipses, or anything which is made out of triangles, each triangle used
    * will be filled with a gradient on its own. There is no ability to gradient fill a shape or path as a single
    * entity at this time.
    * @param topLeft The tint being applied to the top-left of the Game Object.
    * @param topRight The tint being applied to the top-right of the Game Object.
    * @param bottomLeft The tint being applied to the bottom-left of the Game Object.
    * @param bottomRight The tint being applied to the bottom-right of the Game Object.
    * @param alpha The fill alpha. Default 1.
    */
  def fillGradientStyle(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Graphics = js.native
  def fillGradientStyle(topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer, alpha: Double): Graphics = js.native
  /**
    * Fill the current path.
    */
  def fillPath(): Graphics = js.native
  /**
    * Fill a point at the given position.
    * 
    * Draws a square at the given position, 1 pixel in size by default.
    * @param x The x coordinate of the point.
    * @param y The y coordinate of the point.
    * @param size The size of the square to draw. Default 1.
    */
  def fillPoint(x: Double, y: Double): Graphics = js.native
  def fillPoint(x: Double, y: Double, size: Double): Graphics = js.native
  def fillPointShape(point: js.Object): Graphics = js.native
  def fillPointShape(point: js.Object, size: Double): Graphics = js.native
  /**
    * Fill the given point.
    * 
    * Draws a square at the given position, 1 pixel in size by default.
    * @param point The point to fill.
    * @param size The size of the square to draw. Default 1.
    */
  def fillPointShape(point: Point): Graphics = js.native
  def fillPointShape(point: Point, size: Double): Graphics = js.native
  def fillPointShape(point: Vector2): Graphics = js.native
  def fillPointShape(point: Vector2, size: Double): Graphics = js.native
  /**
    * Fill the shape represented by the given array of points.
    * 
    * Pass `closeShape` to automatically close the shape by joining the last to the first point.
    * 
    * Pass `closePath` to automatically close the path before it is filled.
    * @param points The points to fill.
    * @param closeShape When `true`, the shape is closed by joining the last point to the first point. Default false.
    * @param closePath When `true`, the path is closed before being stroked. Default false.
    * @param endIndex The index of `points` to stop at. Defaults to `points.length`.
    */
  def fillPoints(points: js.Array[_ | Point]): Graphics = js.native
  def fillPoints(points: js.Array[_ | Point], closeShape: Boolean): Graphics = js.native
  def fillPoints(points: js.Array[_ | Point], closeShape: Boolean, closePath: Boolean): Graphics = js.native
  def fillPoints(points: js.Array[_ | Point], closeShape: Boolean, closePath: Boolean, endIndex: integer): Graphics = js.native
  /**
    * Fill a rectangle with the given position and size.
    * @param x The x coordinate of the top-left of the rectangle.
    * @param y The y coordinate of the top-left of the rectangle.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    */
  def fillRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  /**
    * Fill the given rectangle.
    * @param rect The rectangle to fill.
    */
  def fillRectShape(rect: typings.phaser.PhaserNs.GeomNs.Rectangle): Graphics = js.native
  /**
    * Fill a rounded rectangle with the given position, size and radius.
    * @param x The x coordinate of the top-left of the rectangle.
    * @param y The y coordinate of the top-left of the rectangle.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    * @param radius The corner radius; It can also be an object to specify different radii for corners. Default 20.
    */
  def fillRoundedRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def fillRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  def fillRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: RoundedRectRadius): Graphics = js.native
  /**
    * Set the current fill style.
    * @param color The fill color.
    * @param alpha The fill alpha. Default 1.
    */
  def fillStyle(color: Double): Graphics = js.native
  def fillStyle(color: Double, alpha: Double): Graphics = js.native
  /**
    * Fill a triangle with the given points.
    * @param x0 The x coordinate of the first point.
    * @param y0 The y coordinate of the first point.
    * @param x1 The x coordinate of the second point.
    * @param y1 The y coordinate of the second point.
    * @param x2 The x coordinate of the third point.
    * @param y2 The y coordinate of the third point.
    */
  def fillTriangle(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double): Graphics = js.native
  /**
    * Fill the given triangle.
    * @param triangle The triangle to fill.
    */
  def fillTriangleShape(triangle: typings.phaser.PhaserNs.GeomNs.Triangle): Graphics = js.native
  /**
    * Generate a texture from this Graphics object.
    * 
    * If `key` is a string it'll generate a new texture using it and add it into the
    * Texture Manager (assuming no key conflict happens).
    * 
    * If `key` is a Canvas it will draw the texture to that canvas context. Note that it will NOT
    * automatically upload it to the GPU in WebGL mode.
    * @param key The key to store the texture with in the Texture Manager, or a Canvas to draw to.
    * @param width The width of the graphics to generate.
    * @param height The height of the graphics to generate.
    */
  def generateTexture(key: String): Graphics = js.native
  def generateTexture(key: String, width: integer): Graphics = js.native
  def generateTexture(key: String, width: integer, height: integer): Graphics = js.native
  def generateTexture(key: HTMLCanvasElement): Graphics = js.native
  def generateTexture(key: HTMLCanvasElement, width: integer): Graphics = js.native
  def generateTexture(key: HTMLCanvasElement, width: integer, height: integer): Graphics = js.native
  /**
    * Draw a line between the given points.
    * @param x1 The x coordinate of the start point of the line.
    * @param y1 The y coordinate of the start point of the line.
    * @param x2 The x coordinate of the end point of the line.
    * @param y2 The y coordinate of the end point of the line.
    */
  def lineBetween(x1: Double, y1: Double, x2: Double, y2: Double): Graphics = js.native
  /**
    * Sets a gradient line style. This is a WebGL only feature.
    * 
    * The gradient color values represent the 4 corners of an untransformed rectangle.
    * The gradient is used to color all stroked shapes and paths drawn after calling this method.
    * If you wish to turn a gradient off, call `lineStyle` and provide a new single line color.
    * 
    * This feature is best used only on single lines. All other shapes will give strange results.
    * 
    * Note that for objects such as arcs or ellipses, or anything which is made out of triangles, each triangle used
    * will be filled with a gradient on its own. There is no ability to gradient stroke a shape or path as a single
    * entity at this time.
    * @param lineWidth The stroke width.
    * @param topLeft The tint being applied to the top-left of the Game Object.
    * @param topRight The tint being applied to the top-right of the Game Object.
    * @param bottomLeft The tint being applied to the bottom-left of the Game Object.
    * @param bottomRight The tint being applied to the bottom-right of the Game Object.
    * @param alpha The fill alpha. Default 1.
    */
  def lineGradientStyle(lineWidth: Double, topLeft: integer, topRight: integer, bottomLeft: integer, bottomRight: integer): Graphics = js.native
  def lineGradientStyle(
    lineWidth: Double,
    topLeft: integer,
    topRight: integer,
    bottomLeft: integer,
    bottomRight: integer,
    alpha: Double
  ): Graphics = js.native
  /**
    * Set the current line style.
    * @param lineWidth The stroke width.
    * @param color The stroke color.
    * @param alpha The stroke alpha. Default 1.
    */
  def lineStyle(lineWidth: Double, color: Double): Graphics = js.native
  def lineStyle(lineWidth: Double, color: Double, alpha: Double): Graphics = js.native
  /**
    * Draw a line from the current drawing position to the given position.
    * 
    * Moves the current drawing position to the given position.
    * @param x The x coordinate to draw the line to.
    * @param y The y coordinate to draw the line to.
    */
  def lineTo(x: Double, y: Double): Graphics = js.native
  /**
    * Move the current drawing position to the given position.
    * @param x The x coordinate to move to.
    * @param y The y coordinate to move to.
    */
  def moveTo(x: Double, y: Double): Graphics = js.native
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  /**
    * Restores the most recently saved state of the Graphics by popping from the state stack.
    * 
    * Use {@link Phaser.GameObjects.Graphics#save} to save the current state, and call this afterwards to restore that state.
    * 
    * If there is no saved state, this command does nothing.
    */
  def restore(): Graphics = js.native
  /**
    * Inserts a rotation command into this Graphics objects command buffer.
    * 
    * All objects drawn _after_ calling this method will be rotated
    * by the given amount.
    * 
    * This does not change the rotation of the Graphics object itself,
    * only of the objects drawn by it after calling this method.
    * @param radians The rotation angle, in radians.
    */
  def rotateCanvas(radians: Double): Graphics = js.native
  /**
    * Saves the state of the Graphics by pushing the current state onto a stack.
    * 
    * The most recently saved state can then be restored with {@link Phaser.GameObjects.Graphics#restore}.
    */
  def save(): Graphics = js.native
  /**
    * Inserts a scale command into this Graphics objects command buffer.
    * 
    * All objects drawn _after_ calling this method will be scaled
    * by the given amount.
    * 
    * This does not change the scale of the Graphics object itself,
    * only of the objects drawn by it after calling this method.
    * @param x The horizontal scale to apply.
    * @param y The vertical scale to apply.
    */
  def scaleCanvas(x: Double, y: Double): Graphics = js.native
  /**
    * Set the default style settings for this Graphics object.
    * @param options The styles to set as defaults.
    */
  def setDefaultStyles(options: Styles): Graphics = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: integer): this.type = js.native
  /**
    * Sets the texture frame this Graphics Object will use when drawing all shapes defined after calling this.
    * 
    * Textures are referenced by their string-based keys, as stored in the Texture Manager.
    * 
    * Once set, all shapes will use this texture. Call this method with no arguments to clear it.
    * 
    * The textures are not tiled. They are stretched to the dimensions of the shapes being rendered. For this reason,
    * it works best with seamless / tileable textures.
    * 
    * The mode argument controls how the textures are combined with the fill colors. The default value (0) will
    * multiply the texture by the fill color. A value of 1 will use just the fill color, but the alpha data from the texture,
    * and a value of 2 will use just the texture and no fill color at all.
    * @param key The key of the texture to be used, as stored in the Texture Manager. Leave blank to clear a previously set texture.
    * @param frame The name or index of the frame within the Texture.
    * @param mode The texture tint mode. 0 is multiply, 1 is alpha only and 2 is texture only. Default 0.
    */
  def setTexture(): this.type = js.native
  def setTexture(key: String): this.type = js.native
  def setTexture(key: String, frame: String): this.type = js.native
  def setTexture(key: String, frame: String, mode: Double): this.type = js.native
  def setTexture(key: String, frame: integer): this.type = js.native
  def setTexture(key: String, frame: integer, mode: Double): this.type = js.native
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  /**
    * Creates a pie-chart slice shape centered at `x`, `y` with the given radius.
    * You must define the start and end angle of the slice.
    * 
    * Setting the `anticlockwise` argument to `true` creates a shape similar to Pacman.
    * Setting it to `false` creates a shape like a slice of pie.
    * 
    * This method will begin a new path and close the path at the end of it.
    * To display the actual slice you need to call either `strokePath` or `fillPath` after it.
    * @param x The horizontal center of the slice.
    * @param y The vertical center of the slice.
    * @param radius The radius of the slice.
    * @param startAngle The start angle of the slice, given in radians.
    * @param endAngle The end angle of the slice, given in radians.
    * @param anticlockwise Whether the drawing should be anticlockwise or clockwise. Default false.
    * @param overshoot This value allows you to overshoot the endAngle by this amount. Useful if the arc has a thick stroke and needs to overshoot to join-up cleanly. Default 0.
    */
  def slice(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Graphics = js.native
  def slice(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double, anticlockwise: Boolean): Graphics = js.native
  def slice(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: Boolean,
    overshoot: Double
  ): Graphics = js.native
  /**
    * Stroke the current path.
    * 
    * This is an alias for `Graphics.strokePath` and does the same thing.
    * It was added to match the CanvasRenderingContext 2D API.
    */
  def stroke(): Graphics = js.native
  /**
    * Stroke a circle with the given position and radius.
    * @param x The x coordinate of the center of the circle.
    * @param y The y coordinate of the center of the circle.
    * @param radius The radius of the circle.
    */
  def strokeCircle(x: Double, y: Double, radius: Double): Graphics = js.native
  /**
    * Stroke the given circle.
    * @param circle The circle to stroke.
    */
  def strokeCircleShape(circle: Circle): Graphics = js.native
  /**
    * Stroke an ellipse with the given position and size.
    * @param x The x coordinate of the center of the ellipse.
    * @param y The y coordinate of the center of the ellipse.
    * @param width The width of the ellipse.
    * @param height The height of the ellipse.
    * @param smoothness The number of points to draw the ellipse with. Default 32.
    */
  def strokeEllipse(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def strokeEllipse(x: Double, y: Double, width: Double, height: Double, smoothness: integer): Graphics = js.native
  /**
    * Stroke the given ellipse.
    * @param ellipse The ellipse to stroke.
    * @param smoothness The number of points to draw the ellipse with. Default 32.
    */
  def strokeEllipseShape(ellipse: typings.phaser.PhaserNs.GeomNs.Ellipse): Graphics = js.native
  def strokeEllipseShape(ellipse: typings.phaser.PhaserNs.GeomNs.Ellipse, smoothness: integer): Graphics = js.native
  /**
    * Draw the given line.
    * @param line The line to stroke.
    */
  def strokeLineShape(line: typings.phaser.PhaserNs.GeomNs.Line): Graphics = js.native
  /**
    * Stroke the current path.
    */
  def strokePath(): Graphics = js.native
  /**
    * Stroke the shape represented by the given array of points.
    * 
    * Pass `closeShape` to automatically close the shape by joining the last to the first point.
    * 
    * Pass `closePath` to automatically close the path before it is stroked.
    * @param points The points to stroke.
    * @param closeShape When `true`, the shape is closed by joining the last point to the first point. Default false.
    * @param closePath When `true`, the path is closed before being stroked. Default false.
    * @param endIndex The index of `points` to stop drawing at. Defaults to `points.length`.
    */
  def strokePoints(points: js.Array[_ | Point]): Graphics = js.native
  def strokePoints(points: js.Array[_ | Point], closeShape: Boolean): Graphics = js.native
  def strokePoints(points: js.Array[_ | Point], closeShape: Boolean, closePath: Boolean): Graphics = js.native
  def strokePoints(points: js.Array[_ | Point], closeShape: Boolean, closePath: Boolean, endIndex: integer): Graphics = js.native
  /**
    * Stroke a rectangle with the given position and size.
    * @param x The x coordinate of the top-left of the rectangle.
    * @param y The y coordinate of the top-left of the rectangle.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    */
  def strokeRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  /**
    * Stroke the given rectangle.
    * @param rect The rectangle to stroke.
    */
  def strokeRectShape(rect: typings.phaser.PhaserNs.GeomNs.Rectangle): Graphics = js.native
  /**
    * Stroke a rounded rectangle with the given position, size and radius.
    * @param x The x coordinate of the top-left of the rectangle.
    * @param y The y coordinate of the top-left of the rectangle.
    * @param width The width of the rectangle.
    * @param height The height of the rectangle.
    * @param radius The corner radius; It can also be an object to specify different radii for corners. Default 20.
    */
  def strokeRoundedRect(x: Double, y: Double, width: Double, height: Double): Graphics = js.native
  def strokeRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: Double): Graphics = js.native
  def strokeRoundedRect(x: Double, y: Double, width: Double, height: Double, radius: RoundedRectRadius): Graphics = js.native
  /**
    * Stroke a triangle with the given points.
    * @param x0 The x coordinate of the first point.
    * @param y0 The y coordinate of the first point.
    * @param x1 The x coordinate of the second point.
    * @param y1 The y coordinate of the second point.
    * @param x2 The x coordinate of the third point.
    * @param y2 The y coordinate of the third point.
    */
  def strokeTriangle(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double): Graphics = js.native
  /**
    * Stroke the given triangle.
    * @param triangle The triangle to stroke.
    */
  def strokeTriangleShape(triangle: typings.phaser.PhaserNs.GeomNs.Triangle): Graphics = js.native
  /**
    * Inserts a translation command into this Graphics objects command buffer.
    * 
    * All objects drawn _after_ calling this method will be translated
    * by the given amount.
    * 
    * This does not change the position of the Graphics object itself,
    * only of the objects drawn by it after calling this method.
    * @param x The horizontal translation to apply.
    * @param y The vertical translation to apply.
    */
  def translateCanvas(x: Double, y: Double): Graphics = js.native
}

/* static members */
@JSGlobal("Phaser.GameObjects.Graphics")
@js.native
object Graphics extends js.Object {
  /**
    * A Camera used specifically by the Graphics system for rendering to textures.
    */
  var TargetCamera: Camera = js.native
}

