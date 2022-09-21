package typings.pixiMesh

import typings.pixiConstants.mod.BLEND_MODES
import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.mod.Buffer
import typings.pixiCore.mod.Geometry
import typings.pixiCore.mod.IArrayBuffer
import typings.pixiCore.mod.Program
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.State
import typings.pixiCore.mod.Texture
import typings.pixiCore.mod.TextureMatrix
import typings.pixiDisplay.anon.DisplayObject
import typings.pixiDisplay.mod.Container
import typings.pixiMath.mod.IPointData
import typings.pixiUtils.mod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/mesh", "Mesh")
  @js.native
  open class Mesh[T /* <: Shader */] protected ()
    extends Container[DisplayObject]
       with typings.pixiMesh.GlobalMixins.Mesh {
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
    
    @JSImport("@pixi/mesh", "Mesh")
    @js.native
    val ^ : js.Any = js.native
    
    /** The maximum number of vertices to consider batchable. Generally, the complexity of the geometry. */
    @JSImport("@pixi/mesh", "Mesh.BATCHABLE_SIZE")
    @js.native
    def BATCHABLE_SIZE: Double = js.native
    inline def BATCHABLE_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCHABLE_SIZE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@pixi/mesh", "MeshBatchUvs")
  @js.native
  open class MeshBatchUvs protected () extends StObject {
    /**
      * @param uvBuffer - Buffer with normalized uv's
      * @param uvMatrix - Material UV matrix
      */
    def this(uvBuffer: Buffer, uvMatrix: TextureMatrix) = this()
    
    /* private */ var _bufferUpdateId: Any = js.native
    
    /* private */ var _textureUpdateId: Any = js.native
    
    var _updateID: Double = js.native
    
    /** UV Buffer data. */
    val data: js.typedarray.Float32Array = js.native
    
    /**
      * Updates
      * @param forceUpdate - force the update
      */
    def update(): Unit = js.native
    def update(forceUpdate: Boolean): Unit = js.native
    
    /** Buffer with normalized UV's. */
    var uvBuffer: Buffer = js.native
    
    /** Material UV matrix. */
    var uvMatrix: TextureMatrix = js.native
  }
  
  @JSImport("@pixi/mesh", "MeshGeometry")
  @js.native
  /**
    * @param {Float32Array|number[]} [vertices] - Positional data on geometry.
    * @param {Float32Array|number[]} [uvs] - Texture UVs.
    * @param {Uint16Array|number[]} [index] - IndexBuffer
    */
  open class MeshGeometry () extends Geometry {
    def this(vertices: IArrayBuffer) = this()
    def this(vertices: Unit, uvs: IArrayBuffer) = this()
    def this(vertices: IArrayBuffer, uvs: IArrayBuffer) = this()
    def this(vertices: Unit, uvs: Unit, index: IArrayBuffer) = this()
    def this(vertices: Unit, uvs: IArrayBuffer, index: IArrayBuffer) = this()
    def this(vertices: IArrayBuffer, uvs: Unit, index: IArrayBuffer) = this()
    def this(vertices: IArrayBuffer, uvs: IArrayBuffer, index: IArrayBuffer) = this()
    
    /**
      * Dirty flag to limit update calls on Mesh. For example,
      * limiting updates on a single Mesh instance with a shared Geometry
      * within the render loop.
      * @private
      * @default -1
      */
    var _updateId: Double = js.native
    
    /**
      * If the vertex position is updated.
      * @readonly
      * @private
      */
    def vertexDirtyId: Double = js.native
  }
  
  @JSImport("@pixi/mesh", "MeshMaterial")
  @js.native
  open class MeshMaterial protected ()
    extends Shader
       with typings.pixiMesh.GlobalMixins.MeshMaterial {
    /**
      * @param uSampler - Texture that material uses to render.
      * @param options - Additional options
      * @param {number} [options.alpha=1] - Default alpha.
      * @param {number} [options.tint=0xFFFFFF] - Default tint.
      * @param {string} [options.pluginName='batch'] - Renderer plugin for batching.
      * @param {PIXI.Program} [options.program=0xFFFFFF] - Custom program.
      * @param {object} [options.uniforms] - Custom uniforms.
      */
    def this(uSampler: Texture[Resource]) = this()
    def this(uSampler: Texture[Resource], options: IMeshMaterialOptions) = this()
    
    /* private */ var _alpha: Any = js.native
    
    /**
      * Only do update if tint or alpha changes.
      * @private
      * @default false
      */
    /* private */ var _colorDirty: Any = js.native
    
    /* private */ var _tint: Any = js.native
    
    var _tintRGB: Double = js.native
    
    def alpha: Double = js.native
    /**
      * This gets automatically set by the object using this.
      * @default 1
      */
    def alpha_=(value: Double): Unit = js.native
    
    /**
      * `true` if shader can be batch with the renderer's batch system.
      * @default true
      */
    var batchable: Boolean = js.native
    
    /**
      * Renderer plugin for batching.
      * @default 'batch'
      */
    var pluginName: String = js.native
    
    /** Reference to the texture being rendered. */
    def texture: Texture[Resource] = js.native
    def texture_=(value: Texture[Resource]): Unit = js.native
    
    def tint: Double = js.native
    /**
      * Multiply tint for the material.
      * @default 0xFFFFFF
      */
    def tint_=(value: Double): Unit = js.native
    
    /** Gets called automatically by the Mesh. Intended to be overridden for custom {@link MeshMaterial} objects. */
    def update(): Unit = js.native
    
    /**
      * TextureMatrix instance for this Mesh, used to track Texture changes.
      * @readonly
      */
    val uvMatrix: TextureMatrix = js.native
  }
  
  trait IMeshMaterialOptions extends StObject {
    
    var alpha: js.UndefOr[Double] = js.undefined
    
    var pluginName: js.UndefOr[String] = js.undefined
    
    var program: js.UndefOr[Program] = js.undefined
    
    var tint: js.UndefOr[Double] = js.undefined
    
    var uniforms: js.UndefOr[Dict[Any]] = js.undefined
  }
  object IMeshMaterialOptions {
    
    inline def apply(): IMeshMaterialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMeshMaterialOptions]
    }
    
    extension [Self <: IMeshMaterialOptions](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
      
      inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
      
      inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
      
      inline def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
      
      inline def setUniforms(value: Dict[Any]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
      
      inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    }
  }
}
