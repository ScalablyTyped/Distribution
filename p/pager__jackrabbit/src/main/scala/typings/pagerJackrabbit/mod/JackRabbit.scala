package typings.pagerJackrabbit.mod

import typings.node.NodeJS.EventEmitter
import typings.pagerJackrabbit.AnonAmqp
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JackRabbit extends EventEmitter {
  def close(): Unit = js.native
  def close(callback: js.Function1[/* e */ Error, _]): Unit = js.native
  def default(): Exchange = js.native
  def direct(): Exchange = js.native
  def direct(name: String): Exchange = js.native
  def direct(name: String, options: ExchangeOptions): Exchange = js.native
  def fanout(): Exchange = js.native
  def fanout(name: String): Exchange = js.native
  def fanout(name: String, options: ExchangeOptions): Exchange = js.native
  def getInternals(): AnonAmqp = js.native
  def topic(): Exchange = js.native
  def topic(name: String): Exchange = js.native
  def topic(name: String, options: ExchangeOptions): Exchange = js.native
}

