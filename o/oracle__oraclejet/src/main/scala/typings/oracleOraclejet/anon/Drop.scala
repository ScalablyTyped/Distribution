package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drop extends StObject {
  
  var drag: Nodes = js.native
  
  var drop: Background = js.native
}
object Drop {
  
  @scala.inline
  def apply(drag: Nodes, drop: Background): Drop = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drop]
  }
  
  @scala.inline
  implicit class DropMutableBuilder[Self <: Drop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: Nodes): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop(value: Background): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
  }
}
