package typings.playcanvas.mod

import typings.playcanvas.anon.Components
import typings.playcanvas.anon.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vertex format is a descriptor that defines the layout of vertex data inside a
  * {@link VertexBuffer}.
  *
  * @property {object[]} elements The vertex attribute elements.
  * @property {string} elements[].name The meaning of the vertex element. This is used to link the
  * vertex data to a shader input. Can be:
  *
  * - {@link SEMANTIC_POSITION}
  * - {@link SEMANTIC_NORMAL}
  * - {@link SEMANTIC_TANGENT}
  * - {@link SEMANTIC_BLENDWEIGHT}
  * - {@link SEMANTIC_BLENDINDICES}
  * - {@link SEMANTIC_COLOR}
  * - {@link SEMANTIC_TEXCOORD0}
  * - {@link SEMANTIC_TEXCOORD1}
  * - {@link SEMANTIC_TEXCOORD2}
  * - {@link SEMANTIC_TEXCOORD3}
  * - {@link SEMANTIC_TEXCOORD4}
  * - {@link SEMANTIC_TEXCOORD5}
  * - {@link SEMANTIC_TEXCOORD6}
  * - {@link SEMANTIC_TEXCOORD7}
  *
  * If vertex data has a meaning other that one of those listed above, use the user-defined
  * semantics: {@link SEMANTIC_ATTR0} to {@link SEMANTIC_ATTR15}.
  * @property {number} elements[].numComponents The number of components of the vertex attribute.
  * Can be 1, 2, 3 or 4.
  * @property {number} elements[].dataType The data type of the attribute. Can be:
  *
  * - {@link TYPE_INT8}
  * - {@link TYPE_UINT8}
  * - {@link TYPE_INT16}
  * - {@link TYPE_UINT16}
  * - {@link TYPE_INT32}
  * - {@link TYPE_UINT32}
  * - {@link TYPE_FLOAT32}
  * @property {boolean} elements[].normalize If true, vertex attribute data will be mapped from a 0
  * to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data is left
  * unchanged. If this property is unspecified, false is assumed.
  * @property {number} elements[].offset The number of initial bytes at the start of a vertex that
  * are not relevant to this attribute.
  * @property {number} elements[].stride The number of total bytes that are between the start of one
  * vertex, and the start of the next.
  * @property {number} elements[].size The size of the attribute in bytes.
  */
