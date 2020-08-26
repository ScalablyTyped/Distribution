package typings.oakdexPokedex.mod

import typings.oakdexPokedex.anon.Jump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PokemonVariation extends js.Object {
  var abilities: js.UndefOr[js.Array[String]] = js.native
  var base_stats: js.UndefOr[StatObject] = js.native
  var condition: js.UndefOr[String] = js.native
  var height_eu: js.UndefOr[String] = js.native
  var height_us: js.UndefOr[String] = js.native
  var image_suffix: js.UndefOr[String] = js.native
  var names: Translations = js.native
  var pokeathlon_stats: js.UndefOr[Jump] = js.native
  var types: js.Array[String] = js.native
  var weight_eu: js.UndefOr[String] = js.native
  var weight_us: js.UndefOr[String] = js.native
}

object PokemonVariation {
  @scala.inline
  def apply(names: Translations, types: js.Array[String]): PokemonVariation = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[PokemonVariation]
  }
  @scala.inline
  implicit class PokemonVariationOps[Self <: PokemonVariation] (val x: Self) extends AnyVal {
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
    def setNames(value: Translations): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbilitiesVarargs(value: String*): Self = this.set("abilities", js.Array(value :_*))
    @scala.inline
    def setAbilities(value: js.Array[String]): Self = this.set("abilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbilities: Self = this.set("abilities", js.undefined)
    @scala.inline
    def setBase_stats(value: StatObject): Self = this.set("base_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase_stats: Self = this.set("base_stats", js.undefined)
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setHeight_eu(value: String): Self = this.set("height_eu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight_eu: Self = this.set("height_eu", js.undefined)
    @scala.inline
    def setHeight_us(value: String): Self = this.set("height_us", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight_us: Self = this.set("height_us", js.undefined)
    @scala.inline
    def setImage_suffix(value: String): Self = this.set("image_suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage_suffix: Self = this.set("image_suffix", js.undefined)
    @scala.inline
    def setPokeathlon_stats(value: Jump): Self = this.set("pokeathlon_stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePokeathlon_stats: Self = this.set("pokeathlon_stats", js.undefined)
    @scala.inline
    def setWeight_eu(value: String): Self = this.set("weight_eu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight_eu: Self = this.set("weight_eu", js.undefined)
    @scala.inline
    def setWeight_us(value: String): Self = this.set("weight_us", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight_us: Self = this.set("weight_us", js.undefined)
  }
  
}

