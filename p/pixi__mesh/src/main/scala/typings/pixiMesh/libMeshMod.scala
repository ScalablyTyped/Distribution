package typings.pixiMesh

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Buffer
import typings.pixiCore.mod.Geometry
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.State
import typings.pixiCore.mod.Texture
import typings.pixiDisplay.libDisplayObjectMod.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiMath.libIpointdataMod.IPointData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMeshMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GlobalMixins.Mesh * / any */ @JSImport("@pixi/mesh/lib/Mesh", "Mesh")
  @js.native
  open class Mesh[T /* <: Shader */] protected () extends Container[DisplayObject] {
    /**
      * @param geometry - The geometry the mesh will use.
      * @param {PIXI.MeshMaterial} shader - The shader the mesh will use.
      * @param state - The state that the WebGL context is required to be in to render the mesh
      *        if no state is provided, uses {@link PIXI.State.for2d} to create a 2D state for PixiJS.
      * @param drawMode - The drawMode, can be any of the {@link PIXI.DRAW_MODES} constants.
      */
    def this(geometry: Geometry, shader: T) = this()
    def this(geometry: Geometry, shader: T, state: State) = this()
    def this(geometry: Geometry, shader: T, state: Unit, drawMode: DRAW_MODES) = this()
    def this(geometry: Geometry, shader: T, state: State, drawMode: DRAW_MODES) = this()
    
    /* private */ var _geometry: Any = js.native
    
    /**
      * Standard non-batching way of rendering.
      * @param renderer - Instance to renderer.
      */
    /* protected */ def _renderDefault(renderer: Renderer): Unit = js.native
    
    /**
      * Rendering by using the Batch system.
      * @param renderer - Instance to renderer.
      */
    /* protected */ def _renderToBatch(renderer: Renderer): Unit = js.native
    
    /** Internal roundPixels field. */
    /* private */ var _roundPixels: Any = js.native
    
    var _texture: Texture[Resource] = js.native
    
    var _tintRGB: Double = js.native
    
    /* private */ var _transformID: Any = js.native
    
    /** Batched UV's are cached for atlas textures. */
    /* private */ var batchUvs: Any = js.native
    
    def blendMode: BLEND_MODES = js.native
    /**
      * The blend mode to be applied to the Mesh. Apply a value of
      * `PIXI.BLEND_MODES.NORMAL` to reset the blend mode.
      * @default PIXI.BLEND_MODES.NORMAL;
      */
    def blendMode_=(value: BLEND_MODES): Unit = js.native
    
    /** Updates uv field based on from geometry uv's or batchUvs. */
    def calculateUvs(): Unit = js.native
    
    /** Updates vertexData field based on transform and vertices. */
    def calculateVertices(): Unit = js.native
    
    /**
      * Tests if a point is inside this mesh. Works only for PIXI.DRAW_MODES.TRIANGLES.
      * @param point - The point to test.
      * @returns - The result of the test.
      */
    def containsPoint(point: IPointData): Boolean = js.native
    
    /** The way the Mesh should be drawn, can be any of the {@link PIXI.DRAW_MODES} constants. */
    var drawMode: DRAW_MODES = js.native
    
    /**
      * Includes vertex positions, face indices, normals, colors, UVs, and
      * custom attributes within buffers, reducing the cost of passing all
      * this data to the GPU. Can be shared between multiple Mesh objects.
      */
    def geometry: Geometry = js.native
    def geometry_=(value: Geometry): Unit = js.native
    
    /**
      * These are used as easy access for batching.
      * @private
      */
    var indices: js.typedarray.Uint16Array = js.native
    
    def material: T = js.native
    /** Alias for {@link PIXI.Mesh#shader}. */
    def material_=(value: T): Unit = js.native
    
    def roundPixels: Boolean = js.native
    /**
      * If true PixiJS will Math.floor() x/y values when rendering, stopping pixel interpolation.
      * Advantages can include sharper image quality (like text) and faster rendering on canvas.
      * The main disadvantage is movement of objects may appear less smooth.
      * To set the global default, change {@link PIXI.settings.ROUND_PIXELS}
      * @default false
      */
    def roundPixels_=(value: Boolean): Unit = js.native
    
    /**
      * Represents the vertex and fragment shaders that processes the geometry and runs on the GPU.
      * Can be shared between multiple Mesh objects.
      * @type {PIXI.Shader|PIXI.MeshMaterial}
      */
    var shader: T = js.native
    
    /**
      * How much of the geometry to draw, by default `0` renders everything.
      * @default 0
      */
    var size: Double = js.native
    
    /**
      * Typically the index of the IndexBuffer where to start drawing.
      * @default 0
      */
    var start: Double = js.native
    
    /**
      * Represents the WebGL state the Mesh required to render, excludes shader and geometry. E.g.,
      * blend mode, culling, depth testing, direction of rendering triangles, backface, etc.
      */
    var state: State = js.native
    
    /** The texture that the Mesh uses. Null for non-MeshMaterial shaders */
    def texture: Texture[Resource] = js.native
    def texture_=(value: Texture[Resource]): Unit = js.native
    
    /**
      * The multiply tint applied to the Mesh. This is a hex value. A value of
      * `0xFFFFFF` will remove any tint effect.
      *
      * Null for non-MeshMaterial shaders
      * @default 0xFFFFFF
      */
    def tint: Double = js.native
    def tint_=(value: Double): Unit = js.native
    
    /**
      * To change mesh uv's, change its uvBuffer data and increment its _updateID.
      * @readonly
      */
    def uvBuffer: Buffer = js.native
    
    /**
      * These are used as easy access for batching.
      * @private
      */
    var uvs: js.typedarray.Float32Array = js.native
    
    /** This is the caching layer used by the batcher. */
    /* private */ var vertexData: Any = js.native
    
    /** If geometry is changed used to decide to re-transform the vertexData. */
    /* private */ var vertexDirty: Any = js.native
    
    /**
      * To change mesh vertices, change its uvBuffer data and increment its _updateID.
      * Incrementing _updateID is optional because most of Mesh objects do it anyway.
      * @readonly
      */
    def verticesBuffer: Buffer = js.native
  }
  /* static members */
  object Mesh {
    
    @JSImport("@pixi/mesh/lib/Mesh", "Mesh")
    @js.native
    val ^ : js.Any = js.native
    
    /** The maximum number of vertices to consider batchable. Generally, the complexity of the geometry. */
    @JSImport("@pixi/mesh/lib/Mesh", "Mesh.BATCHABLE_SIZE")
    @js.native
    def BATCHABLE_SIZE: Double = js.native
    inline def BATCHABLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCHABLE_SIZE")(x.asInstanceOf[js.Any])
  }
}
