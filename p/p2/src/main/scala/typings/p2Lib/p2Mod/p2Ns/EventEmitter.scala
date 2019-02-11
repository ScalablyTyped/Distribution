package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitter extends js.Object {
  def emit(event: js.Any): EventEmitter = js.native
  def has(`type`: java.lang.String, listener: js.Function): scala.Boolean = js.native
  def off(`type`: java.lang.String, listener: js.Function): EventEmitter = js.native
  def on(`type`: java.lang.String, listener: js.Function): EventEmitter = js.native
  def on(`type`: java.lang.String, listener: js.Function, context: js.Any): EventEmitter = js.native
}

