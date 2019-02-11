package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "World")
@js.native
//static integrateBody(body: Body, dy: number): void;
class World ()
  extends p2Lib.p2Mod.p2Ns.World {
  def this(options: p2Lib.p2Mod.p2Ns.WorldOptions) = this()
}

/* static members */
@JSImport("p2", "World")
@js.native
object World extends js.Object {
  var BODY_SLEEPING: scala.Double = js.native
  var ISLAND_SLEEPING: scala.Double = js.native
  var NO_SLEEPING: scala.Double = js.native
}

