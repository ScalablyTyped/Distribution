package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ignore
  */
@js.native
trait WebgpuVertexBufferLayout extends StObject {
  
  /**
    * @type {Map<string, GPUVertexBufferLayout[]>}
    * @private
    */
  /* private */ var cache: Any = js.native
  
  /**
    * @param {import('../vertex-format.js').VertexFormat} vertexFormat0 - The first vertex format.
    * @param {import('../vertex-format.js').VertexFormat} vertexFormat1 - The second vertex format.
    * @returns {any[]} - The vertex buffer layout.
    */
  def create(vertexFormat0: VertexFormat, vertexFormat1: VertexFormat): js.Array[Any] = js.native
  
  /**
    * Obtain a vertex layout of one or two vertex formats.
    *
    * @param {import('../vertex-format.js').VertexFormat} vertexFormat0 - The first vertex format.
    * @param {import('../vertex-format.js').VertexFormat} [vertexFormat1] - The second vertex format.
    * @returns {any[]} - The vertex layout.
    */
  def get(vertexFormat0: VertexFormat): js.Array[Any] = js.native
  def get(vertexFormat0: VertexFormat, vertexFormat1: VertexFormat): js.Array[Any] = js.native
  
  def getKey(vertexFormat0: Any): String = js.native
  def getKey(vertexFormat0: Any, vertexFormat1: Any): String = js.native
}
