package typings.phaser.Phaser.GameObjects.Particles.Zones

import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Geom.Point
import typings.phaser.Phaser.Types.GameObjects.Particles.EdgeZoneSource
import typings.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A zone that places particles on a shape's edges.
  */
@js.native
trait EdgeZone extends js.Object {
  
  /**
    * Change the source of the EdgeZone.
    * @param source An object instance with a `getPoints(quantity, stepRate)` method returning an array of points.
    */
  def changeSource(source: EdgeZoneSource): this.type = js.native
  
  /**
    * The counter used for iterating the EdgeZone's points.
    */
  var counter: Double = js.native
  
  /**
    * Get the next point in the Zone and set its coordinates on the given Particle.
    * @param particle The Particle.
    */
  def getPoint(particle: Particle): Unit = js.native
  
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
    * Update the {@link Phaser.GameObjects.Particles.Zones.EdgeZone#points} from the EdgeZone's
    * {@link Phaser.GameObjects.Particles.Zones.EdgeZone#source}.
    * 
    * Also updates internal properties.
    */
  def updateSource(): this.type = js.native
  
  /**
    * Whether particles are placed from start to end and then end to start.
    */
  var yoyo: Boolean = js.native
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
  
  @scala.inline
  implicit class EdgeZoneOps[Self <: EdgeZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChangeSource(value: EdgeZoneSource => EdgeZone): Self = this.set("changeSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCounter(value: Double): Self = this.set("counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPoint(value: Particle => Unit): Self = this.set("getPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPointsVarargs(value: Point*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[Point]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeamless(value: Boolean): Self = this.set("seamless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EdgeZoneSource | RandomZoneSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepRate(value: Double): Self = this.set("stepRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSource(value: () => EdgeZone): Self = this.set("updateSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setYoyo(value: Boolean): Self = this.set("yoyo", value.asInstanceOf[js.Any])
  }
}
