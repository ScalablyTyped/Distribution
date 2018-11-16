package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @name pc.VertexIterator
     * @class A vertex iterator simplifies the process of writing vertex data to a vertex buffer.
     * @description Returns a new pc.VertexIterator object.
     * @param {pc.VertexBuffer} vertexBuffer The vertex buffer to be iterated.
     * @author Will Eastcott
     */
@JSGlobal("pc.VertexIterator")
@js.native
class VertexIterator protected () extends js.Object {
  def this(vertexBuffer: VertexBuffer) = this()
  var element: js.Any = js.native
  /**
           * @function
           * @name pc.VertexIterator#end
           * @description Notifies the vertex buffer being iterated that writes are complete. Internally
           * the vertex buffer is unlocked and vertex data is uploaded to video memory.
           * @example
           * var iterator = new pc.VertexIterator(vertexBuffer);
           * iterator.element[pc.SEMANTIC_POSTIION].set(-0.9, -0.9, 0.0);
           * iterator.element[pc.SEMANTIC_COLOR].set(255, 0, 0, 255);
           * iterator.next();
           * iterator.element[pc.SEMANTIC_POSTIION].set(0.9, -0.9, 0.0);
           * iterator.element[pc.SEMANTIC_COLOR].set(0, 255, 0, 255);
           * iterator.next();
           * iterator.element[pc.SEMANTIC_POSTIION].set(0.0, 0.9, 0.0);
           * iterator.element[pc.SEMANTIC_COLOR].set(0, 0, 255, 255);
           * iterator.end();
           */
  def end(): scala.Unit = js.native
  /**
           * @function
           * @name pc.VertexIterator#next
           * @description Moves the vertex iterator on to the next vertex.
           * @example
           * var iterator = new pc.VertexIterator(vertexBuffer);
           * iterator.element[pc.SEMANTIC_POSTIION].set(-0.9, -0.9, 0.0);
           * iterator.element[pc.SEMANTIC_COLOR].set(255, 0, 0, 255);
           * iterator.next();
           * iterator.element[pc.SEMANTIC_POSTIION].set(0.9, -0.9, 0.0);
           * iterator.element[pc.SEMANTIC_COLOR].set(0, 255, 0, 255);
           * iterator.next();
           * iterator.element[pc.SEMANTIC_POSTIION].set(0.0, 0.9, 0.0);
           * iterator.element[pc.SEMANTIC_COLOR].set(0, 0, 255, 255);
           * iterator.end();
           */
  def next(): scala.Unit = js.native
}

