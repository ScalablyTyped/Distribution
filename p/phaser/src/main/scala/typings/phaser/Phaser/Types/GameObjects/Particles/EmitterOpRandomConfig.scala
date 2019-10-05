package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a random value within a range.
  */
trait EmitterOpRandomConfig extends _EmitterOpOnEmitType {
  /**
    * The minimum and maximum values, as [min, max].
    */
  var random: js.Array[Double]
}

object EmitterOpRandomConfig {
  @scala.inline
  def apply(random: js.Array[Double]): EmitterOpRandomConfig = {
    val __obj = js.Dynamic.literal(random = random)
  
    __obj.asInstanceOf[EmitterOpRandomConfig]
  }
}

