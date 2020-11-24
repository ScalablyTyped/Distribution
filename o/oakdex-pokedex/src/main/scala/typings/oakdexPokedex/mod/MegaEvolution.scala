package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MegaEvolution extends js.Object {
  
  var ability: String = js.native
  
  var base_stats: StatObject = js.native
  
  var height_eu: String = js.native
  
  var height_us: String = js.native
  
  var image_suffix: js.UndefOr[String] = js.native
  
  var mega_stone: String = js.native
  
  var types: js.Array[String] = js.native
  
  var weight_eu: String = js.native
  
  var weight_us: String = js.native
}
object MegaEvolution {
  
  @scala.inline
  def apply(
    ability: String,
    base_stats: StatObject,
    height_eu: String,
    height_us: String,
    mega_stone: String,
    types: js.Array[String],
    weight_eu: String,
    weight_us: String
  ): MegaEvolution = {
    val __obj = js.Dynamic.literal(ability = ability.asInstanceOf[js.Any], base_stats = base_stats.asInstanceOf[js.Any], height_eu = height_eu.asInstanceOf[js.Any], height_us = height_us.asInstanceOf[js.Any], mega_stone = mega_stone.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], weight_eu = weight_eu.asInstanceOf[js.Any], weight_us = weight_us.asInstanceOf[js.Any])
    __obj.asInstanceOf[MegaEvolution]
  }
  
  @scala.inline
  implicit class MegaEvolutionOps[Self <: MegaEvolution] (val x: Self) extends AnyVal {
    
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
    def setAbility(value: String): Self = this.set("ability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase_stats(value: StatObject): Self = this.set("base_stats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight_eu(value: String): Self = this.set("height_eu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight_us(value: String): Self = this.set("height_us", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMega_stone(value: String): Self = this.set("mega_stone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight_eu(value: String): Self = this.set("weight_eu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight_us(value: String): Self = this.set("weight_us", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_suffix(value: String): Self = this.set("image_suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage_suffix: Self = this.set("image_suffix", js.undefined)
  }
}
