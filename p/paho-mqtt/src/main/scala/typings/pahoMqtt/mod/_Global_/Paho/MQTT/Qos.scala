package typings.pahoMqtt.mod._Global_.Paho.MQTT

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Quality of Service used to deliver a message.
  * <dl>
  *    <dt>0 Best effort (default).</dt>
  *    <dt>1 At least once.</dt>
  *    <dt>2 Exactly once.</dt>
  * </dl>
  */
/* Rewritten from type alias, can be one of: 
  - typings.pahoMqtt.pahoMqttNumbers.`0`
  - typings.pahoMqtt.pahoMqttNumbers.`1`
  - typings.pahoMqtt.pahoMqttNumbers.`2`
*/
trait Qos extends js.Object

object Qos {
  @scala.inline
  def `0`: typings.pahoMqtt.pahoMqttNumbers.`0` = this.cast(0)
  @scala.inline
  def `1`: typings.pahoMqtt.pahoMqttNumbers.`1` = this.cast(1)
  @scala.inline
  def `2`: typings.pahoMqtt.pahoMqttNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

