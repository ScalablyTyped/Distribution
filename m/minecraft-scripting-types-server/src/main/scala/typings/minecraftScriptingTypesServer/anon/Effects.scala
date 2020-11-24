package typings.minecraftScriptingTypesServer.anon

import typings.minecraftScriptingTypesShared.MinecraftFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effects extends js.Object {
  
  /**
    * FIXME - UNDOCUMENTED - NO DESCRIPTION FROM MOJANG
    */
  var effects: js.Array[Amplifier] = js.native
  
  /**
    * The filter group that defines the conditions for using this item to heal the entity
    */
  var filters: js.UndefOr[MinecraftFilter] = js.native
  
  /**
    * The amount of health this entity gains when fed this item
    * @default 1
    */
  var heal_amount: Double = js.native
  
  /**
    * Item identifier that can be used to heal this entity
    */
  var item: String = js.native
}
object Effects {
  
  @scala.inline
  def apply(effects: js.Array[Amplifier], heal_amount: Double, item: String): Effects = {
    val __obj = js.Dynamic.literal(effects = effects.asInstanceOf[js.Any], heal_amount = heal_amount.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Effects]
  }
  
  @scala.inline
  implicit class EffectsOps[Self <: Effects] (val x: Self) extends AnyVal {
    
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
    def setEffectsVarargs(value: Amplifier*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[Amplifier]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeal_amount(value: Double): Self = this.set("heal_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilters(value: MinecraftFilter): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}
