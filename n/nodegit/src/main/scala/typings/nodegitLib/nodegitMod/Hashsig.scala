package typings
package nodegitLib.nodegitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Hashsig")
@js.native
class Hashsig ()
  extends nodegitLib.hashDashSigMod.Hashsig

/* static members */
@JSImport("nodegit", "Hashsig")
@js.native
object Hashsig extends js.Object {
  def create(buf: java.lang.String, buflen: scala.Double, opts: scala.Double): js.Promise[nodegitLib.hashDashSigMod.Hashsig] = js.native
  def createFromFile(path: java.lang.String, opts: scala.Double): js.Promise[nodegitLib.hashDashSigMod.Hashsig] = js.native
}

