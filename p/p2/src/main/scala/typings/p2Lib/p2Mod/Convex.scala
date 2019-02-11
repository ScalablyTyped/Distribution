package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Convex")
@js.native
class Convex ()
  extends p2Lib.p2Mod.p2Ns.Convex {
  def this(options: p2Lib.p2Mod.p2Ns.ConvexOptions) = this()
}

/* static members */
@JSImport("p2", "Convex")
@js.native
object Convex extends js.Object {
  def triangleArea(a: js.Array[scala.Double], b: js.Array[scala.Double], c: js.Array[scala.Double]): scala.Double = js.native
}

