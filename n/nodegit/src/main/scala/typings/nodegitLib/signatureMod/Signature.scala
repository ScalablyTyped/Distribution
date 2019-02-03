package typings
package nodegitLib.signatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/signature", "Signature")
@js.native
class Signature () extends js.Object {
  def dup(): js.Promise[Signature] = js.native
  def email(): java.lang.String = js.native
  def free(): scala.Unit = js.native
  def name(): java.lang.String = js.native
  def when(): nodegitLib.timeMod.Time = js.native
}

/* static members */
@JSImport("nodegit/signature", "Signature")
@js.native
object Signature extends js.Object {
  def create(name: java.lang.String, email: java.lang.String, time: scala.Double, offset: scala.Double): nodegitLib.signatureMod.Signature = js.native
  def default(repo: nodegitLib.repositoryMod.Repository): nodegitLib.signatureMod.Signature = js.native
  def fromBuffer(buf: java.lang.String): js.Promise[nodegitLib.signatureMod.Signature] = js.native
  def now(name: java.lang.String, email: java.lang.String): nodegitLib.signatureMod.Signature = js.native
}

