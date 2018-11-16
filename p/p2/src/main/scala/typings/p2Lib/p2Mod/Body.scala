package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "Body")
@js.native
class Body ()
  extends p2Lib.p2Mod.p2Ns.Body {
  def this(options: p2Lib.p2Mod.p2Ns.BodyOptions) = this()
  /* CompleteClass */
  override def emit(event: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def has(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  /* CompleteClass */
  override def off(`type`: java.lang.String, listener: js.Function): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def on(`type`: java.lang.String, listener: js.Function, context: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
}

@JSImport("p2", "Body")
@js.native
object Body extends js.Object {
  var AWAKE: scala.Double = js.native
  var DYNAMIC: scala.Double = js.native
  var KINEMATIC: scala.Double = js.native
  var SLEEPING: scala.Double = js.native
  var SLEEPY: scala.Double = js.native
  var STATIC: scala.Double = js.native
}

