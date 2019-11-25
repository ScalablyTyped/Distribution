package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the current and maximum possible health of the entity. Upon applying the component back to the entity the health will change. If it reaches 0 or below the entity will die.
  */
trait IHealthComponent extends js.Object {
  /**
    * The maximum health the entity can heal
    * @default 10
    */
  var max: Double
  /**
    * Current health of the entity
    * @default 1
    */
  var value: Double
}

object IHealthComponent {
  @scala.inline
  def apply(max: Double, value: Double): IHealthComponent = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHealthComponent]
  }
}

