package typings
package phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs

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
@JSGlobal("Phaser.GameObjects.Particles.Zones.DeathZone")
@js.native
class DeathZone protected () extends js.Object {
  /**
    * 
    * @param source An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
    * @param killOnEnter Should the Particle be killed when it enters the zone? `true` or leaves it? `false`
    */
  def this(source: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.DeathZoneSource, killOnEnter: scala.Boolean) = this()
  /**
    * Set to `true` if the Particle should be killed if it enters this zone.
    * Set to `false` to kill the Particle if it leaves this zone.
    */
  var killOnEnter: scala.Boolean = js.native
  /**
    * An object instance that has a `contains` method that returns a boolean when given `x` and `y` arguments.
    * This could be a Geometry shape, such as `Phaser.Geom.Circle`, or your own custom object.
    */
  var source: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.DeathZoneSource = js.native
  /**
    * Checks if the given Particle will be killed or not by this zone.
    * @param particle The Particle to be checked against this zone.
    */
  def willKill(particle: phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle): scala.Boolean = js.native
}

