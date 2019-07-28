package typings.nodegit.hashDashSigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/hash-sig", "Hashsig")
@js.native
class Hashsig () extends js.Object {
  def compare(b: Hashsig): Double = js.native
  def free(): Unit = js.native
}

/* static members */
@JSImport("nodegit/hash-sig", "Hashsig")
@js.native
object Hashsig extends js.Object {
  def create(buf: String, buflen: Double, opts: Double): js.Promise[Hashsig] = js.native
  def createFromFile(path: String, opts: Double): js.Promise[Hashsig] = js.native
}

