package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Mesh
  * @classdesc A graphical primitive. The mesh is defined by a {@link pc.VertexBuffer} and an optional
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
  * @property {Number} primitive[].type The type of primitive to render. Can be:
  * <ul>
  *     <li>{@link pc.PRIMITIVE_POINTS}</li>
  *     <li>{@link pc.PRIMITIVE_LINES}</li>
  *     <li>{@link pc.PRIMITIVE_LINELOOP}</li>
  *     <li>{@link pc.PRIMITIVE_LINESTRIP}</li>
  *     <li>{@link pc.PRIMITIVE_TRIANGLES}</li>
  *     <li>{@link pc.PRIMITIVE_TRISTRIP}</li>
  *     <li>{@link pc.PRIMITIVE_TRIFAN}</li>
  * </ul>
  * @property {Number} primitive[].base The offset of the first index or vertex to dispatch in the draw call.
  * @property {Number} primitive[].count The number of indices or vertices to dispatch in the draw call.
  * @property {Boolean} [primitive[].indexed] True to interpret the primitive as indexed, thereby using the currently set index buffer and false otherwise.
  * {@link pc.GraphicsDevice#draw}. The primitive is ordered based on render style like the indexBuffer property.
  * @property {pc.BoundingBox} aabb The axis-aligned bounding box for the object space vertices of this mesh.
  */
@JSImport("playcanvas", "Mesh")
@js.native
class Mesh ()
  extends typings.playcanvas.pc.Mesh

