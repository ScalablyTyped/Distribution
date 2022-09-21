package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviousSizeStyleClass
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var previousSizeStyleClass: String
  
  var sizeStyleClass: String
  
  var tile: typings.std.Element
}
object PreviousSizeStyleClass {
  
  inline def apply(previousSizeStyleClass: String, sizeStyleClass: String, tile: typings.std.Element): PreviousSizeStyleClass = {
    val __obj = js.Dynamic.literal(previousSizeStyleClass = previousSizeStyleClass.asInstanceOf[js.Any], sizeStyleClass = sizeStyleClass.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousSizeStyleClass]
  }
  
  extension [Self <: PreviousSizeStyleClass](x: Self) {
    
    inline def setPreviousSizeStyleClass(value: String): Self = StObject.set(x, "previousSizeStyleClass", value.asInstanceOf[js.Any])
    
    inline def setSizeStyleClass(value: String): Self = StObject.set(x, "sizeStyleClass", value.asInstanceOf[js.Any])
    
    inline def setTile(value: typings.std.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
