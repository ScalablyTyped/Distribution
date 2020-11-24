package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousSizeStyleClass
  extends /* key */ StringDictionary[js.Any] {
  
  var previousSizeStyleClass: String = js.native
  
  var sizeStyleClass: String = js.native
  
  var tile: typings.std.Element = js.native
}
object PreviousSizeStyleClass {
  
  @scala.inline
  def apply(previousSizeStyleClass: String, sizeStyleClass: String, tile: typings.std.Element): PreviousSizeStyleClass = {
    val __obj = js.Dynamic.literal(previousSizeStyleClass = previousSizeStyleClass.asInstanceOf[js.Any], sizeStyleClass = sizeStyleClass.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviousSizeStyleClass]
  }
  
  @scala.inline
  implicit class PreviousSizeStyleClassOps[Self <: PreviousSizeStyleClass] (val x: Self) extends AnyVal {
    
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
    def setPreviousSizeStyleClass(value: String): Self = this.set("previousSizeStyleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeStyleClass(value: String): Self = this.set("sizeStyleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: typings.std.Element): Self = this.set("tile", value.asInstanceOf[js.Any])
  }
}
