package typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs

import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.Particle
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.RandomZoneSource
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
  def this(source: RandomZoneSource) = this()
  /**
    * An object instance with a `getRandomPoint(point)` method.
    */
  var source: RandomZoneSource = js.native
  /**
    * Get the next point in the Zone and set its coordinates on the given Particle.
    * @param particle The Particle.
    */
  def getPoint(particle: Particle): Unit = js.native
}

