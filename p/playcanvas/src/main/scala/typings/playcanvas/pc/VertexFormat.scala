package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.VertexFormat
  * @classdesc A vertex format is a descriptor that defines the layout of vertex data inside
  * a {@link pc.VertexBuffer}.
  * @description Returns a new pc.VertexFormat object.
  * @param {pc.GraphicsDevice} graphicsDevice - The graphics device used to manage this vertex format.
  * @param {object[]} description - An array of vertex attribute descriptions.
  * @param {string} description[].semantic - The meaning of the vertex element. This is used to link
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
  * @param {number} description[].components - The number of components of the vertex attribute.
  * Can be 1, 2, 3 or 4.
  * @param {number} description[].type - The data type of the attribute. Can be:
  *
  * * {@link pc.TYPE_INT8}
  * * {@link pc.TYPE_UINT8}
  * * {@link pc.TYPE_INT16}
  * * {@link pc.TYPE_UINT16}
  * * {@link pc.TYPE_INT32}
  * * {@link pc.TYPE_UINT32}
  * * {@link pc.TYPE_FLOAT32}
  *
  * @param {boolean} [description[].normalize] - If true, vertex attribute data will be mapped from a
  * 0 to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data is left
  * unchanged. If this property is unspecified, false is assumed.
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
  */
@JSGlobal("pc.VertexFormat")
@js.native
class VertexFormat protected () extends js.Object {
  def this(graphicsDevice: GraphicsDevice, description: js.Array[js.Object]) = this()
}

