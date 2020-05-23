package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new mesh.
  * @property vertexBuffer - The vertex buffer holding the vertex data of the mesh.
  * @property indexBuffer - An array of index buffers. For unindexed meshes, this array can
  be empty. The first index buffer in the array is used by {@link pc.MeshInstance}s with a renderStyle
  property set to pc.RENDERSTYLE_SOLID. The second index buffer in the array is used if renderStyle is
  set to pc.RENDERSTYLE_WIREFRAME.
  * @property primitive - Array of primitive objects defining how vertex (and index) data in the
  mesh should be interpreted by the graphics device. For details on the primitive object, see.
  * @property primitive[].type - The type of primitive to render. Can be:
  
  * {@link pc.PRIMITIVE_POINTS}
  * {@link pc.PRIMITIVE_LINES}
  * {@link pc.PRIMITIVE_LINELOOP}
  * {@link pc.PRIMITIVE_LINESTRIP}
  * {@link pc.PRIMITIVE_TRIANGLES}
  * {@link pc.PRIMITIVE_TRISTRIP}
  * {@link pc.PRIMITIVE_TRIFAN}
  * @property primitive[].base - The offset of the first index or vertex to dispatch in the draw call.
  * @property primitive[].count - The number of indices or vertices to dispatch in the draw call.
  * @property [primitive[].indexed] - True to interpret the primitive as indexed, thereby using the currently set index buffer and false otherwise.
  {@link pc.GraphicsDevice#draw}. The primitive is ordered based on render style like the indexBuffer property.
  * @property aabb - The axis-aligned bounding box for the object space vertices of this mesh.
  * @property [skin] - The skin data (if any) that drives skinned mesh animations for this mesh.
  * @property [morph] - The morph data (if any) that drives morph target animations for this mesh.
  * @param [graphicsDevice] - The graphics device used to manage this mesh. If it is not provided, a device is obtained
  from the {@link pc.Application}.
  */
@JSGlobal("pc.Mesh")
@js.native
class Mesh ()
  extends typings.playcanvas.pc.Mesh {
  def this(graphicsDevice: typings.playcanvas.pc.GraphicsDevice) = this()
}

