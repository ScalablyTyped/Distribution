package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticleEmitterBounds extends js.Object {
  /**
    * The height of the rectangle.
    */
  var height: Double
  /**
    * The width of the rectangle.
    */
  var width: Double
  /**
    * The left edge of the rectangle.
    */
  var x: Double
  /**
    * The top edge of the rectangle.
    */
  var y: Double
}

object ParticleEmitterBounds {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): ParticleEmitterBounds = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParticleEmitterBounds]
  }
}

