package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "EventEmitter")
@js.native
class EventEmitter ()
  extends p2Lib.p2Mod.p2Ns.EventEmitter {
  /* CompleteClass */
  override def emit(event: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def has(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  /* CompleteClass */
  override def off(`type`: java.lang.String, listener: js.Function): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
  /* CompleteClass */
  override def on(`type`: java.lang.String, listener: js.Function, context: js.Any): p2Lib.p2Mod.p2Ns.EventEmitter = js.native
}

