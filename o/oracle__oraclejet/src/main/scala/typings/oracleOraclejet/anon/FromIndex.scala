package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FromIndex
  extends /* key */ StringDictionary[js.Any] {
  
  var fromIndex: Double = js.native
  
  var tile: typings.std.Element = js.native
}
object FromIndex {
  
  @scala.inline
  def apply(fromIndex: Double, tile: typings.std.Element): FromIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromIndex]
  }
  
  @scala.inline
  implicit class FromIndexMutableBuilder[Self <: FromIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: typings.std.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
