package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemPrice extends StObject {
  
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
  implicit class ItemPriceMutableBuilder[Self <: ItemPrice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuying(value: Double): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGames(value: js.Array[String]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGamesVarargs(value: String*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    @scala.inline
    def setSelling(value: Double): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
