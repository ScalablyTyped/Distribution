package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "World")
@js.native
class World ()
  extends p2Lib.p2Mod.p2Ns.World {
  def this(options: p2Lib.Anon_Broadphase) = this()
  /* CompleteClass */
  override def emit(event: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def has(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  /* CompleteClass */
  override def off(`type`: java.lang.String, listener: js.Function): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def on(`type`: java.lang.String, listener: js.Function, context: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
}

/* static members */
@JSImport("p2", "World")
@js.native
object World extends js.Object {
  var BODY_SLEEPING: scala.Double = js.native
  var ISLAND_SLEEPING: scala.Double = js.native
  var NO_SLEEPING: scala.Double = js.native
  def integrateBody(body: p2Lib.p2Mod.p2Ns.Body, dy: scala.Double): scala.Unit = js.native
}

