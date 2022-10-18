package typings.playcanvas.mod

import typings.playcanvas.anon.DataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./graphics-device.js').GraphicsDevice} GraphicsDevice */
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
@js.native
trait VertexFormat extends StObject {
  
  var _elements: js.Array[DataType] = js.native
  
  /**
    * Evaluates hash values for the format allowing fast compare of batching / rendering compatibility.
    *
    * @private
    */
  /* private */ var _evaluateHash: Any = js.native
  
  var batchingHash: Double = js.native
  
  def elements: js.Array[DataType] = js.native
  
  var hasColor: Boolean = js.native
  
  var hasTangents: Boolean = js.native
  
  var hasUv0: Boolean = js.native
  
  var hasUv1: Boolean = js.native
  
  var interleaved: Boolean = js.native
  
  var renderingingHash: Double = js.native
  
  var renderingingHashString: String = js.native
  
  var size: Double = js.native
  
  var vertexCount: Double = js.native
  
  var verticesByteSize: Double = js.native
}
