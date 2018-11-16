package typings
package p5Lib.p5Mod.p5Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PrintWriter extends js.Object {
  /**
       *   Clears the data already written to the PrintWriter
       *   object
       */
  def clear(): scala.Unit
  /**
       *   Closes the PrintWriter
       */
  def close(): scala.Unit
  /**
       *   Writes data to the PrintWriter stream, and adds a
       *   new line at the end
       *   @param data all data to be printed by the
       *   PrintWriter
       */
  def print(data: js.Array[_]): scala.Unit
  /**
       *   Writes data to the PrintWriter stream
       *   @param data all data to be written by the
       *   PrintWriter
       */
  def write(data: js.Array[_]): scala.Unit
}

