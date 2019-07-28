package typings.opossum.opossumMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status extends EventEmitter {
  var stats: Stats = js.native
  var window: Window = js.native
  def close(): Unit = js.native
  def increment(property: String): Unit = js.native
  def increment(property: String, latencyRunTime: Double): Unit = js.native
  def open(): Unit = js.native
}

