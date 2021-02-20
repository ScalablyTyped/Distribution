package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToIndex
  extends /* key */ StringDictionary[js.Any] {
  
  var fromIndex: Double = js.native
  
  var tile: typings.std.Element = js.native
  
  var toIndex: Double = js.native
}
object ToIndex {
  
  @scala.inline
  def apply(fromIndex: Double, tile: typings.std.Element, toIndex: Double): ToIndex = {
    val __obj = js.Dynamic.literal(fromIndex = fromIndex.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToIndex]
  }
  
  @scala.inline
  implicit class ToIndexMutableBuilder[Self <: ToIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: typings.std.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
  }
}
