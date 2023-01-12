package typings.openui5.anon

import typings.openui5.sapMTileMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tile extends StObject {
  
  /**
    * The deleted Tile.
    */
  var tile: js.UndefOr[default] = js.undefined
}
object Tile {
  
  inline def apply(): Tile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tile] (val x: Self) extends AnyVal {
    
    inline def setTile(value: default): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
