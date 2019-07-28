package typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.ZonesNs

import typings.phaser.PhaserNs.GameObjectsNs.ParticlesNs.Particle
import typings.phaser.PhaserNs.GeomNs.Point
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.EdgeZoneSource
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.RandomZoneSource
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A zone that places particles on a shape's edges.
  */
@JSGlobal("Phaser.GameObjects.Particles.Zones.EdgeZone")
@js.native
class EdgeZone protected () extends js.Object {
  /**
    * 
    * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    * @param quantity The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    * @param stepRate The distance between each particle. When set, `quantity` is implied and should be set to 0.
    * @param yoyo Whether particles are placed from start to end and then end to start. Default false.
    * @param seamless Whether one endpoint will be removed if it's identical to the other. Default true.
    */
  def this(source: EdgeZoneSource, quantity: integer, stepRate: Double) = this()
  def this(source: EdgeZoneSource, quantity: integer, stepRate: Double, yoyo: Boolean) = this()
  def this(source: EdgeZoneSource, quantity: integer, stepRate: Double, yoyo: Boolean, seamless: Boolean) = this()
  /**
    * The counter used for iterating the EdgeZone's points.
    */
  var counter: Double = js.native
  /**
    * The points placed on the source edge.
    */
  var points: js.Array[Point] = js.native
  /**
    * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    */
  var quantity: integer = js.native
  /**
    * Whether one endpoint will be removed if it's identical to the other.
    */
  var seamless: Boolean = js.native
  /**
    * An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    */
  var source: EdgeZoneSource | RandomZoneSource = js.native
  /**
    * The distance between each particle. When set, `quantity` is implied and should be set to 0.
    */
  var stepRate: Double = js.native
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: Boolean = js.native
  /**
    * Change the source of the EdgeZone.
    * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    */
  def changeSource(source: EdgeZoneSource): EdgeZone = js.native
  /**
    * Get the next point in the Zone and set its coordinates on the given Particle.
    * @param particle The Particle.
    */
  def getPoint(particle: Particle): Unit = js.native
  /**
    * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
    * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    * 
    * Also updates internal properties.
    */
  def updateSource(): EdgeZone = js.native
}

