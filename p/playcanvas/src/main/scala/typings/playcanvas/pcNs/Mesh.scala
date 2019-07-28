package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.Mesh
  * @class A graphical primitive. The mesh is defined by a {@link pc.VertexBuffer} and an optional
  * {@link pc.IndexBuffer}. It also contains a primitive definition which controls the type of the
  * primitive and the portion of the vertex or index buffer to use.
  * @description Create a new mesh.
  * @property {pc.VertexBuffer} vertexBuffer The vertex buffer holding the vertex data of the mesh.
  * @property {pc.IndexBuffer[]} indexBuffer An array of index buffers. For unindexed meshes, this array can
  * be empty. The first index buffer in the array is used by {@link pc.MeshInstance}s with a renderStyle
  * property set to pc.RENDERSTYLE_SOLID. The second index buffer in the array is used if renderStyle is
  * set to pc.RENDERSTYLE_WIREFRAME.
  * @property {Object[]} primitive Array of primitive objects defining how vertex (and index) data in the
  * mesh should be interpreted by the graphics device. For details on the primitive object, see
  * {@link pc.GraphicsDevice#draw}. The primitive is ordered based on render style like the indexBuffer property.
  * @property {pc.BoundingBox} aabb The axis-aligned bounding box for the object space vertices of this mesh.
  */
@JSGlobal("pc.Mesh")
@js.native
class Mesh () extends js.Object {
  var aabb: BoundingBox = js.native
  var indexBuffer: IndexBuffer = js.native
  var morph: Morph = js.native
  var primitive: js.Array[MeshPrimitive] = js.native
  var skin: Skin = js.native
  var vertexBuffer: VertexBuffer = js.native
}

