package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterBounds extends js.Object {
  /**
    * The height of the rectangle.
    */
  var height: scala.Double
  /**
    * The width of the rectangle.
    */
  var width: scala.Double
  /**
    * The left edge of the rectangle.
    */
  var x: scala.Double
  /**
    * The top edge of the rectangle.
    */
  var y: scala.Double
}

object ParticleEmitterBounds {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): ParticleEmitterBounds = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
  
    __obj.asInstanceOf[ParticleEmitterBounds]
  }
}

