package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drag extends StObject {
  
  var drag: Groups = js.native
  
  var drop: Legend = js.native
}
object Drag {
  
  @scala.inline
  def apply(drag: Groups, drop: Legend): Drag = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Drag]
  }
  
  @scala.inline
  implicit class DragMutableBuilder[Self <: Drag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: Groups): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop(value: Legend): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
  }
}
