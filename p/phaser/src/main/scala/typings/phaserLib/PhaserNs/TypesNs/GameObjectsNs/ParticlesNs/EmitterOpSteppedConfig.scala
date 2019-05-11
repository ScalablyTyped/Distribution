package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a value incremented by steps across a range.
  */
trait EmitterOpSteppedConfig extends js.Object {
  /**
    * The ending value.
    */
  var end: scala.Double
  /**
    * The starting value.
    */
  var start: scala.Double
  /**
    * The number of steps between start and end.
    */
  var steps: scala.Double
}

object EmitterOpSteppedConfig {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double, steps: scala.Double): EmitterOpSteppedConfig = {
    val __obj = js.Dynamic.literal(end = end, start = start, steps = steps)
  
    __obj.asInstanceOf[EmitterOpSteppedConfig]
  }
}

