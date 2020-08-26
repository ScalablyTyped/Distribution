package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component allows you to control an entity's current rotation in the world as well as the entity's head rotation. Once applied, the entity will be rotated as specified.
  */
@js.native
trait IRotationComponent extends js.Object {
  /**
    * Controls the head rotation looking up and down
    * @default 0.0
    */
  var x: Double = js.native
  /**
    * Controls the body rotation parallel to the floor
    * @default 0.0
    */
  var y: Double = js.native
}

object IRotationComponent {
  @scala.inline
  def apply(x: Double, y: Double): IRotationComponent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRotationComponent]
  }
  @scala.inline
  implicit class IRotationComponentOps[Self <: IRotationComponent] (val x: Self) extends AnyVal {
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
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

