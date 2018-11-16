package typings
package minaLib.minaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationDescriptor extends js.Object {
  var b: scala.Double = js.native
  var dur: scala.Double = js.native
  var end: scala.Double = js.native
  var id: java.lang.String = js.native
  var s: scala.Double = js.native
  var spd: scala.Double = js.native
  var start: scala.Double = js.native
  def duration(): scala.Double = js.native
  def duration(newDuration: scala.Double): scala.Unit = js.native
  def easing(input: scala.Double): scala.Double = js.native
  def get(): scala.Double = js.native
  def pause(): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def set(slave: scala.Double): scala.Double = js.native
  def speed(): scala.Double = js.native
  def speed(newSpeed: scala.Double): scala.Unit = js.native
  def status(): scala.Double = js.native
  def status(newStatus: scala.Double): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def update(): scala.Unit = js.native
}

