package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Damage extends js.Object {
  
  var damage: Rank = js.native
  
  var support: Rank = js.native
  
  var tank: Rank = js.native
}
object Damage {
  
  @scala.inline
  def apply(damage: Rank, support: Rank, tank: Rank): Damage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], tank = tank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damage]
  }
  
  @scala.inline
  implicit class DamageOps[Self <: Damage] (val x: Self) extends AnyVal {
    
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
    def setDamage(value: Rank): Self = this.set("damage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupport(value: Rank): Self = this.set("support", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTank(value: Rank): Self = this.set("tank", value.asInstanceOf[js.Any])
  }
}
