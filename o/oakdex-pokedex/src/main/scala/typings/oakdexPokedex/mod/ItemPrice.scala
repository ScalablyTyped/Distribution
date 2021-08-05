package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemPrice extends StObject {
  
  var buying: Double
  
  var games: js.Array[String]
  
  var selling: Double
}
object ItemPrice {
  
  inline def apply(buying: Double, games: js.Array[String], selling: Double): ItemPrice = {
    val __obj = js.Dynamic.literal(buying = buying.asInstanceOf[js.Any], games = games.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemPrice]
  }
  
  extension [Self <: ItemPrice](x: Self) {
    
    inline def setBuying(value: Double): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    inline def setGames(value: js.Array[String]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
    
    inline def setGamesVarargs(value: String*): Self = StObject.set(x, "games", js.Array(value :_*))
    
    inline def setSelling(value: Double): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
