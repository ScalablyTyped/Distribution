package typings.pixiGraphics

import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.BatchDrawCall
import typings.pixiCore.mod.BatchGeometry
import typings.pixiCore.mod.Matrix
import typings.pixiCore.mod.Texture
import typings.pixiDisplay.mod.Bounds
import typings.pixiGraphics.libGraphicsDataMod.GraphicsData
import typings.pixiGraphics.libStylesFillStyleMod.FillStyle
import typings.pixiGraphics.libStylesLineStyleMod.LineStyle
import typings.pixiGraphics.libUtilsMod.BatchPart
import typings.pixiMath.libIpointdataMod.IPointData
import typings.pixiMath.mod.IShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphicsGeometryMod {
  
  @JSImport("@pixi/graphics/lib/GraphicsGeometry", "GraphicsGeometry")
  @js.native
  open class GraphicsGeometry () extends BatchGeometry {
    
    /** Cached bounds. */
    /* protected */ var _bounds: Bounds = js.native
    
    /**
      * Affinity check
      * @param styleA
      * @param styleB
      */
    /* protected */ def _compareStyles(styleA: FillStyle, styleB: FillStyle): Boolean = js.native
    /* protected */ def _compareStyles(styleA: FillStyle, styleB: LineStyle): Boolean = js.native
    /* protected */ def _compareStyles(styleA: LineStyle, styleB: FillStyle): Boolean = js.native
    /* protected */ def _compareStyles(styleA: LineStyle, styleB: LineStyle): Boolean = js.native
    
    /**
      * Add colors.
      * @param colors - List of colors to add to
      * @param color - Color to add
      * @param alpha - Alpha to use
      * @param size - Number of colors to add
      * @param offset
      */
    /* protected */ def addColors(colors: js.Array[Double], color: Double, alpha: Double, size: Double): Unit = js.native
    /* protected */ def addColors(colors: js.Array[Double], color: Double, alpha: Double, size: Double, offset: Double): Unit = js.native
    
    /**
      * Add texture id that the shader/fragment wants to use.
      * @param textureIds
      * @param id
      * @param size
      * @param offset
      */
    /* protected */ def addTextureIds(textureIds: js.Array[Double], id: Double, size: Double): Unit = js.native
    /* protected */ def addTextureIds(textureIds: js.Array[Double], id: Double, size: Double, offset: Double): Unit = js.native
    
    /**
      * Generates the UVs for a shape.
      * @param verts - Vertices
      * @param uvs - UVs
      * @param texture - Reference to Texture
      * @param start - Index buffer start index.
      * @param size - The size/length for index buffer.
      * @param matrix - Optional transform for all points.
      */
    /* protected */ def addUvs(
      verts: js.Array[Double],
      uvs: js.Array[Double],
      texture: Texture[Resource],
      start: Double,
      size: Double
    ): Unit = js.native
    /* protected */ def addUvs(
      verts: js.Array[Double],
      uvs: js.Array[Double],
      texture: Texture[Resource],
      start: Double,
      size: Double,
      matrix: Matrix
    ): Unit = js.native
    
    /**
      * Modify uvs array according to position of texture region
      * Does not work with rotated or trimmed textures
      * @param uvs - array
      * @param texture - region
      * @param start - starting index for uvs
      * @param size - how many points to adjust
      */
    /* protected */ def adjustUvs(uvs: js.Array[Double], texture: Texture[Resource], start: Double, size: Double): Unit = js.native
    
    /** Batches need to regenerated if the geometry is updated. */
    var batchDirty: Double = js.native
    
    var batchable: Boolean = js.native
    
    /**
      * Intermediate abstract format sent to batch system.
      * Can be converted to drawCalls or to batchable objects.
      * @member {PIXI.graphicsUtils.BatchPart[]}
      */
    var batches: js.Array[BatchPart] = js.native
    
    /**
      * Get the current bounds of the graphic geometry.
      *
      * Since 6.5.0, bounds of the graphics geometry are calculated based on the vertices of generated geometry.
      * Since shapes or strokes with full transparency (`alpha: 0`) will not generate geometry, they are not considered
      * when calculating bounds for the graphics geometry. See PR [#8343]{@link https://github.com/pixijs/pixijs/pull/8343}
      * and issue [#8623]{@link https://github.com/pixijs/pixijs/pull/8623}.
      * @readonly
      */
    def bounds: Bounds = js.native
    
    /** The bounds dirty flag. */
    /* protected */ var boundsDirty: Double = js.native
    
    /** Padding to add to the bounds. */
    var boundsPadding: Double = js.native
    
    /** Converts intermediate batches data to drawCalls. */
    /* protected */ def buildDrawCalls(): Unit = js.native
    
    /** Used to check if the cache is dirty. */
    /* protected */ var cacheDirty: Double = js.native
    
    /** Update the local bounds of the object. Expensive to use performance-wise. */
    /* protected */ def calculateBounds(): Unit = js.native
    
    /**
      * Clears the graphics that were drawn to this Graphics object, and resets fill and line style settings.
      * @returns - This GraphicsGeometry object. Good for chaining method calls
      */
    def clear(): GraphicsGeometry = js.native
    
    /** Used to detect if we cleared the graphicsData. */
    /* protected */ var clearDirty: Double = js.native
    
    /** Minimal distance between points that are considered different. Affects line tesselation. */
    var closePointEps: Double = js.native
    
    /** The collection of colors */
    var colors: js.Array[Double] = js.native
    
    /**
      * Check to see if a point is contained within this geometry.
      * @param point - Point to check if it's contained.
      * @returns {boolean} `true` if the point is contained within geometry.
      */
    def containsPoint(point: IPointData): Boolean = js.native
    
    /** Used to detect if the graphics object has changed. */
    /* protected */ var dirty: Double = js.native
    
    /**
      * List of current draw calls drived from the batches.
      * @member {PIXI.BatchDrawCall[]}
      */
    var drawCalls: js.Array[BatchDrawCall] = js.native
    
    /**
      * Draws the given shape to this Graphics object. Can be any of Circle, Rectangle, Ellipse, Line or Polygon.
      * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
      * @param matrix - Transform applied to the points of the shape.
      * @returns - Returns geometry for chaining.
      */
    def drawHole(shape: IShape): GraphicsGeometry = js.native
    def drawHole(shape: IShape, matrix: Matrix): GraphicsGeometry = js.native
    
    /**
      * Draws the given shape to this Graphics object. Can be any of Circle, Rectangle, Ellipse, Line or Polygon.
      * @param {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} shape - The shape object to draw.
      * @param fillStyle - Defines style of the fill.
      * @param lineStyle - Defines style of the lines.
      * @param matrix - Transform applied to the points of the shape.
      * @returns - Returns geometry for chaining.
      */
    def drawShape(shape: IShape): GraphicsGeometry = js.native
    def drawShape(shape: IShape, fillStyle: Unit, lineStyle: Unit, matrix: Matrix): GraphicsGeometry = js.native
    def drawShape(shape: IShape, fillStyle: Unit, lineStyle: LineStyle): GraphicsGeometry = js.native
    def drawShape(shape: IShape, fillStyle: Unit, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry = js.native
    def drawShape(shape: IShape, fillStyle: FillStyle): GraphicsGeometry = js.native
    def drawShape(shape: IShape, fillStyle: FillStyle, lineStyle: Unit, matrix: Matrix): GraphicsGeometry = js.native
    def drawShape(shape: IShape, fillStyle: FillStyle, lineStyle: LineStyle): GraphicsGeometry = js.native
    def drawShape(shape: IShape, fillStyle: FillStyle, lineStyle: LineStyle, matrix: Matrix): GraphicsGeometry = js.native
    
    /**
      * The collection of drawn shapes.
      * @member {PIXI.GraphicsData[]}
      */
    var graphicsData: js.Array[GraphicsData] = js.native
    
    /** The indices of the vertices */
    var indices: js.Array[Double] = js.native
    
    var indicesUint16: js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
    
    /** Call if you changed graphicsData manually. Empties all batch buffers. */
    /* protected */ def invalidate(): Unit = js.native
    
    /**
      * Checks to see if this graphics geometry can be batched.
      * Currently it needs to be small enough and not contain any native lines.
      */
    /* protected */ def isBatchable(): Boolean = js.native
    
    /** Packs attributes to single buffer. */
    /* protected */ def packAttributes(): Unit = js.native
    
    /** Offset the indices so that it works with the batcher. */
    /* protected */ def packBatches(): Unit = js.native
    
    /** An array of points to draw, 2 numbers per point */
    var points: js.Array[Double] = js.native
    
    /**
      * Process fill part of Graphics.
      * @param data
      */
    /* protected */ def processFill(data: GraphicsData): Unit = js.native
    
    /**
      * Process the holes data.
      * @param holes
      */
    /* protected */ def processHoles(holes: js.Array[GraphicsData]): Unit = js.native
    
    /**
      * Process line part of Graphics.
      * @param data
      */
    /* protected */ def processLine(data: GraphicsData): Unit = js.native
    
    /** Index of the last batched shape in the stack of calls. */
    /* protected */ var shapeIndex: Double = js.native
    
    /** Reference to the texture IDs. */
    var textureIds: js.Array[Double] = js.native
    
    /**
      * Transform points using matrix.
      * @param points - Points to transform
      * @param matrix - Transform matrix
      */
    /* protected */ def transformPoints(points: js.Array[Double], matrix: Matrix): Unit = js.native
    
    /**
      * Generates intermediate batch data. Either gets converted to drawCalls
      * or used to convert to batch objects directly by the Graphics object.
      */
    def updateBatches(): Unit = js.native
    
    /** The UVs collection */
    var uvs: js.Array[Double] = js.native
    
    var uvsFloat32: js.typedarray.Float32Array = js.native
    
    /** Test geometry for batching process. */
    /* protected */ def validateBatching(): Boolean = js.native
  }
  /* static members */
  object GraphicsGeometry {
    
    @JSImport("@pixi/graphics/lib/GraphicsGeometry", "GraphicsGeometry")
    @js.native
    val ^ : js.Any = js.native
    
    /** The maximum number of points to consider an object "batchable", able to be batched by the renderer's batch system. */
    @JSImport("@pixi/graphics/lib/GraphicsGeometry", "GraphicsGeometry.BATCHABLE_SIZE")
    @js.native
    def BATCHABLE_SIZE: Double = js.native
    inline def BATCHABLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCHABLE_SIZE")(x.asInstanceOf[js.Any])
  }
}
