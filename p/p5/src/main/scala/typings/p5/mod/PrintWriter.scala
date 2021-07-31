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
  def print(data: js.Array[js.Any]): Unit
  
  /**
    *   Writes data to the PrintWriter stream
    *   @param data all data to be written by the
    *   PrintWriter
    */
  def write(data: js.Array[js.Any]): Unit
}
object PrintWriter {
  
  @scala.inline
  def apply(
    clear: () => Unit,
    close: () => Unit,
    print: js.Array[js.Any] => Unit,
    write: js.Array[js.Any] => Unit
  ): PrintWriter = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), close = js.Any.fromFunction0(close), print = js.Any.fromFunction1(print), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[PrintWriter]
  }
  
  @scala.inline
  implicit class PrintWriterMutableBuilder[Self <: PrintWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrint(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
