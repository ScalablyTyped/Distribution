package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

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
  var max: scala.Double
  /**
    * The minimum value.
    */
  var min: scala.Double
}

object EmitterOpRandomMinMaxConfig {
  @scala.inline
  def apply(max: scala.Double, min: scala.Double): EmitterOpRandomMinMaxConfig = {
    val __obj = js.Dynamic.literal(max = max, min = min)
  
    __obj.asInstanceOf[EmitterOpRandomMinMaxConfig]
  }
}

