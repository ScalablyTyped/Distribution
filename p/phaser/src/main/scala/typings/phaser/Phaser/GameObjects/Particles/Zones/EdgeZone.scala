package typings.phaser.Phaser.GameObjects.Particles.Zones

import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A zone that places particles on a shape's edges.
  */
trait EdgeZone extends js.Object {
  /**
    * The counter used for iterating the EdgeZone's points.
    */
  var counter: Double
  /**
    * The points placed on the source edge.
    */
  var points: js.Array[Point]
  /**
    * The number of particles to place on the source edge. Set to 0 to use `stepRate` instead.
    */
  var quantity: integer
  /**
    * Whether one endpoint will be removed if it's identical to the other.
    */
  var seamless: Boolean
  /**
    * An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    */
  var source: EdgeZoneSource | RandomZoneSource
  /**
    * The distance between each particle. When set, `quantity` is implied and should be set to 0.
    */
  var stepRate: Double
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: Boolean
  /**
    * Change the source of the EdgeZone.
    * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    */
  def changeSource(source: EdgeZoneSource): this.type
  /**
    * Get the next point in the Zone and set its coordinates on the given Particle.
    * @param particle The Particle.
    */
  def getPoint(particle: Particle): Unit
  /**
    * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
    * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    * 
    * Also updates internal properties.
    */
  def updateSource(): this.type
}

object EdgeZone {
  @scala.inline
  def apply(
    changeSource: EdgeZoneSource => EdgeZone,
    counter: Double,
    getPoint: Particle => Unit,
    points: js.Array[Point],
    quantity: integer,
    seamless: Boolean,
    source: EdgeZoneSource | RandomZoneSource,
    stepRate: Double,
    updateSource: () => EdgeZone,
    yoyo: Boolean
  ): EdgeZone = {
    val __obj = js.Dynamic.literal(changeSource = js.Any.fromFunction1(changeSource), counter = counter.asInstanceOf[js.Any], getPoint = js.Any.fromFunction1(getPoint), points = points.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], seamless = seamless.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stepRate = stepRate.asInstanceOf[js.Any], updateSource = js.Any.fromFunction0(updateSource), yoyo = yoyo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeZone]
  }
}

