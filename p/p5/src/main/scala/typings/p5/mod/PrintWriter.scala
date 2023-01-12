package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintWriter extends StObject {
  
  /**
    *   Clears the data already written to the PrintWriter
    *   object
    */
  def clear(): Unit
  
  /**
    *   Closes the PrintWriter
    */
  def close(): Unit
  
  /**
    *   Writes data to the PrintWriter stream, and adds a
    *   new line at the end
    *   @param data all data to be printed by the
    *   PrintWriter
    */
  def print(data: js.Array[Any]): Unit
  
  /**
    *   Writes data to the PrintWriter stream
    *   @param data all data to be written by the
    *   PrintWriter
    */
  def write(data: js.Array[Any]): Unit
}
object PrintWriter {
  
  inline def apply(clear: () => Unit, close: () => Unit, print: js.Array[Any] => Unit, write: js.Array[Any] => Unit): PrintWriter = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), close = js.Any.fromFunction0(close), print = js.Any.fromFunction1(print), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[PrintWriter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintWriter] (val x: Self) extends AnyVal {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setPrint(value: js.Array[Any] => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
    
    inline def setWrite(value: js.Array[Any] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
