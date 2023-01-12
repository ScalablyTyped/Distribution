package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictpropNameTile
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var tile: typings.std.Element
}
object DictpropNameTile {
  
  inline def apply(tile: typings.std.Element): DictpropNameTile = {
    val __obj = js.Dynamic.literal(tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropNameTile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictpropNameTile] (val x: Self) extends AnyVal {
    
    inline def setTile(value: typings.std.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
