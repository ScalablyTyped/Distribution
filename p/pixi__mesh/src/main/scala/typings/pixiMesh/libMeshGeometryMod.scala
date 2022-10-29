package typings.pixiMesh

import typings.pixiCore.libGeometryBufferMod.IArrayBuffer
import typings.pixiCore.mod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMeshGeometryMod {
  
  @JSImport("@pixi/mesh/lib/MeshGeometry", "MeshGeometry")
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
}
