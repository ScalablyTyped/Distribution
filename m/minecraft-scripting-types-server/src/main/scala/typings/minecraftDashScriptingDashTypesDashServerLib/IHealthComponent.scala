package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var max: scala.Double
  /**
    * Current health of the entity
    * @default 1
    */
  var value: scala.Double
}

object IHealthComponent {
  @scala.inline
  def apply(max: scala.Double, value: scala.Double): IHealthComponent = {
    val __obj = js.Dynamic.literal(max = max, value = value)
  
    __obj.asInstanceOf[IHealthComponent]
  }
}

