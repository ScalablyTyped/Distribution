package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
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
  implicit class ToIndexOps[Self <: ToIndex] (val x: Self) extends AnyVal {
    
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
    def setFromIndex(value: Double): Self = this.set("fromIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: typings.std.Element): Self = this.set("tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToIndex(value: Double): Self = this.set("toIndex", value.asInstanceOf[js.Any])
  }
}
