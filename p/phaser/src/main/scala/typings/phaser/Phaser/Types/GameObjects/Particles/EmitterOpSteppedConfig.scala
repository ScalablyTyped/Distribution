package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a value incremented by steps across a range.
  */
trait EmitterOpSteppedConfig extends _EmitterOpOnEmitType {
  /**
    * The ending value.
    */
  var end: Double
  /**
    * The starting value.
    */
  var start: Double
  /**
    * The number of steps between start and end.
    */
  var steps: Double
}

object EmitterOpSteppedConfig {
  @scala.inline
  def apply(end: Double, start: Double, steps: Double): EmitterOpSteppedConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpSteppedConfig]
  }
}

