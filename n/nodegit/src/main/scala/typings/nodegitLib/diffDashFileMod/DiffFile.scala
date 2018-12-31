package typings
package nodegitLib.diffDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff-file", "DiffFile")
@js.native
class DiffFile () extends js.Object {
  /**
    * Returns the file's flags
    */
  def flags(): scala.Double = js.native
  /**
    * Returns the file's Oid
    */
  def id(): nodegitLib.oidMod.Oid = js.native
  /**
    * Returns the file's mode
    */
  def mode(): scala.Double = js.native
  /**
    * Returns the file's path
    */
  def path(): java.lang.String = js.native
  /**
    * Returns the file's size
    */
  def size(): scala.Double = js.native
}

