package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Status
  extends nodeLib.eventsMod.EventEmitter {
  var stats: Stats = js.native
  var window: Window = js.native
  def close(): scala.Unit = js.native
  def increment(property: java.lang.String): scala.Unit = js.native
  def increment(property: java.lang.String, latencyRunTime: scala.Double): scala.Unit = js.native
  def open(): scala.Unit = js.native
}

