package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a random value within a range.
  */
@js.native
trait EmitterOpRandomConfig extends _EmitterOpOnEmitType {
  /**
    * The minimum and maximum values, as [min, max].
    */
  var random: js.Array[Double] = js.native
}

object EmitterOpRandomConfig {
  @scala.inline
  def apply(random: js.Array[Double]): EmitterOpRandomConfig = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomConfig]
  }
  @scala.inline
  implicit class EmitterOpRandomConfigOps[Self <: EmitterOpRandomConfig] (val x: Self) extends AnyVal {
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
    def setRandomVarargs(value: Double*): Self = this.set("random", js.Array(value :_*))
    @scala.inline
    def setRandom(value: js.Array[Double]): Self = this.set("random", value.asInstanceOf[js.Any])
  }
  
}

