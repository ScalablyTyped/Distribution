package typings.naudiodon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var defaultHighInputLatency: Double
  var defaultHighOutputLatency: Double
  var defaultLowInputLatency: Double
  var defaultLowOutputLatency: Double
  var defaultSampleRate: Double
  var hostAPIName: Double
  var id: Double
  var maxInputChannels: Double
  var maxOutputChannels: Double
  var name: String
}

object Device {
  @scala.inline
  def apply(
    defaultHighInputLatency: Double,
    defaultHighOutputLatency: Double,
    defaultLowInputLatency: Double,
    defaultLowOutputLatency: Double,
    defaultSampleRate: Double,
    hostAPIName: Double,
    id: Double,
    maxInputChannels: Double,
    maxOutputChannels: Double,
    name: String
  ): Device = {
    val __obj = js.Dynamic.literal(defaultHighInputLatency = defaultHighInputLatency.asInstanceOf[js.Any], defaultHighOutputLatency = defaultHighOutputLatency.asInstanceOf[js.Any], defaultLowInputLatency = defaultLowInputLatency.asInstanceOf[js.Any], defaultLowOutputLatency = defaultLowOutputLatency.asInstanceOf[js.Any], defaultSampleRate = defaultSampleRate.asInstanceOf[js.Any], hostAPIName = hostAPIName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxInputChannels = maxInputChannels.asInstanceOf[js.Any], maxOutputChannels = maxOutputChannels.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

