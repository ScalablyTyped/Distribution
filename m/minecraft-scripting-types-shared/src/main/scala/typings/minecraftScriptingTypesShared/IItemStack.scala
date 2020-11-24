package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IItemStack extends _IMinecraftObject {
  
  /**
    * The identifier of the item stack
    */
  val __identifier__ : String = js.native
  
  /**
    * The type of the object
    */
  val __type__ : item_stack = js.native
  
  /**
    * The number of items in the stack
    */
  val count: Double = js.native
  
  /**
    * The identifier of the item
    */
  val item: String = js.native
}
object IItemStack {
  
  @scala.inline
  def apply(__identifier__ : String, __type__ : item_stack, count: Double, item: String): IItemStack = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IItemStack]
  }
  
  @scala.inline
  implicit class IItemStackOps[Self <: IItemStack] (val x: Self) extends AnyVal {
    
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
    def set__identifier__(value: String): Self = this.set("__identifier__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: item_stack): Self = this.set("__type__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
  }
}
