package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Signature")
@js.native
class Signature ()
  extends nodegitLib.signatureMod.Signature

@JSImport("nodegit", "Signature")
@js.native
object Signature extends js.Object {
  def create(name: java.lang.String, email: java.lang.String, time: scala.Double, offset: scala.Double): nodegitLib.signatureMod.Signature = js.native
  def default(repo: nodegitLib.repositoryMod.Repository): nodegitLib.signatureMod.Signature = js.native
  def fromBuffer(buf: java.lang.String): js.Promise[nodegitLib.signatureMod.Signature] = js.native
  def now(name: java.lang.String, email: java.lang.String): nodegitLib.signatureMod.Signature = js.native
}

