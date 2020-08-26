package typings.phaser.Phaser.GameObjects.Particles.Zones

import typings.phaser.Phaser.GameObjects.Particles.Particle
import typings.phaser.Phaser.Types.GameObjects.Particles.RandomZoneSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A zone that places particles randomly within a shape's area.
  */
@js.native
trait RandomZone extends js.Object {
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

object RandomZone {
  @scala.inline
  def apply(getPoint: Particle => Unit, source: RandomZoneSource): RandomZone = {
    val __obj = js.Dynamic.literal(getPoint = js.Any.fromFunction1(getPoint), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomZone]
  }
  @scala.inline
  implicit class RandomZoneOps[Self <: RandomZone] (val x: Self) extends AnyVal {
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
    def setGetPoint(value: Particle => Unit): Self = this.set("getPoint", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: RandomZoneSource): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

