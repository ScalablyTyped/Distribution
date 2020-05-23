package typings.phaser.Phaser.GameObjects.Particles.Zones

import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A zone that places particles randomly within a shape's area.
  */
trait RandomZone extends js.Object {
  /**
    * An object instance with a `getRandomPoint(point)` method.
    */
  var source: RandomZoneSource
  /**
    * Get the next point in the Zone and set its coordinates on the given Particle.
    * @param particle The Particle.
    */
  def getPoint(particle: Particle): Unit
}

object RandomZone {
  @scala.inline
  def apply(getPoint: Particle => Unit, source: RandomZoneSource): RandomZone = {
    val __obj = js.Dynamic.literal(getPoint = js.Any.fromFunction1(getPoint), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomZone]
  }
}

