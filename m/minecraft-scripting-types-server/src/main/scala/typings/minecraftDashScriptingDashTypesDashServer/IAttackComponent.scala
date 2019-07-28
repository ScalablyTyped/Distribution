package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component controls the Attack Damage attribute from the entity. It allows you to change the current minimum and maximum values. Once the changes are applied, the current attack of the entity will be reset to the minimum specified. With the minimum and maximum changed to the values specified. Any buffs or debuffs will be left intact.
  */
trait IAttackComponent extends js.Object {
  /**
    * Range of the random amount of damage the melee attack deals. A negative value can heal the entity instead of hurting it
    */
  var damage: Anon_Rangemax
}

object IAttackComponent {
  @scala.inline
  def apply(damage: Anon_Rangemax): IAttackComponent = {
    val __obj = js.Dynamic.literal(damage = damage)
  
    __obj.asInstanceOf[IAttackComponent]
  }
}

