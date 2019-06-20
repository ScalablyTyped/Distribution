package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

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
  var end: scala.Double
  /**
    * If false, this becomes {@link EmitterOpEaseConfig}.
    */
  var random: scala.Boolean
  /**
    * The starting value.
    */
  var start: scala.Double
}

object EmitterOpRandomStartEndConfig {
  @scala.inline
  def apply(end: scala.Double, random: scala.Boolean, start: scala.Double): EmitterOpRandomStartEndConfig = {
    val __obj = js.Dynamic.literal(end = end, random = random, start = start)
  
    __obj.asInstanceOf[EmitterOpRandomStartEndConfig]
  }
}

