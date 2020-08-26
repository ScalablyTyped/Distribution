package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the current and maximum possible health of the entity. Upon applying the component back to the entity the health will change. If it reaches 0 or below the entity will die.
  */
@js.native
trait IHealthComponent extends js.Object {
  /**
    * The maximum health the entity can heal
    * @default 10
    */
  var max: Double = js.native
  /**
    * Current health of the entity
    * @default 1
    */
  var value: Double = js.native
}

object IHealthComponent {
  @scala.inline
  def apply(max: Double, value: Double): IHealthComponent = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHealthComponent]
  }
  @scala.inline
  implicit class IHealthComponentOps[Self <: IHealthComponent] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

