package typings.nodegit.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Hashsig")
@js.native
class Hashsig ()
  extends typings.nodegit.hashDashSigMod.Hashsig

/* static members */
@JSImport("nodegit", "Hashsig")
@js.native
object Hashsig extends js.Object {
  def create(buf: String, buflen: Double, opts: Double): js.Promise[typings.nodegit.hashDashSigMod.Hashsig] = js.native
  def createFromFile(path: String, opts: Double): js.Promise[typings.nodegit.hashDashSigMod.Hashsig] = js.native
}

