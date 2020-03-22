package typings.pixiJs.PIXI

import typings.pixiJs.AnonBaseTexture
import typings.pixiJs.PIXI.graphicsUtils.BatchPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Graphics class contains methods used to draw primitive shapes such as lines, circles and
  * rectangles to the display, and to color and fill them.
  *
  * GraphicsGeometry is designed to not be continually updating the geometry since it's expensive
  * to re-tesselate using **earcut**. Consider using {@link PIXI.Mesh} for this use-case, it's much faster.
  *
  * @class
  * @extends PIXI.BatchGeometry
  * @memberof PIXI
  */
@JSGlobal("PIXI.GraphicsGeometry")
@js.native
class GraphicsGeometry () extends BatchGeometry {
  /**
    * Cached bounds.
    *
    * @member {PIXI.Bounds} PIXI.GraphicsGeometry#_bounds
    * @protected
    */
  var _bounds: Bounds = js.native
  /**
    * Batches need to regenerated if the geometry is updated.
    *
    * @member {number} PIXI.GraphicsGeometry#batchDirty
    * @protected
    */
  var batchDirty: Double = js.native
  /**
    * Intermediate abstract format sent to batch system.
    * Can be converted to drawCalls or to batchable objects.
    *
    * @member {PIXI.graphicsUtils.BatchPart[]} PIXI.GraphicsGeometry#batches
    * @protected
    */
  var batches: js.Array[BatchPart] = js.native
  /**
    * Get the current bounds of the graphic geometry.
    *
    * @member {PIXI.Bounds}
    * @readonly
    */
  val bounds: Bounds = js.native
  /**
    * The bounds dirty flag.
    *
    * @member {number} PIXI.GraphicsGeometry#boundsDirty
    * @protected
    */
  var boundsDirty: Double = js.native
  /**
    * Padding to add to the bounds.
    *
    * @member {number} PIXI.GraphicsGeometry#boundsPadding
    * @default 0
    */
  var boundsPadding: Double = js.native
  /**
    * Used to check if the cache is dirty.
    *
    * @member {number} PIXI.GraphicsGeometry#cacheDirty
    * @protected
    */
  var cacheDirty: Double = js.native
  /**
    * Used to detect if we cleared the graphicsData.
    *
    * @member {number} PIXI.GraphicsGeometry#clearDirty
    * @default 0
    * @protected
    */
  var clearDirty: Double = js.native
  /**
    * Minimal distance between points that are considered different.
    * Affects line tesselation.
    *
    * @member {number} PIXI.GraphicsGeometry#closePointEps
    */
  var closePointEps: Double = js.native
  /**
    * The collection of colors
    *
    * @member {number[]} PIXI.GraphicsGeometry#colors
    * @protected
    */
  var colors: js.Array[Double] = js.native
  /**
    * Used to detect if the graphics object has changed.
    *
    * @member {number} PIXI.GraphicsGeometry#dirty
    * @protected
    */
  var dirty: Double = js.native
  /**
    * List of current draw calls drived from the batches.
    *
    * @member {object[]} PIXI.GraphicsGeometry#drawCalls
    * @protected
    */
  var drawCalls: js.Array[_] = js.native
  /**
    * The collection of drawn shapes.
    *
    * @member {PIXI.GraphicsData[]} PIXI.GraphicsGeometry#graphicsData
    * @protected
    */
  var graphicsData: js.Array[GraphicsData] = js.native
  /**
    * The indices of the vertices
    *
    * @member {number[]} PIXI.GraphicsGeometry#indices
    * @protected
    */
  var indices: js.Array[Double] = js.native
  /**
    * An array of points to draw, 2 numbers per point
    *
    * @member {number[]} PIXI.GraphicsGeometry#points
    * @protected
    */
  var points: js.Array[Double] = js.native
  /**
    * Index of the last batched shape in the stack of calls.
    *
    * @member {number} PIXI.GraphicsGeometry#shapeIndex
    * @protected
    */
  var shapeIndex: Double = js.native
  /**
    * Reference to the texture IDs.
    *
    * @member {number[]} PIXI.GraphicsGeometry#textureIds
    * @protected
    */
  var textureIds: js.Array[Double] = js.native
  /**
    * The UVs collection
    *
    * @member {number[]} PIXI.GraphicsGeometry#uvs
    * @protected
    */
  var uvs: js.Array[Double] = js.native
  /**
    * Affinity check
    *
    * @param {PIXI.FillStyle | PIXI.LineStyle} styleA
    * @param {PIXI.FillStyle | PIXI.LineStyle} styleB
    */
  def _compareStyles(styleA: FillStyle, styleB: FillStyle): Unit = js.native
  def _compareStyles(styleA: FillStyle, styleB: LineStyle): Unit = js.native
  def _compareStyles(styleA: LineStyle, styleB: FillStyle): Unit = js.native
  def _compareStyles(styleA: LineStyle, styleB: LineStyle): Unit = js.native
  /**
    * Add colors.
    *
    * @protected
    * @param {number[]} colors - List of colors to add to
    * @param {number} color - Color to add
    * @param {number} alpha - Alpha to use
    * @param {number} size - Number of colors to add
    */
  /* protected */ def addColors(colors: js.Array[Double], color: Double, alpha: Double, size: Double): Unit = js.native
  /**
    * Add texture id that the shader/fragment wants to use.
    *
    * @protected
    * @param {number[]} textureIds
    * @param {number} id
    * @param {number} size
    */
  /* protected */ def addTextureIds(textureIds: js.Array[Double], id: Double, size: Double): Unit = js.native
  /**
    * Generates the UVs for a shape.
    *
    * @protected
    * @param {number[]} verts - Vertices
    * @param {number[]} uvs - UVs
    * @param {PIXI.Texture} texture - Reference to Texture
    * @param {number} start - Index buffer start index.
    * @param {number} size - The size/length for index buffer.
    * @param {PIXI.Matrix} [matrix] - Optional transform for all points.
    */
  /* protected */ def addUvs(verts: js.Array[Double], uvs: js.Array[Double], texture: Texture, start: Double, size: Double): Unit = js.native
  /* protected */ def addUvs(
    verts: js.Array[Double],
    uvs: js.Array[Double],
    texture: Texture,
    start: Double,
    size: Double,
    matrix: Matrix
  ): Unit = js.native
  /**
    * Modify uvs array according to position of texture region
    * Does not work with rotated or trimmed textures
    *
    * @param {number[]} uvs array
    * @param {PIXI.Texture} texture region
    * @param {number} start starting index for uvs
    * @param {number} size how many points to adjust
    */
  def adjustUvs(uvs: js.Array[Double], texture: Texture, start: Double, size: Double): Unit = js.native
  /**
    * Converts intermediate batches data to drawCalls.
    *
    * @protected
    */
  /* protected */ def buildDrawCalls(): Unit = js.native
  /**
    * Update the local bounds of the object. Expensive to use performance-wise.
    *
    * @protected
    */
  /* protected */ def calculateBounds(): Unit = js.native
  /**
    * Clears the graphics that were drawn to this Graphics object, and resets fill and line style settings.
    *
    * @return {PIXI.GraphicsGeometry} This GraphicsGeometry object. Good for chaining method calls
    */
  def clear(): GraphicsGeometry = js.native
  /**
    * Check to see if a point is contained within this geometry.
    *
    * @param {PIXI.Point} point - Point to check if it's contained.
    * @return {Boolean} `true` if the point is contained within geometry.
    */
  def containsPoint(point: Point): Boolean = js.native
  /**
    * Destroys the Graphics object.
    *
    * @param {object|boolean} [options] - Options parameter. A boolean will act as if all
    *  options have been set to that value
    * @param {boolean} [options.children=false] - if set to true, all the children will have
    *  their destroy method called as well. 'options' will be passed on to those calls.
    * @param {boolean} [options.texture=false] - Only used for child Sprites if options.children is set to true
    *  Should it destroy the texture of the child sprite
    * @param {boolean} [options.baseTexture=false] - Only used for child Sprites if options.children is set to true
    *  Should it destroy the base texture of the child sprite
    */
  def destroy(): Unit = js.native
  def destroy(options: AnonBaseTexture): Unit = js.native
  /**
    * Draws the given shape to this Graphics object. Can be any of Circle, Rectangle, Ellipse, Line or Polygon.
    *
    * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
    * @param {PIXI.Matrix} matrix - Transform applied to the points of the shape.
    * @return {PIXI.GraphicsGeometry} Returns geometry for chaining.
    */
  def drawHole(shape: Circle, matrix: Matrix): GraphicsGeometry = js.native
  def drawHole(shape: Ellipse, matrix: Matrix): GraphicsGeometry = js.native
  def drawHole(shape: Polygon, matrix: Matrix): GraphicsGeometry = js.native
  def drawHole(shape: Rectangle, matrix: Matrix): GraphicsGeometry = js.native
  def drawHole(shape: RoundedRectangle, matrix: Matrix): GraphicsGeometry = js.native
  /**
    * Draws the given shape to this Graphics object. Can be any of Circle, Rectangle, Ellipse, Line or Polygon.
    *
    * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
    * @param {PIXI.FillStyle} fillStyle - Defines style of the fill.
    * @param {PIXI.LineStyle} lineStyle - Defines style of the lines.
    * @param {PIXI.Matrix} matrix - Transform applied to the points of the shape.
    * @return {PIXI.GraphicsGeometry} Returns geometry for chaining.
    */
  def drawShape(shape: Circle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry = js.native
  def drawShape(shape: Ellipse, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry = js.native
  def drawShape(shape: Polygon, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry = js.native
  def drawShape(shape: Rectangle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry = js.native
  def drawShape(shape: RoundedRectangle, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry = js.native
  /**
    * Call if you changed graphicsData manually.
    * Empties all batch buffers.
    */
  def invalidate(): Unit = js.native
  /**
    * Checks to see if this graphics geometry can be batched.
    * Currently it needs to be small enough and not contain any native lines.
    *
    * @protected
    */
  /* protected */ def isBatchable(): Unit = js.native
  /**
    * Packs attributes to single buffer.
    *
    * @protected
    */
  /* protected */ def packAttributes(): Unit = js.native
  /**
    * Offset the indices so that it works with the batcher.
    *
    * @protected
    */
  /* protected */ def packBatches(): Unit = js.native
  /**
    * Process fill part of Graphics.
    *
    * @param {PIXI.GraphicsData} data
    * @protected
    */
  /* protected */ def processFill(data: GraphicsData): Unit = js.native
  /**
    * Process the holes data.
    *
    * @param {PIXI.GraphicsData[]} holes - Holes to render
    * @protected
    */
  /* protected */ def processHoles(holes: js.Array[GraphicsData]): Unit = js.native
  /**
    * Process line part of Graphics.
    *
    * @param {PIXI.GraphicsData} data
    * @protected
    */
  /* protected */ def processLine(data: GraphicsData): Unit = js.native
  /**
    * Transform points using matrix.
    *
    * @protected
    * @param {number[]} points - Points to transform
    * @param {PIXI.Matrix} matrix - Transform matrix
    */
  /* protected */ def transformPoints(points: js.Array[Double], matrix: Matrix): Unit = js.native
  /**
    * Generates intermediate batch data. Either gets converted to drawCalls
    * or used to convert to batch objects directly by the Graphics object.
    */
  def updateBatches(): Unit = js.native
  /**
    * Test geometry for batching process.
    *
    * @protected
    */
  /* protected */ def validateBatching(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.GraphicsGeometry")
@js.native
object GraphicsGeometry extends js.Object {
  /**
    * The maximum number of points to consider an object "batchable",
    * able to be batched by the renderer's batch system.
    *
    * @memberof PIXI.GraphicsGeometry
    * @static
    * @member {number} BATCHABLE_SIZE
    * @default 100
    */
  var BATCHABLE_SIZE: Double = js.native
}

