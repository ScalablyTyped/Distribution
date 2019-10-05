package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.VertexIterator
  * @classdesc A vertex iterator simplifies the process of writing vertex data to a vertex buffer.
  * @description Returns a new pc.VertexIterator object.
  * @param {pc.VertexBuffer} vertexBuffer The vertex buffer to be iterated.
  * @property {Object} element The vertex buffer elements
  */
@JSGlobal("pc.VertexIterator")
@js.native
class VertexIterator protected () extends js.Object {
  def this(vertexBuffer: VertexBuffer) = this()
  /**
    * The vertex buffer elements
    */
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
  def end(): Unit = js.native
  /**
    * @function
    * @name pc.VertexIterator#next
    * @description Moves the vertex iterator on to the next vertex.
    * @param {Number} [count] Optional number of steps to move on when calling next, defaults to 1.
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
  def next(): Unit = js.native
  def next(count: Double): Unit = js.native
}

