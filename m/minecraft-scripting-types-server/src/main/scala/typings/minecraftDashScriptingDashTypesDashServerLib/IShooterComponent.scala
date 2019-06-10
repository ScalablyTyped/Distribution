package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the entity's ranged attacks. This doesn't allow the entity to use a ranged attack: it only defines what kind of projectile it shoots.
  */
trait IShooterComponent extends js.Object {
  /**
    * ID of the Potion effect to be applied on hit
    * @default -1
    */
  var auxVal: scala.Double
  /**
    * Entity identifier to use as projectile for the ranged attack. The entity must have the projectile component to be able to be shot as a projectile
    */
  var `def`: java.lang.String
}

object IShooterComponent {
  @scala.inline
  def apply(auxVal: scala.Double, `def`: java.lang.String): IShooterComponent = {
    val __obj = js.Dynamic.literal(auxVal = auxVal)
    __obj.updateDynamic("def")(`def`)
    __obj.asInstanceOf[IShooterComponent]
  }
}

