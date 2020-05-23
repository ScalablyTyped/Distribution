package typings.phaser.Phaser.GameObjects.Particles.Zones

import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Types.GameObjects.Particles.DeathZoneSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Death Zone.
  * 
  * A Death Zone is a special type of zone that will kill a Particle as soon as it either enters, or leaves, the zone.
  * 
  * The zone consists of a `source` which could be a Geometric shape, such as a Rectangle or Ellipse, or your own
  * object as long as it includes a `contains` method for which the Particles can be tested against.
  */
trait DeathZone extends js.Object {
  /**
    * Set to `true` if the Particle should be killed if it enters this zone.
    * Set to `false` to kill the Particle if it leaves this zone.
    */
  var killOnEnter: Boolean
  /**
    * An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
    * This could be a Geometry shape, such as `Phaser.Geom.Circle`, or your own custom object.
    */
  var source: DeathZoneSource
  /**
    * Checks if the given Particle will be killed or not by this zone.
    * @param particle The Particle to be checked against this zone.
    */
  def willKill(particle: Particle): Boolean
}

object DeathZone {
  @scala.inline
  def apply(killOnEnter: Boolean, source: DeathZoneSource, willKill: Particle => Boolean): DeathZone = {
    val __obj = js.Dynamic.literal(killOnEnter = killOnEnter.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], willKill = js.Any.fromFunction1(willKill))
    __obj.asInstanceOf[DeathZone]
  }
}

