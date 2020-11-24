package typings.playcanvas.pc

import typings.playcanvas.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns a new pc.VertexFormat object.
  * @example
  * // Specify 3-component positions (x, y, z)
  * var vertexFormat = new pc.VertexFormat(graphicsDevice, [
  *     { semantic: pc.SEMANTIC_POSITION, components: 3, type: pc.TYPE_FLOAT32 }
  * ]);
  * @example
  * // Specify 2-component positions (x, y), a texture coordinate (u, v) and a vertex color (r, g, b, a)
  * var vertexFormat = new pc.VertexFormat(graphicsDevice, [
  *     { semantic: pc.SEMANTIC_POSITION, components: 2, type: pc.TYPE_FLOAT32 },
  *     { semantic: pc.SEMANTIC_TEXCOORD0, components: 2, type: pc.TYPE_FLOAT32 },
  *     { semantic: pc.SEMANTIC_COLOR, components: 4, type: pc.TYPE_UINT8, normalize: true }
  * ]);
  * @property elements - The vertex attribute elements.
  * @property elements[].name - The meaning of the vertex element. This is used to link
  * the vertex data to a shader input. Can be:
  *
  * * {@link pc.SEMANTIC_POSITION}
  * * {@link pc.SEMANTIC_NORMAL}
  * * {@link pc.SEMANTIC_TANGENT}
  * * {@link pc.SEMANTIC_BLENDWEIGHT}
  * * {@link pc.SEMANTIC_BLENDINDICES}
  * * {@link pc.SEMANTIC_COLOR}
  * * {@link pc.SEMANTIC_TEXCOORD0}
  * * {@link pc.SEMANTIC_TEXCOORD1}
  * * {@link pc.SEMANTIC_TEXCOORD2}
  * * {@link pc.SEMANTIC_TEXCOORD3}
  * * {@link pc.SEMANTIC_TEXCOORD4}
  * * {@link pc.SEMANTIC_TEXCOORD5}
  * * {@link pc.SEMANTIC_TEXCOORD6}
  * * {@link pc.SEMANTIC_TEXCOORD7}
  *
  * If vertex data has a meaning other that one of those listed above, use the user-defined
  * semantics: pc.SEMANTIC_ATTR0 to pc.SEMANTIC_ATTR15.
  * @property elements[].numComponents - The number of components of the vertex attribute.
  * Can be 1, 2, 3 or 4.
  * @property elements[].dataType - The data type of the attribute. Can be:
  *
  * * {@link pc.TYPE_INT8}
  * * {@link pc.TYPE_UINT8}
  * * {@link pc.TYPE_INT16}
  * * {@link pc.TYPE_UINT16}
  * * {@link pc.TYPE_INT32}
  * * {@link pc.TYPE_UINT32}
  * * {@link pc.TYPE_FLOAT32}
  * @property elements[].normalize - If true, vertex attribute data will be mapped from a
  * 0 to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data is left
  * unchanged. If this property is unspecified, false is assumed.
  * @property elements[].offset - The number of initial bytes at the start of a vertex that are not relevant to this attribute.
  * @property elements[].stride - The number of total bytes that are between the start of one vertex, and the start of the next.
  * @property elements[].size - The size of the attribute in bytes.
  * @param graphicsDevice - The graphics device used to manage this vertex format.
  * @param description - An array of vertex attribute descriptions.
  * @param description[].semantic - The meaning of the vertex element. This is used to link
  * the vertex data to a shader input. Can be:
  *
  * * {@link pc.SEMANTIC_POSITION}
  * * {@link pc.SEMANTIC_NORMAL}
  * * {@link pc.SEMANTIC_TANGENT}
  * * {@link pc.SEMANTIC_BLENDWEIGHT}
  * * {@link pc.SEMANTIC_BLENDINDICES}
  * * {@link pc.SEMANTIC_COLOR}
  * * {@link pc.SEMANTIC_TEXCOORD0}
  * * {@link pc.SEMANTIC_TEXCOORD1}
  * * {@link pc.SEMANTIC_TEXCOORD2}
  * * {@link pc.SEMANTIC_TEXCOORD3}
  * * {@link pc.SEMANTIC_TEXCOORD4}
  * * {@link pc.SEMANTIC_TEXCOORD5}
  * * {@link pc.SEMANTIC_TEXCOORD6}
  * * {@link pc.SEMANTIC_TEXCOORD7}
  *
  * If vertex data has a meaning other that one of those listed above, use the user-defined
  * semantics: pc.SEMANTIC_ATTR0 to pc.SEMANTIC_ATTR15.
  * @param description[].components - The number of components of the vertex attribute.
  * Can be 1, 2, 3 or 4.
  * @param description[].type - The data type of the attribute. Can be:
  *
  * * {@link pc.TYPE_INT8}
  * * {@link pc.TYPE_UINT8}
  * * {@link pc.TYPE_INT16}
  * * {@link pc.TYPE_UINT16}
  * * {@link pc.TYPE_INT32}
  * * {@link pc.TYPE_UINT32}
  * * {@link pc.TYPE_FLOAT32}
  * @param [description[].normalize] - If true, vertex attribute data will be mapped from a
  * 0 to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data is left
  * unchanged. If this property is unspecified, false is assumed.
  * @param [vertexCount] - When specified, vertex format will be set up for non-interleaved format with a specified
  * number of vertices. (example: PPPPNNNNCCCC), where arrays of individual attributes will be stored one right after the other (subject to alignment requirements).
  * Note that in this case, the format depends on the number of vertices, and needs to change when the number of vertices changes.
  * When not specified, vertex format will be interleaved. (example: PNCPNCPNCPNC)
  */
@js.native
trait VertexFormat extends js.Object {
  
  /**
    * The vertex attribute elements.
    */
  var elements: js.Array[Name] = js.native
  
  /**
    * Applies any changes made to the VertexFormat's properties.
    */
  def update(): Unit = js.native
}
object VertexFormat {
  
  @scala.inline
  def apply(elements: js.Array[Name], update: () => Unit): VertexFormat = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[VertexFormat]
  }
  
  @scala.inline
  implicit class VertexFormatOps[Self <: VertexFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementsVarargs(value: Name*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[Name]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
