package typings.nodeDashWit.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-wit", "Wit")
@js.native
class Wit protected () extends js.Object {
  def this(option: WitOption) = this()
  def converse(sessionId: String, message: String, context: WitContext): js.Promise[MessageResponse] = js.native
  def converse(sessionId: String, message: String, context: WitContext, reset: Boolean): js.Promise[MessageResponse] = js.native
  def message(message: String, context: WitContext): js.Promise[MessageResponse] = js.native
  def runActions(sessionId: String, message: String, context: WitContext): js.Promise[WitContext] = js.native
  def runActions(sessionId: String, message: String, context: WitContext, maxSteps: Double): js.Promise[WitContext] = js.native
}

