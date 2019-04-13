package typings
package p2Lib.p2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p2", "EventEmitter")
@js.native
class EventEmitter () extends js.Object {
  def emit(event: js.Any): EventEmitter = js.native
  def has(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  def off(`type`: java.lang.String, listener: js.Function): EventEmitter = js.native
  def on(`type`: java.lang.String, listener: js.Function): EventEmitter = js.native
  def on(`type`: java.lang.String, listener: js.Function, context: js.Any): EventEmitter = js.native
}

