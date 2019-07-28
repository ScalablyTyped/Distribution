package typings.oakdexDashPokedex.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item extends js.Object {
  var category: String
  var descriptions: js.Array[ItemDescription]
  var effects: js.Array[ItemEffect]
  var fling_power: Double
  var names: Translations
  var pockets: js.Array[ItemPocket]
  var prices: js.Array[ItemPrice]
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
    val __obj = js.Dynamic.literal(category = category, descriptions = descriptions, effects = effects, fling_power = fling_power, names = names, pockets = pockets, prices = prices)
  
    __obj.asInstanceOf[Item]
  }
}

