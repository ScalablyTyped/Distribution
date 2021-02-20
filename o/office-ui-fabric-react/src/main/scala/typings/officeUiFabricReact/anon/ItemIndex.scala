package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemIndex extends StObject {
  
  var itemIndex: Double = js.native
}
object ItemIndex {
  
  @scala.inline
  def apply(itemIndex: Double): ItemIndex = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemIndex]
  }
  
  @scala.inline
  implicit class ItemIndexMutableBuilder[Self <: ItemIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
  }
}
