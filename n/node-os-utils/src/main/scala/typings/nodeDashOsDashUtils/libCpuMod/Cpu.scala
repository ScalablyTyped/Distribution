package typings.nodeDashOsDashUtils.libCpuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cpu extends js.Object {
  def average(): CpuAverageInfo = js.native
  def count(): Double = js.native
  def free(): js.Promise[Double] = js.native
  def free(interval: Double): js.Promise[Double] = js.native
  def loadavg(): js.Array[Double] = js.native
  def loadavgTime(time: String): Double = js.native
  def loadavgTime(time: Double): Double = js.native
  def model(): String = js.native
  def usage(): js.Promise[Double] = js.native
  def usage(interval: Double): js.Promise[Double] = js.native
}

