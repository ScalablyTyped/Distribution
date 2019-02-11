package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Solver")
@js.native
class Solver ()
  extends p2Lib.p2Mod.p2Ns.Solver {
  def this(options: js.Object) = this()
  def this(options: js.Object, `type`: scala.Double) = this()
}

/* static members */
@JSImport("p2", "Solver")
@js.native
object Solver extends js.Object {
  var GS: scala.Double = js.native
  var ISLAND: scala.Double = js.native
}

