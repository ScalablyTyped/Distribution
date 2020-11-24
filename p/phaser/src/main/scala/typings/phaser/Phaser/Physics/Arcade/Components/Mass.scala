package typings.phaser.Phaser.Physics.Arcade.Components

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods used for setting the mass properties of an Arcade Physics Body.
  */
@js.native
trait Mass extends js.Object {
  
  /**
    * Sets the mass of the physics body
    * @param value New value for the mass of the body.
    */
  def setMass(value: Double): this.type = js.native
}
object Mass {
  
  @scala.inline
  def apply(setMass: Double => Mass): Mass = {
    val __obj = js.Dynamic.literal(setMass = js.Any.fromFunction1(setMass))
    __obj.asInstanceOf[Mass]
  }
  
  @scala.inline
  implicit class MassOps[Self <: Mass] (val x: Self) extends AnyVal {
    
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
    def setSetMass(value: Double => Mass): Self = this.set("setMass", js.Any.fromFunction1(value))
  }
}
