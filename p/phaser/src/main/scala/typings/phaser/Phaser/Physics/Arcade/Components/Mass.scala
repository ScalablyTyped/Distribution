package typings.phaser.Phaser.Physics.Arcade.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the mass properties of an Arcade Physics Body.
  */
trait Mass extends js.Object {
  /**
    * Sets the mass of the physics body
    * @param value New value for the mass of the body.
    */
  def setMass(value: Double): this.type
}

object Mass {
  @scala.inline
  def apply(setMass: Double => Mass): Mass = {
    val __obj = js.Dynamic.literal(setMass = js.Any.fromFunction1(setMass))
  
    __obj.asInstanceOf[Mass]
  }
}

