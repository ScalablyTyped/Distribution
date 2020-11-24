package typings.playcanvas.mod

import typings.playcanvas.anon.DataType
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns a new pc.VertexIteratorAccessor object.
  * @param buffer - The vertex buffer containing the attribute to be accessed.
  * @param vertexElement - The vertex attribute to be accessed.
  * @param vertexElement.name - The meaning of the vertex element. This is used to link
  the vertex data to a shader input. Can be:
  
  * {@link pc.SEMANTIC_POSITION}
  * {@link pc.SEMANTIC_NORMAL}
  * {@link pc.SEMANTIC_TANGENT}
  * {@link pc.SEMANTIC_BLENDWEIGHT}
  * {@link pc.SEMANTIC_BLENDINDICES}
  * {@link pc.SEMANTIC_COLOR}
  * {@link pc.SEMANTIC_TEXCOORD0}
  * {@link pc.SEMANTIC_TEXCOORD1}
  * {@link pc.SEMANTIC_TEXCOORD2}
  * {@link pc.SEMANTIC_TEXCOORD3}
  * {@link pc.SEMANTIC_TEXCOORD4}
  * {@link pc.SEMANTIC_TEXCOORD5}
  * {@link pc.SEMANTIC_TEXCOORD6}
  * {@link pc.SEMANTIC_TEXCOORD7}
  
  If vertex data has a meaning other that one of those listed above, use the user-defined
  semantics: pc.SEMANTIC_ATTR0 to pc.SEMANTIC_ATTR15.
  * @param vertexElement.numComponents - The number of components of the vertex attribute.
  Can be 1, 2, 3 or 4.
  * @param vertexElement.dataType - The data type of the attribute. Can be:
  
  * {@link pc.TYPE_INT8}
  * {@link pc.TYPE_UINT8}
  * {@link pc.TYPE_INT16}
  * {@link pc.TYPE_UINT16}
  * {@link pc.TYPE_INT32}
  * {@link pc.TYPE_UINT32}
  * {@link pc.TYPE_FLOAT32}
  * @param vertexElement.normalize - If true, vertex attribute data will be mapped from a
  0 to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data is left
  unchanged. If this property is unspecified, false is assumed.
  * @param vertexElement.offset - The number of initial bytes at the start of a vertex that are not relevant to this attribute.
  * @param vertexElement.stride - The number of total bytes that are between the start of one vertex, and the start of the next.
  * @param vertexElement.scopeId - The shader input variable corresponding to the attribute.
  * @param vertexElement.size - The size of the attribute in bytes.
  * @param vertexFormat - A vertex format that defines the layout of vertex data inside the buffer.
  */
@JSImport("playcanvas", "VertexIteratorAccessor")
@js.native
class VertexIteratorAccessor protected ()
  extends typings.playcanvas.pc.VertexIteratorAccessor {
  def this(buffer: ArrayBuffer, vertexElement: DataType, vertexFormat: typings.playcanvas.pc.VertexFormat) = this()
}
