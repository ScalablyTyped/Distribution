package typings.pixiMesh

import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.libGeometryBufferMod.IArrayBuffer
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Buffer
import typings.pixiCore.mod.Geometry
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.State
import typings.pixiCore.mod.Texture
import typings.pixiCore.mod.TextureMatrix
import typings.pixiMesh.libMeshMaterialMod.IMeshMaterialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/mesh", "Mesh")
  @js.native
  open class Mesh[T /* <: Shader */] protected ()
    extends typings.pixiMesh.libMeshMod.Mesh[T] {
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
  open class MeshBatchUvs protected ()
    extends typings.pixiMesh.libMeshBatchUvsMod.MeshBatchUvs {
    /**
      * @param uvBuffer - Buffer with normalized uv's
      * @param uvMatrix - Material UV matrix
      */
    def this(uvBuffer: Buffer, uvMatrix: TextureMatrix) = this()
  }
  
  @JSImport("@pixi/mesh", "MeshGeometry")
  @js.native
  /**
    * @param {Float32Array|number[]} [vertices] - Positional data on geometry.
    * @param {Float32Array|number[]} [uvs] - Texture UVs.
    * @param {Uint16Array|number[]} [index] - IndexBuffer
    */
  open class MeshGeometry ()
    extends typings.pixiMesh.libMeshGeometryMod.MeshGeometry {
    def this(vertices: IArrayBuffer) = this()
    def this(vertices: Unit, uvs: IArrayBuffer) = this()
    def this(vertices: IArrayBuffer, uvs: IArrayBuffer) = this()
    def this(vertices: Unit, uvs: Unit, index: IArrayBuffer) = this()
    def this(vertices: Unit, uvs: IArrayBuffer, index: IArrayBuffer) = this()
    def this(vertices: IArrayBuffer, uvs: Unit, index: IArrayBuffer) = this()
    def this(vertices: IArrayBuffer, uvs: IArrayBuffer, index: IArrayBuffer) = this()
  }
  
  @JSImport("@pixi/mesh", "MeshMaterial")
  @js.native
  open class MeshMaterial protected ()
    extends typings.pixiMesh.libMeshMaterialMod.MeshMaterial {
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
  }
}
