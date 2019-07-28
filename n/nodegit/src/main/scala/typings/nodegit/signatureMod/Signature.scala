package typings.nodegit.signatureMod

import typings.nodegit.repositoryMod.Repository
import typings.nodegit.timeMod.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/signature", "Signature")
@js.native
class Signature () extends js.Object {
  def dup(): js.Promise[Signature] = js.native
  def email(): String = js.native
  def free(): Unit = js.native
  def name(): String = js.native
  def when(): Time = js.native
}

/* static members */
@JSImport("nodegit/signature", "Signature")
@js.native
object Signature extends js.Object {
  def create(name: String, email: String, time: Double, offset: Double): Signature = js.native
  def default(repo: Repository): Signature = js.native
  def fromBuffer(buf: String): js.Promise[Signature] = js.native
  def now(name: String, email: String): Signature = js.native
}

