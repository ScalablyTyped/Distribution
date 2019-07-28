package typings.p5.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintWriter extends js.Object {
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
  def print(data: js.Array[_]): Unit
  /**
    *   Writes data to the PrintWriter stream
    *   @param data all data to be written by the
    *   PrintWriter
    */
  def write(data: js.Array[_]): Unit
}

object PrintWriter {
  @scala.inline
  def apply(clear: () => Unit, close: () => Unit, print: js.Array[_] => Unit, write: js.Array[_] => Unit): PrintWriter = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), close = js.Any.fromFunction0(close), print = js.Any.fromFunction1(print), write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[PrintWriter]
  }
}

