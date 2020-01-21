package typings.nodeDogstatsd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsDClient extends js.Object {
  def decrement(stat: String): Unit = js.native
  def decrement(stat: String, sample_rate: Double): Unit = js.native
  def decrement(stat: String, sample_rate: Double, tags: js.Array[String]): Unit = js.native
  def decrementBy(stat: String, value: Double): Unit = js.native
  def decrementBy(stat: String, value: Double, tags: js.Array[String]): Unit = js.native
  def gauge(stat: String, value: Double): Unit = js.native
  def gauge(stat: String, value: Double, sample_rate: Double): Unit = js.native
  def gauge(stat: String, value: Double, sample_rate: Double, tags: js.Array[String]): Unit = js.native
  def histogram(stat: String, time: Double): Unit = js.native
  def histogram(stat: String, time: Double, sample_rate: Double): Unit = js.native
  def histogram(stat: String, time: Double, sample_rate: Double, tags: js.Array[String]): Unit = js.native
  def increment(stat: String): Unit = js.native
  def increment(stat: String, sample_rate: Double): Unit = js.native
  def increment(stat: String, sample_rate: Double, tags: js.Array[String]): Unit = js.native
  def incrementBy(stat: String, value: Double): Unit = js.native
  def incrementBy(stat: String, value: Double, tags: js.Array[String]): Unit = js.native
  def timing(stat: String, time: Double): Unit = js.native
  def timing(stat: String, time: Double, sample_rate: Double): Unit = js.native
  def timing(stat: String, time: Double, sample_rate: Double, tags: js.Array[String]): Unit = js.native
}

