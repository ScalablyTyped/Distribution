package typings.phaser.Phaser.Physics.Matter.Components

import typings.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A component to manipulate world gravity for Matter.js bodies.
  */
@js.native
trait Gravity extends js.Object {
  
  /**
    * A togglable function for ignoring world gravity in real-time on the current body.
    * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
    */
  def setIgnoreGravity(value: Boolean): GameObject = js.native
}
object Gravity {
  
  @scala.inline
  def apply(setIgnoreGravity: Boolean => GameObject): Gravity = {
    val __obj = js.Dynamic.literal(setIgnoreGravity = js.Any.fromFunction1(setIgnoreGravity))
    __obj.asInstanceOf[Gravity]
  }
  
  @scala.inline
  implicit class GravityOps[Self <: Gravity] (val x: Self) extends AnyVal {
    
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
    def setSetIgnoreGravity(value: Boolean => GameObject): Self = this.set("setIgnoreGravity", js.Any.fromFunction1(value))
  }
}
