package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPokemonChange extends js.Object {
  
  var change: js.UndefOr[String] = js.native
  
  var change_by: js.UndefOr[Double] = js.native
  
  var change_by_percent: js.UndefOr[Double] = js.native
  
  var conditions: js.UndefOr[js.Array[String]] = js.native
  
  var field: String = js.native
  
  var revive: js.UndefOr[Boolean] = js.native
}
object ItemPokemonChange {
  
  @scala.inline
  def apply(field: String): ItemPokemonChange = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPokemonChange]
  }
  
  @scala.inline
  implicit class ItemPokemonChangeOps[Self <: ItemPokemonChange] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange(value: String): Self = this.set("change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setChange_by(value: Double): Self = this.set("change_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChange_by: Self = this.set("change_by", js.undefined)
    
    @scala.inline
    def setChange_by_percent(value: Double): Self = this.set("change_by_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChange_by_percent: Self = this.set("change_by_percent", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: String*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[String]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setRevive(value: Boolean): Self = this.set("revive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevive: Self = this.set("revive", js.undefined)
  }
}