@JSImport("playcanvas", "VertexFormat")
@js.native
open class VertexFormat protected () extends StObject {
  /**
    * Create a new VertexFormat instance.
    *
    * @param {import('./graphics-device.js').GraphicsDevice} graphicsDevice - The graphics device
    * used to manage this vertex format.
    * @param {object[]} description - An array of vertex attribute descriptions.
    * @param {string} description[].semantic - The meaning of the vertex element. This is used to
    * link the vertex data to a shader input. Can be:
    *
    * - {@link SEMANTIC_POSITION}
    * - {@link SEMANTIC_NORMAL}
    * - {@link SEMANTIC_TANGENT}
    * - {@link SEMANTIC_BLENDWEIGHT}
    * - {@link SEMANTIC_BLENDINDICES}
    * - {@link SEMANTIC_COLOR}
    * - {@link SEMANTIC_TEXCOORD0}
    * - {@link SEMANTIC_TEXCOORD1}
    * - {@link SEMANTIC_TEXCOORD2}
    * - {@link SEMANTIC_TEXCOORD3}
    * - {@link SEMANTIC_TEXCOORD4}
    * - {@link SEMANTIC_TEXCOORD5}
    * - {@link SEMANTIC_TEXCOORD6}
    * - {@link SEMANTIC_TEXCOORD7}
    *
    * If vertex data has a meaning other that one of those listed above, use the user-defined
    * semantics: {@link SEMANTIC_ATTR0} to {@link SEMANTIC_ATTR15}.
    * @param {number} description[].components - The number of components of the vertex attribute.
    * Can be 1, 2, 3 or 4.
    * @param {number} description[].type - The data type of the attribute. Can be:
    *
    * - {@link TYPE_INT8}
    * - {@link TYPE_UINT8}
    * - {@link TYPE_INT16}
    * - {@link TYPE_UINT16}
    * - {@link TYPE_INT32}
    * - {@link TYPE_UINT32}
    * - {@link TYPE_FLOAT32}
    *
    * @param {boolean} [description[].normalize] - If true, vertex attribute data will be mapped
    * from a 0 to 255 range down to 0 to 1 when fed to a shader. If false, vertex attribute data
    * is left unchanged. If this property is unspecified, false is assumed.
    * @param {number} [vertexCount] - When specified, vertex format will be set up for
    * non-interleaved format with a specified number of vertices. (example: PPPPNNNNCCCC), where
    * arrays of individual attributes will be stored one right after the other (subject to
    * alignment requirements). Note that in this case, the format depends on the number of
    * vertices, and needs to change when the number of vertices changes. When not specified,
    * vertex format will be interleaved. (example: PNCPNCPNCPNC).
    * @example
    * // Specify 3-component positions (x, y, z)
    * const vertexFormat = new pc.VertexFormat(graphicsDevice, [
    *     { semantic: pc.SEMANTIC_POSITION, components: 3, type: pc.TYPE_FLOAT32 }
    * ]);
    * @example
    * // Specify 2-component positions (x, y), a texture coordinate (u, v) and a vertex color (r, g, b, a)
    * const vertexFormat = new pc.VertexFormat(graphicsDevice, [
    *     { semantic: pc.SEMANTIC_POSITION, components: 2, type: pc.TYPE_FLOAT32 },
    *     { semantic: pc.SEMANTIC_TEXCOORD0, components: 2, type: pc.TYPE_FLOAT32 },
    *     { semantic: pc.SEMANTIC_COLOR, components: 4, type: pc.TYPE_UINT8, normalize: true }
    * ]);
    */
  def this(graphicsDevice: GraphicsDevice, description: js.Array[Components]) = this()
  def this(graphicsDevice: GraphicsDevice, description: js.Array[Components], vertexCount: Double) = this()
  
  var _elements: js.Array[DataType] = js.native
  
  /**
    * Evaluates hash values for the format allowing fast compare of batching / rendering compatibility.
    *
    * @private
    */
  /* private */ var _evaluateHash: Any = js.native
  
  var batchingHash: Double = js.native
  
  var device: GraphicsDevice = js.native
  
  def elements: js.Array[DataType] = js.native
  
  var hasColor: Boolean = js.native
  
  var hasTangents: Boolean = js.native
  
  var hasUv0: Boolean = js.native
  
  var hasUv1: Boolean = js.native
  
  var instancing: Boolean = js.native
  
  var interleaved: Boolean = js.native
  
  var renderingHash: Double = js.native
  
  var renderingHashString: String = js.native
  
  var size: Double = js.native
  
  /**
    * Applies any changes made to the VertexFormat's properties.
    *
    * @private
    */
  /* private */ var update: Any = js.native
  
  var vertexCount: Double = js.native
  
  var verticesByteSize: Double = js.native
}
object VertexFormat {
  
  @JSImport("playcanvas", "VertexFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @type {VertexFormat}
    * @private
    */
  /* static member */
  @JSImport("playcanvas", "VertexFormat._defaultInstancingFormat")
  @js.native
  def defaultInstancingFormat: Any = js.native
  
  inline def defaultInstancingFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaultInstancingFormat")(x.asInstanceOf[js.Any])
  
  /**
    * The {@link VertexFormat} used to store matrices of type {@link Mat4} for hardware instancing.
    *
    * @param {import('./graphics-device.js').GraphicsDevice} graphicsDevice - The graphics device
    * used to create this vertex format.
    *
    * @returns {VertexFormat} The default instancing vertex format.
    */
  /* static member */
  inline def getDefaultInstancingFormat(graphicsDevice: GraphicsDevice): VertexFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultInstancingFormat")(graphicsDevice.asInstanceOf[js.Any]).asInstanceOf[VertexFormat]
}
