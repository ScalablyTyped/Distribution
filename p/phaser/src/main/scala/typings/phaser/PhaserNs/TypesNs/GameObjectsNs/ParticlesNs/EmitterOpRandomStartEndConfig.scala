package typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a random value within a range.
  */
trait EmitterOpRandomStartEndConfig extends _EmitterOpOnEmitType {
  /**
    * The ending value.
    */
  var end: Double
  /**
    * If false, this becomes {@link EmitterOpEaseConfig}.
    */
  var random: Boolean
  /**
    * The starting value.
    */
  var start: Double
}

object EmitterOpRandomStartEndConfig {
  @scala.inline
  def apply(end: Double, random: Boolean, start: Double): EmitterOpRandomStartEndConfig = {
    val __obj = js.Dynamic.literal(end = end, random = random, start = start)
  
    __obj.asInstanceOf[EmitterOpRandomStartEndConfig]
  }
}

