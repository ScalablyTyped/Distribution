package typings
package phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A zone that places particles randomly within a shape's area.
  */
@JSGlobal("Phaser.GameObjects.Particles.Zones.RandomZone")
@js.native
class RandomZone protected () extends js.Object {
  /**
    * 
    * @param source An object instance with a `getRandomPoint(point)` method.
    */
  def this(source: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.RandomZoneSource) = this()
  /**
    * An object instance with a `getRandomPoint(point)` method.
    */
  var source: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.RandomZoneSource = js.native
  /**
    * Get the next point in the Zone and set its coordinates on the given Particle.
    * @param particle The Particle.
    */
  def getPoint(particle: phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.Particle): scala.Unit = js.native
}

