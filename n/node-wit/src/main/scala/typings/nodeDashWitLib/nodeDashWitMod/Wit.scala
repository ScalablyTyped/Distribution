package typings
package nodeDashWitLib.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-wit", "Wit")
@js.native
class Wit protected () extends js.Object {
  def this(option: WitOption) = this()
  def converse(sessionId: java.lang.String, message: java.lang.String, context: WitContext): js.Promise[MessageResponse] = js.native
  def converse(sessionId: java.lang.String, message: java.lang.String, context: WitContext, reset: scala.Boolean): js.Promise[MessageResponse] = js.native
  def message(message: java.lang.String, context: WitContext): js.Promise[MessageResponse] = js.native
  def runActions(sessionId: java.lang.String, message: java.lang.String, context: WitContext): js.Promise[WitContext] = js.native
  def runActions(
    sessionId: java.lang.String,
    message: java.lang.String,
    context: WitContext,
    maxSteps: scala.Double
  ): js.Promise[WitContext] = js.native
}

