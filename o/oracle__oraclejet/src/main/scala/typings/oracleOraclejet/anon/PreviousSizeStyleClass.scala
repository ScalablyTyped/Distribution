package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class PreviousSizeStyleClassMutableBuilder[Self <: PreviousSizeStyleClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreviousSizeStyleClass(value: String): Self = StObject.set(x, "previousSizeStyleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeStyleClass(value: String): Self = StObject.set(x, "sizeStyleClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: typings.std.Element): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
  }
}
