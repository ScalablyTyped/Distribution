package typings.pixiMeshExtras

import typings.pixiConstants.mod.DRAW_MODES
import typings.pixiCore.libGeometryBufferMod.IArrayBuffer
import typings.pixiCore.libGeometryBufferMod.ITypedArray
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMesh.libMeshMaterialMod.MeshMaterial
import typings.pixiMesh.mod.Mesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleMeshMod {
  
  @JSImport("@pixi/mesh-extras/lib/SimpleMesh", "SimpleMesh")
  @js.native
  /**
    * @param texture - The texture to use
    * @param {Float32Array} [vertices] - if you want to specify the vertices
    * @param {Float32Array} [uvs] - if you want to specify the uvs
    * @param {Uint16Array} [indices] - if you want to specify the indices
    * @param drawMode - the drawMode, can be any of the Mesh.DRAW_MODES consts
    */
  open class SimpleMesh () extends Mesh[MeshMaterial] {
    def this(texture: Texture[Resource]) = this()
    def this(texture: Unit, vertices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: Unit, indices: IArrayBuffer) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: IArrayBuffer, indices: IArrayBuffer) = this()
    def this(texture: Unit, vertices: Unit, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: Unit, uvs: Unit, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: Unit, uvs: IArrayBuffer, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: Unit, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Unit, vertices: IArrayBuffer, uvs: IArrayBuffer, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(
      texture: Unit,
      vertices: IArrayBuffer,
      uvs: IArrayBuffer,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: Unit, indices: IArrayBuffer, drawMode: DRAW_MODES) = this()
    def this(texture: Texture[Resource], vertices: Unit, uvs: IArrayBuffer, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(
      texture: Texture[Resource],
      vertices: Unit,
      uvs: IArrayBuffer,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
    def this(texture: Texture[Resource], vertices: IArrayBuffer, uvs: Unit, indices: Unit, drawMode: DRAW_MODES) = this()
    def this(
      texture: Texture[Resource],
      vertices: IArrayBuffer,
      uvs: Unit,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
    def this(
      texture: Texture[Resource],
      vertices: IArrayBuffer,
      uvs: IArrayBuffer,
      indices: Unit,
      drawMode: DRAW_MODES
    ) = this()
    def this(
      texture: Texture[Resource],
      vertices: IArrayBuffer,
      uvs: IArrayBuffer,
      indices: IArrayBuffer,
      drawMode: DRAW_MODES
    ) = this()
    
    /** Upload vertices buffer each frame. */
    var autoUpdate: Boolean = js.native
    
    /**
      * Collection of vertices data.
      * @type {Float32Array}
      */
    def vertices: ITypedArray = js.native
    def vertices_=(value: ITypedArray): Unit = js.native
  }
}
