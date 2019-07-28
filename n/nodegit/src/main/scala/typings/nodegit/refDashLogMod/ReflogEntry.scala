package typings.nodegit.refDashLogMod

import typings.nodegit.oidMod.Oid
import typings.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/ref-log", "ReflogEntry")
@js.native
class ReflogEntry () extends js.Object {
  def committer(): Signature = js.native
  def idNew(): Oid = js.native
  def idOld(): Oid = js.native
  def message(): String = js.native
}

