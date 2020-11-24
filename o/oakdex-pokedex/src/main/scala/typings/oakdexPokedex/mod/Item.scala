package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item extends js.Object {
  
  var category: String = js.native
  
  var descriptions: js.Array[ItemDescription] = js.native
  
  var effects: js.Array[ItemEffect] = js.native
  
  var fling_power: Double = js.native
  
  var names: Translations = js.native
  
  var pockets: js.Array[ItemPocket] = js.native
  
  var prices: js.Array[ItemPrice] = js.native
}
object Item {
  
  @scala.inline
  def apply(
    category: String,
    descriptions: js.Array[ItemDescription],
    effects: js.Array[ItemEffect],
    fling_power: Double,
    names: Translations,
    pockets: js.Array[ItemPocket],
    prices: js.Array[ItemPrice]
  ): Item = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], descriptions = descriptions.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fling_power = fling_power.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], pockets = pockets.asInstanceOf[js.Any], prices = prices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit class ItemOps[Self <: Item] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionsVarargs(value: ItemDescription*): Self = this.set("descriptions", js.Array(value :_*))
    
    @scala.inline
    def setDescriptions(value: js.Array[ItemDescription]): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsVarargs(value: ItemEffect*): Self = this.set("effects", js.Array(value :_*))
    
    @scala.inline
    def setEffects(value: js.Array[ItemEffect]): Self = this.set("effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFling_power(value: Double): Self = this.set("fling_power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNames(value: Translations): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPocketsVarargs(value: ItemPocket*): Self = this.set("pockets", js.Array(value :_*))
    
    @scala.inline
    def setPockets(value: js.Array[ItemPocket]): Self = this.set("pockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricesVarargs(value: ItemPrice*): Self = this.set("prices", js.Array(value :_*))
    
    @scala.inline
    def setPrices(value: js.Array[ItemPrice]): Self = this.set("prices", value.asInstanceOf[js.Any])
  }
}
