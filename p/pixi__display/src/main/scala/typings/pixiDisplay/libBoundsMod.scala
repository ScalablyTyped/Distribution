package typings.pixiDisplay

import typings.pixiCore.mod.Matrix
import typings.pixiCore.mod.Rectangle
import typings.pixiCore.mod.Transform
import typings.pixiMath.libIpointdataMod.IPointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundsMod {
  
  @JSImport("@pixi/display/lib/Bounds", "Bounds")
  @js.native
  open class Bounds () extends StObject {
    
    /**
      * Adds other {@link Bounds}.
      * @param bounds - The Bounds to be added
      */
    def addBounds(bounds: Bounds): Unit = js.native
    
    /**
      * Adds other Bounds, masked with Rectangle.
      * @param bounds - TODO
      * @param area - TODO
      */
    def addBoundsArea(bounds: Bounds, area: Rectangle): Unit = js.native
    
    /**
      * Adds other Bounds, masked with Bounds.
      * @param bounds - The Bounds to be added.
      * @param mask - TODO
      */
    def addBoundsMask(bounds: Bounds, mask: Bounds): Unit = js.native
    
    /**
      * Adds other Bounds, multiplied by matrix. Bounds shouldn't be empty.
      * @param bounds - other bounds
      * @param matrix - multiplicator
      */
    def addBoundsMatrix(bounds: Bounds, matrix: Matrix): Unit = js.native
    
    /**
      * Adds sprite frame, transformed.
      * @param transform - transform to apply
      * @param x0 - left X of frame
      * @param y0 - top Y of frame
      * @param x1 - right X of frame
      * @param y1 - bottom Y of frame
      */
    def addFrame(transform: Transform, x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
    
    /**
      * Adds sprite frame, multiplied by matrix
      * @param matrix - matrix to apply
      * @param x0 - left X of frame
      * @param y0 - top Y of frame
      * @param x1 - right X of frame
      * @param y1 - bottom Y of frame
      */
    def addFrameMatrix(matrix: Matrix, x0: Double, y0: Double, x1: Double, y1: Double): Unit = js.native
    
    /**
      * Adds padded frame. (x0, y0) should be strictly less than (x1, y1)
      * @param x0 - left X of frame
      * @param y0 - top Y of frame
      * @param x1 - right X of frame
      * @param y1 - bottom Y of frame
      * @param padX - padding X
      * @param padY - padding Y
      */
    def addFramePad(x0: Double, y0: Double, x1: Double, y1: Double, padX: Double, padY: Double): Unit = js.native
    
    /**
      * This function should be inlined when its possible.
      * @param point - The point to add.
      */
    def addPoint(point: IPointData): Unit = js.native
    
    /**
      * Adds a point, after transformed. This should be inlined when its possible.
      * @param matrix
      * @param point
      */
    def addPointMatrix(matrix: Matrix, point: IPointData): Unit = js.native
    
    /**
      * Adds a quad, not transformed
      * @param vertices - The verts to add.
      */
    def addQuad(vertices: js.typedarray.Float32Array): Unit = js.native
    
    /**
      * Adds screen vertices from array
      * @param vertexData - calculated vertices
      * @param beginOffset - begin offset
      * @param endOffset - end offset, excluded
      */
    def addVertexData(vertexData: js.typedarray.Float32Array, beginOffset: Double, endOffset: Double): Unit = js.native
    
    /**
      * Add an array of mesh vertices
      * @param transform - mesh transform
      * @param vertices - mesh coordinates in array
      * @param beginOffset - begin offset
      * @param endOffset - end offset, excluded
      */
    def addVertices(transform: Transform, vertices: js.typedarray.Float32Array, beginOffset: Double, endOffset: Double): Unit = js.native
    
    /**
      * Add an array of mesh vertices.
      * @param matrix - mesh matrix
      * @param vertices - mesh coordinates in array
      * @param beginOffset - begin offset
      * @param endOffset - end offset, excluded
      * @param padX - x padding
      * @param padY - y padding
      */
    def addVerticesMatrix(matrix: Matrix, vertices: js.typedarray.Float32Array, beginOffset: Double, endOffset: Double): Unit = js.native
    def addVerticesMatrix(
      matrix: Matrix,
      vertices: js.typedarray.Float32Array,
      beginOffset: Double,
      endOffset: Double,
      padX: Double
    ): Unit = js.native
    def addVerticesMatrix(
      matrix: Matrix,
      vertices: js.typedarray.Float32Array,
      beginOffset: Double,
      endOffset: Double,
      padX: Double,
      padY: Double
    ): Unit = js.native
    def addVerticesMatrix(
      matrix: Matrix,
      vertices: js.typedarray.Float32Array,
      beginOffset: Double,
      endOffset: Double,
      padX: Unit,
      padY: Double
    ): Unit = js.native
    
    /** Clears the bounds and resets. */
    def clear(): Unit = js.native
    
    /**
      * Can return Rectangle.EMPTY constant, either construct new rectangle, either use your rectangle
      * It is not guaranteed that it will return tempRect
      * @param rect - Temporary object will be used if AABB is not empty
      * @returns - A rectangle of the bounds
      */
    def getRectangle(): Rectangle = js.native
    def getRectangle(rect: Rectangle): Rectangle = js.native
    
    /**
      * Checks if bounds are empty.
      * @returns - True if empty.
      */
    def isEmpty(): Boolean = js.native
    
    /** @default -Infinity */
    var maxX: Double = js.native
    
    /** @default -Infinity */
    var maxY: Double = js.native
    
    /** @default Infinity */
    var minX: Double = js.native
    
    /** @default Infinity */
    var minY: Double = js.native
    
    /**
      * Pads bounds object, making it grow in all directions.
      * If paddingY is omitted, both paddingX and paddingY will be set to paddingX.
      * @param paddingX - The horizontal padding amount.
      * @param paddingY - The vertical padding amount.
      */
    def pad(): Unit = js.native
    def pad(paddingX: Double): Unit = js.native
    def pad(paddingX: Double, paddingY: Double): Unit = js.native
    def pad(paddingX: Unit, paddingY: Double): Unit = js.native
    
    var rect: Rectangle = js.native
    
    /**
      * It is updated to _boundsID of corresponding object to keep bounds in sync with content.
      * Updated from outside, thus public modifier.
      */
    var updateID: Double = js.native
  }
}
