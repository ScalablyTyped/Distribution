package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "PrintWriter")
@js.native
class PrintWriter ()
  extends p5Lib.p5Mod.p5Ns.PrintWriter {
  /**
    *   Clears the data already written to the PrintWriter
    *   object
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    *   Closes the PrintWriter
    */
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /**
    *   Writes data to the PrintWriter stream, and adds a
    *   new line at the end
    *   @param data all data to be printed by the
    *   PrintWriter
    */
  /* CompleteClass */
  override def print(data: js.Array[_]): scala.Unit = js.native
  /**
    *   Writes data to the PrintWriter stream
    *   @param data all data to be written by the
    *   PrintWriter
    */
  /* CompleteClass */
  override def write(data: js.Array[_]): scala.Unit = js.native
}

