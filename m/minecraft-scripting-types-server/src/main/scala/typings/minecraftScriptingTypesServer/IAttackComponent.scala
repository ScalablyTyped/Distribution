package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesServer.anon.Rangemax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component controls the Attack Damage attribute from the entity. It allows you to change the current minimum and maximum values. Once the changes are applied, the current attack of the entity will be reset to the minimum specified. With the minimum and maximum changed to the values specified. Any buffs or debuffs will be left intact.
  */
trait IAttackComponent extends StObject {
  
  /**
    * Range of the random amount of damage the melee attack deals. A negative value can heal the entity instead of hurting it
    */
  var damage: Rangemax
}
object IAttackComponent {
  
  inline def apply(damage: Rangemax): IAttackComponent = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAttackComponent]
  }
  
  extension [Self <: IAttackComponent](x: Self) {
    
    inline def setDamage(value: Rangemax): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
  }
}
