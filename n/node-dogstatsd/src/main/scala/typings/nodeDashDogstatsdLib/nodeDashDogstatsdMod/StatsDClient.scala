package typings
package nodeDashDogstatsdLib.nodeDashDogstatsdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsDClient extends js.Object {
  def decrement(stat: java.lang.String): scala.Unit = js.native
  def decrement(stat: java.lang.String, sample_rate: scala.Double): scala.Unit = js.native
  def decrement(stat: java.lang.String, sample_rate: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  def decrementBy(stat: java.lang.String, value: scala.Double): scala.Unit = js.native
  def decrementBy(stat: java.lang.String, value: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  def gauge(stat: java.lang.String, value: scala.Double): scala.Unit = js.native
  def gauge(stat: java.lang.String, value: scala.Double, sample_rate: scala.Double): scala.Unit = js.native
  def gauge(
    stat: java.lang.String,
    value: scala.Double,
    sample_rate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def histogram(stat: java.lang.String, time: scala.Double): scala.Unit = js.native
  def histogram(stat: java.lang.String, time: scala.Double, sample_rate: scala.Double): scala.Unit = js.native
  def histogram(
    stat: java.lang.String,
    time: scala.Double,
    sample_rate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
  def increment(stat: java.lang.String): scala.Unit = js.native
  def increment(stat: java.lang.String, sample_rate: scala.Double): scala.Unit = js.native
  def increment(stat: java.lang.String, sample_rate: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  def incrementBy(stat: java.lang.String, value: scala.Double): scala.Unit = js.native
  def incrementBy(stat: java.lang.String, value: scala.Double, tags: js.Array[java.lang.String]): scala.Unit = js.native
  def timing(stat: java.lang.String, time: scala.Double): scala.Unit = js.native
  def timing(stat: java.lang.String, time: scala.Double, sample_rate: scala.Double): scala.Unit = js.native
  def timing(
    stat: java.lang.String,
    time: scala.Double,
    sample_rate: scala.Double,
    tags: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

