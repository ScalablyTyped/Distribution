package typings.playcanvas.pc

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Returns a new pc.VertexIterator object.
  * @property element - The vertex buffer elements.
  * @param vertexBuffer - The vertex buffer to be iterated.
  */
@js.native
trait VertexIterator extends StObject {
  
  /**
    * The vertex buffer elements.
    */
  var element: StringDictionary[VertexIteratorAccessor] = js.native
  
  /**
    * Notifies the vertex buffer being iterated that writes are complete. Internally
    the vertex buffer is unlocked and vertex data is uploaded to video memory.
    * @example
    * var iterator = new pc.VertexIterator(vertexBuffer);
    iterator.element[pc.SEMANTIC_POSTIION].set(-0.9, -0.9, 0.0);
    iterator.element[pc.SEMANTIC_COLOR].set(255, 0, 0, 255);
    iterator.next();
    iterator.element[pc.SEMANTIC_POSTIION].set(0.9, -0.9, 0.0);
    iterator.element[pc.SEMANTIC_COLOR].set(0, 255, 0, 255);
    iterator.next();
    iterator.element[pc.SEMANTIC_POSTIION].set(0.0, 0.9, 0.0);
    iterator.element[pc.SEMANTIC_COLOR].set(0, 0, 255, 255);
    iterator.end();
    */
  def end(): Unit = js.native
  
  /**
    * Moves the vertex iterator on to the next vertex.
    * @example
    * var iterator = new pc.VertexIterator(vertexBuffer);
    iterator.element[pc.SEMANTIC_POSTIION].set(-0.9, -0.9, 0.0);
    iterator.element[pc.SEMANTIC_COLOR].set(255, 0, 0, 255);
    iterator.next();
    iterator.element[pc.SEMANTIC_POSTIION].set(0.9, -0.9, 0.0);
    iterator.element[pc.SEMANTIC_COLOR].set(0, 255, 0, 255);
    iterator.next();
    iterator.element[pc.SEMANTIC_POSTIION].set(0.0, 0.9, 0.0);
    iterator.element[pc.SEMANTIC_COLOR].set(0, 0, 255, 255);
    iterator.end();
    * @param [count] - Optional number of steps to move on when calling next, defaults to 1.
    */
  def next(): Unit = js.native
  def next(count: Double): Unit = js.native
}
