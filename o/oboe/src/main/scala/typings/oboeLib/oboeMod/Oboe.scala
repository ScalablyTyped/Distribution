package typings
package oboeLib.oboeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Oboe extends js.Object {
  var source: java.lang.String = js.native
  def abort(): scala.Unit = js.native
  def done(callback: js.Function1[/* result */ js.Any, scala.Unit]): Oboe = js.native
  def fail(callback: js.Function1[/* result */ FailReason, scala.Unit]): Oboe = js.native
  def node(pattern: java.lang.String, callback: CallbackSignature): Oboe = js.native
  def node(patterns: PatternMap): Oboe = js.native
  def on(eventPattern: java.lang.String, callback: CallbackSignature): Oboe = js.native
  def on(event: java.lang.String, pattern: java.lang.String, callback: CallbackSignature): Oboe = js.native
  def path(listeners: js.Any): Oboe = js.native
  def path(pattern: java.lang.String, callback: CallbackSignature): Oboe = js.native
  def removeListener(eventPattern: java.lang.String, callback: CallbackSignature): Oboe = js.native
  def removeListener(event: java.lang.String, pattern: java.lang.String, callback: CallbackSignature): Oboe = js.native
  def start(callback: js.Function2[/* status */ scala.Double, /* headers */ js.Object, scala.Unit]): Oboe = js.native
}

