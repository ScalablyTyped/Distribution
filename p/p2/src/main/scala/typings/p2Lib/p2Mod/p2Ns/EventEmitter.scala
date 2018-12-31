package typings
package p2Lib.p2Mod.p2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventEmitter extends js.Object {
  def emit(event: js.Any): EventEmitter
  def has(`type`: java.lang.String, listener: js.Function): scala.Boolean
  def off(`type`: java.lang.String, listener: js.Function): EventEmitter
  def on(`type`: java.lang.String, listener: js.Function, context: js.Any): EventEmitter
}

