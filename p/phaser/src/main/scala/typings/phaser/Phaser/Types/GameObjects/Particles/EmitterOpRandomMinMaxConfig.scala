package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a random value within a range.
  */
@js.native
trait EmitterOpRandomMinMaxConfig extends _EmitterOpOnEmitType {
  /**
    * The maximum value.
    */
  var max: Double = js.native
  /**
    * The minimum value.
    */
  var min: Double = js.native
}

object EmitterOpRandomMinMaxConfig {
  @scala.inline
  def apply(max: Double, min: Double): EmitterOpRandomMinMaxConfig = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomMinMaxConfig]
  }
  @scala.inline
  implicit class EmitterOpRandomMinMaxConfigOps[Self <: EmitterOpRandomMinMaxConfig] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

