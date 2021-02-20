package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPokemonChange extends StObject {
  
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
  implicit class ItemPokemonChangeMutableBuilder[Self <: ItemPokemonChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: String): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setChange_by(value: Double): Self = StObject.set(x, "change_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange_byUndefined: Self = StObject.set(x, "change_by", js.undefined)
    
    @scala.inline
    def setChange_by_percent(value: Double): Self = StObject.set(x, "change_by_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChange_by_percentUndefined: Self = StObject.set(x, "change_by_percent", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[String]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: String*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevive(value: Boolean): Self = StObject.set(x, "revive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviveUndefined: Self = StObject.set(x, "revive", js.undefined)
  }
}
