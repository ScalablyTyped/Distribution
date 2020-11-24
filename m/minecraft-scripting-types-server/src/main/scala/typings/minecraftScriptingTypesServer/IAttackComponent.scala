package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Rangemax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component controls the Attack Damage attribute from the entity. It allows you to change the current minimum and maximum values. Once the changes are applied, the current attack of the entity will be reset to the minimum specified. With the minimum and maximum changed to the values specified. Any buffs or debuffs will be left intact.
  */
@js.native
trait IAttackComponent extends js.Object {
  
  /**
    * Range of the random amount of damage the melee attack deals. A negative value can heal the entity instead of hurting it
    */
  var damage: Rangemax = js.native
}
object IAttackComponent {
  
  @scala.inline
  def apply(damage: Rangemax): IAttackComponent = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttackComponent]
  }
  
  @scala.inline
  implicit class IAttackComponentOps[Self <: IAttackComponent] (val x: Self) extends AnyVal {
    
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
    def setDamage(value: Rangemax): Self = this.set("damage", value.asInstanceOf[js.Any])
  }
}
