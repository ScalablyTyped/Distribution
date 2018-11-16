package typings
package nodegitLib.statusDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/status-file", "StatusFile")
@js.native
class StatusFile protected () extends js.Object {
  def this(args: nodegitLib.statusDashFileDashOptionsMod.StatusFileOptions) = this()
  def headToIndex(): nodegitLib.diffDashDeltaMod.DiffDelta = js.native
  def inIndex(): scala.Boolean = js.native
  def inWorkingTree(): scala.Boolean = js.native
  def indexToWorkdir(): nodegitLib.diffDashDeltaMod.DiffDelta = js.native
  def isConflicted(): scala.Boolean = js.native
  def isDeleted(): scala.Boolean = js.native
  def isIgnored(): scala.Boolean = js.native
  def isModified(): scala.Boolean = js.native
  def isNew(): scala.Boolean = js.native
  def isRenamed(): scala.Boolean = js.native
  def isTypechange(): scala.Boolean = js.native
  def path(): java.lang.String = js.native
  def status(): js.Array[java.lang.String] = js.native
  def statusBit(): scala.Double = js.native
}

