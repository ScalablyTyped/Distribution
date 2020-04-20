package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a random value within a range.
  */
trait EmitterOpRandomMinMaxConfig extends _EmitterOpOnEmitType {
  /**
    * The maximum value.
    */
  var max: Double
  /**
    * The minimum value.
    */
  var min: Double
}

object EmitterOpRandomMinMaxConfig {
  @scala.inline
  def apply(max: Double, min: Double): EmitterOpRandomMinMaxConfig = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomMinMaxConfig]
  }
}

