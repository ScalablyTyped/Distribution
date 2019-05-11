package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines an operation yielding a random value within a range.
  */
trait EmitterOpRandomConfig extends js.Object {
  /**
    * The minimum and maximum values, as [min, max].
    */
  var random: js.Array[scala.Double]
}

object EmitterOpRandomConfig {
  @scala.inline
  def apply(random: js.Array[scala.Double]): EmitterOpRandomConfig = {
    val __obj = js.Dynamic.literal(random = random)
  
    __obj.asInstanceOf[EmitterOpRandomConfig]
  }
}

