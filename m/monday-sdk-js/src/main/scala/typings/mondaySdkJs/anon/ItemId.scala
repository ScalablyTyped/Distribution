package typings.mondaySdkJs.anon

import typings.mondaySdkJs.mondaySdkJsStrings.columns
import typings.mondaySdkJs.mondaySdkJsStrings.updates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemId extends js.Object {
  
  /**
    * The ID of the item to open
    */
  var itemId: Double = js.native
  
  /**
    * On which view to open the item card.
    * Can be "updates" / "columns"
    * Defaults to "columns"
    */
  var kind: js.UndefOr[updates | columns] = js.native
}
object ItemId {
  
  @scala.inline
  def apply(itemId: Double): ItemId = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemId]
  }
  
  @scala.inline
  implicit class ItemIdOps[Self <: ItemId] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: Double): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: updates | columns): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
