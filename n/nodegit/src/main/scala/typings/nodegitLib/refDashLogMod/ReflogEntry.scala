package typings
package nodegitLib.refDashLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-log", "ReflogEntry")
@js.native
class ReflogEntry () extends js.Object {
  def committer(): nodegitLib.signatureMod.Signature = js.native
  def idNew(): nodegitLib.oidMod.Oid = js.native
  def idOld(): nodegitLib.oidMod.Oid = js.native
  def message(): java.lang.String = js.native
}

