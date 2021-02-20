package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tile
  extends /* key */ StringDictionary[js.Any] {
  
  var index: Double = js.native
  
  var tile: typings.std.Element = js.native
}
object Tile {
  
  @scala.inline
  def apply(index: Double, tile: typings.std.Element): Tile = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile]
  }
  
  @scala.inline
  implicit class TileMutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: typings.std.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
