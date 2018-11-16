package typings
package nodegitLib.hashDashSigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/hash-sig", "Hashsig")
@js.native
class Hashsig () extends js.Object {
  def compare(b: Hashsig): scala.Double = js.native
  def free(): scala.Unit = js.native
}

@JSImport("nodegit/hash-sig", "Hashsig")
@js.native
object Hashsig extends js.Object {
  def create(buf: java.lang.String, buflen: scala.Double, opts: scala.Double): stdLib.Promise[nodegitLib.hashDashSigMod.Hashsig] = js.native
  def createFromFile(path: java.lang.String, opts: scala.Double): stdLib.Promise[nodegitLib.hashDashSigMod.Hashsig] = js.native
}

