package typings.pixiJs.PIXI

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 'Builder' pattern for bounds rectangles.
  *
  * This could be called an Axis-Aligned Bounding Box.
  * It is not an actual shape. It is a mutable thing; no 'EMPTY' or those kind of problems.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Bounds extends StObject {
  
  /**
    * Adds other Bounds.
    *
    * @param {PIXI.Bounds} bounds - The Bounds to be added
    */
  def addBounds(bounds: Bounds): Unit = js.native
  
  /**
    * Adds other Bounds, masked with Rectangle.
    *
    * @param {PIXI.Bounds} bounds - TODO
    * @param {PIXI.Rectangle} area - TODO
    */
  def addBoundsArea(bounds: Bounds, area: Rectangle): Unit = js.native
  
  /**
    * Adds other Bounds, masked with Bounds.
    *
    * @param {PIXI.Bounds} bounds - The Bounds to be added.
    * @param {PIXI.Bounds} mask - TODO
    */
  def addBoundsMask(bounds: Bounds, mask: Bounds): Unit = js.native
  
  /**
    * Adds other Bounds, multiplied by matrix. Bounds shouldn't be empty.
    *
    * @param {PIXI.Bounds} bounds - other bounds
    * @param {PIXI.Matrix} matrix - multiplicator
    */
  def addBoundsMatrix(bounds: Bounds, matrix: Matrix): Unit = js.native
  
  /**
    * Adds sprite frame, transformed.
    *
    * @param {PIXI.Transform} transform - transform to apply
    * @param {number} x0 - left X of frame
    * @param {number} y0 - top Y of frame
    * @param {number} x1 - right X of frame
    * @param {number} y1 - bottom Y of frame
    */
  def addFrame(transform: Transform, x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
  
  /**
    * Adds sprite frame, multiplied by matrix
    *
    * @param {PIXI.Matrix} matrix - matrix to apply
    * @param {number} x0 - left X of frame
    * @param {number} y0 - top Y of frame
    * @param {number} x1 - right X of frame
    * @param {number} y1 - bottom Y of frame
    */
  def addFrameMatrix(matrix: Matrix, x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
  
  /**
    * Adds padded frame. (x0, y0) should be strictly less than (x1, y1)
    *
    * @param {number} x0 - left X of frame
    * @param {number} y0 - top Y of frame
    * @param {number} x1 - right X of frame
    * @param {number} y1 - bottom Y of frame
    * @param {number} padX - padding X
    * @param {number} padY - padding Y
    */
  def addFramePad(x0: Double, y0: Double, x1: Double, y1: Double, padX: Double, padY: Double): Unit = js.native
  
  /**
    * This function should be inlined when its possible.
    *
    * @param {PIXI.IPointData} point - The point to add.
    */
  def addPoint(point: IPointData): Unit = js.native
  
  /**
    * Adds a quad, not transformed
    *
    * @param {Float32Array} vertices - The verts to add.
    */
  def addQuad(vertices: Float32Array): Unit = js.native
  
  /**
    * Adds screen vertices from array
    *
    * @param {Float32Array} vertexData - calculated vertices
    * @param {number} beginOffset - begin offset
    * @param {number} endOffset - end offset, excluded
    */
  def addVertexData(vertexData: Float32Array, beginOffset: Double, endOffset: Double): Unit = js.native
  
  /**
    * Add an array of mesh vertices
    *
    * @param {PIXI.Transform} transform - mesh transform
    * @param {Float32Array} vertices - mesh coordinates in array
    * @param {number} beginOffset - begin offset
    * @param {number} endOffset - end offset, excluded
    */
  def addVertices(transform: Transform, vertices: Float32Array, beginOffset: Double, endOffset: Double): Unit = js.native
  
  /**
    * Add an array of mesh vertices.
    *
    * @param {PIXI.Matrix} matrix - mesh matrix
    * @param {Float32Array} vertices - mesh coordinates in array
    * @param {number} beginOffset - begin offset
    * @param {number} endOffset - end offset, excluded
    * @param {number} [padX=0] - x padding
    * @param {number} [padY=0] - y padding
    */
  def addVerticesMatrix(matrix: Matrix, vertices: Float32Array, beginOffset: Double, endOffset: Double): Unit = js.native
  def addVerticesMatrix(
    matrix: Matrix,
    vertices: Float32Array,
    beginOffset: Double,
    endOffset: Double,
    padX: js.UndefOr[scala.Nothing],
    padY: Double
  ): Unit = js.native
  def addVerticesMatrix(matrix: Matrix, vertices: Float32Array, beginOffset: Double, endOffset: Double, padX: Double): Unit = js.native
  def addVerticesMatrix(
    matrix: Matrix,
    vertices: Float32Array,
    beginOffset: Double,
    endOffset: Double,
    padX: Double,
    padY: Double
  ): Unit = js.native
  
  /**
    * Clears the bounds and resets.
    *
    */
  def clear(): Unit = js.native
  
  /**
    * Can return Rectangle.EMPTY constant, either construct new rectangle, either use your rectangle
    * It is not guaranteed that it will return tempRect
    *
    * @param {PIXI.Rectangle} rect - temporary object will be used if AABB is not empty
    * @returns {PIXI.Rectangle} A rectangle of the bounds
    */
  def getRectangle(rect: Rectangle): Rectangle = js.native
  
  /**
    * Checks if bounds are empty.
    *
    * @return {boolean} True if empty.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * @member {number} PIXI.Bounds#maxX
    * @default 0
    */
  var maxX: Double = js.native
  
  /**
    * @member {number} PIXI.Bounds#maxY
    * @default 0
    */
  var maxY: Double = js.native
  
  /**
    * @member {number} PIXI.Bounds#minX
    * @default 0
    */
  var minX: Double = js.native
  
  /**
    * @member {number} PIXI.Bounds#minY
    * @default 0
    */
  var minY: Double = js.native
  
  /**
    * Pads bounds object, making it grow in all directions.
    * If paddingY is omitted, both paddingX and paddingY will be set to paddingX.
    *
    * @param {number} [paddingX=0] - The horizontal padding amount.
    * @param {number} [paddingY=0] - The vertical padding amount.
    */
  def pad(): Unit = js.native
  def pad(paddingX: js.UndefOr[scala.Nothing], paddingY: Double): Unit = js.native
  def pad(paddingX: Double): Unit = js.native
  def pad(paddingX: Double, paddingY: Double): Unit = js.native
  
  /**
    * It is updated to _boundsID of corresponding object to keep bounds in sync with content.
    * Updated from outside, thus public modifier.
    *
    * @member {number} PIXI.Bounds#updateID
    * @public
    */
  var updateID: Double = js.native
}
