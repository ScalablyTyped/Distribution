package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEngineTimingOptions extends js.Object {
  /**
    * A `Number` that specifies the global scaling factor of time for all bodies.
    * A value of `0` freezes the simulation.
    * A value of `0.1` gives a slow-motion effect.
    * A value of `1.2` gives a speed-up effect.
    *
    * @property timing.timeScale
    * @type number
    * @default 1
    */
  var timeScale: Double = js.native
  /**
    * A `Number` that specifies the current simulation-time in milliseconds starting from `0`.
    * It is incremented on every `Engine.update` by the given `delta` argument.
    *
    * @property timing.timestamp
    * @type number
    * @default 0
    */
  var timestamp: Double = js.native
}

object IEngineTimingOptions {
  @scala.inline
  def apply(timeScale: Double, timestamp: Double): IEngineTimingOptions = {
    val __obj = js.Dynamic.literal(timeScale = timeScale.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEngineTimingOptions]
  }
  @scala.inline
  implicit class IEngineTimingOptionsOps[Self <: IEngineTimingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTimeScale(value: Double): Self = this.set("timeScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

