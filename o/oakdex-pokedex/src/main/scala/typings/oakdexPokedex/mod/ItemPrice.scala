package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPrice extends js.Object {
  
  var buying: Double = js.native
  
  var games: js.Array[String] = js.native
  
  var selling: Double = js.native
}
object ItemPrice {
  
  @scala.inline
  def apply(buying: Double, games: js.Array[String], selling: Double): ItemPrice = {
    val __obj = js.Dynamic.literal(buying = buying.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPrice]
  }
  
  @scala.inline
  implicit class ItemPriceOps[Self <: ItemPrice] (val x: Self) extends AnyVal {
    
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
    def setBuying(value: Double): Self = this.set("buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamesVarargs(value: String*): Self = this.set("games", js.Array(value :_*))
    
    @scala.inline
    def setGames(value: js.Array[String]): Self = this.set("games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: Double): Self = this.set("selling", value.asInstanceOf[js.Any])
  }
}
