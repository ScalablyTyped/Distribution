package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropReorder[K, D] extends StObject {
  
  var drag: Rows[K, D] = js.native
  
  var drop: Columns = js.native
  
  var reorder: `20` = js.native
}
object DropReorder {
  
  @scala.inline
  def apply[K, D](drag: Rows[K, D], drop: Columns, reorder: `20`): DropReorder[K, D] = {
    val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropReorder[K, D]]
  }
  
  @scala.inline
  implicit class DropReorderMutableBuilder[Self <: DropReorder[_, _], K, D] (val x: Self with (DropReorder[K, D])) extends AnyVal {
    
    @scala.inline
    def setDrag(value: Rows[K, D]): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrop(value: Columns): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReorder(value: `20`): Self = StObject.set(x, "reorder", value.asInstanceOf[js.Any])
  }
}
