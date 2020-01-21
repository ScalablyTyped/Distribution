package typings.oboe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oboe extends js.Object {
  var source: String = js.native
  def abort(): Unit = js.native
  def done(callback: js.Function1[/* result */ js.Any, Unit]): Oboe = js.native
  def fail(callback: js.Function1[/* result */ FailReason, Unit]): Oboe = js.native
  def node(pattern: String, callback: CallbackSignature): Oboe = js.native
  def node(patterns: PatternMap): Oboe = js.native
  def on(eventPattern: String, callback: CallbackSignature): Oboe = js.native
  def on(event: String, pattern: String, callback: CallbackSignature): Oboe = js.native
  def path(listeners: js.Any): Oboe = js.native
  def path(pattern: String, callback: CallbackSignature): Oboe = js.native
  def removeListener(eventPattern: String, callback: CallbackSignature): Oboe = js.native
  def removeListener(event: String, pattern: String, callback: CallbackSignature): Oboe = js.native
  def start(callback: js.Function2[/* status */ Double, /* headers */ js.Object, Unit]): Oboe = js.native
}

