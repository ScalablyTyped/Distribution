package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapMTileMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewIndex extends StObject {
  
  /**
    * The new index of the Tile in the tiles aggregation.
    */
  var newIndex: js.UndefOr[int] = js.undefined
  
  /**
    * The Tile that has been moved.
    */
  var tile: js.UndefOr[default] = js.undefined
}
object NewIndex {
  
  inline def apply(): NewIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewIndex]
  }
  
  extension [Self <: NewIndex](x: Self) {
    
    inline def setNewIndex(value: int): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    inline def setTile(value: default): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "tile", js.undefined)
  }
}
