package typings.mina.minaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationDescriptor extends js.Object {
  var b: Double = js.native
  var dur: Double = js.native
  var end: Double = js.native
  var id: String = js.native
  var s: Double = js.native
  var spd: Double = js.native
  var start: Double = js.native
  def duration(): Double = js.native
  def duration(newDuration: Double): Unit = js.native
  def easing(input: Double): Double = js.native
  def get(): Double = js.native
  def pause(): Unit = js.native
  def resume(): Unit = js.native
  def set(slave: Double): Double = js.native
  def speed(): Double = js.native
  def speed(newSpeed: Double): Unit = js.native
  def status(): Double = js.native
  def status(newStatus: Double): Unit = js.native
  def stop(): Unit = js.native
  def update(): Unit = js.native
}

