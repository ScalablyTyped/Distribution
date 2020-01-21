package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_stack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemStack extends _IMinecraftObject {
  /**
    * The identifier of the item stack
    */
  val __identifier__ : String
  /**
    * The type of the object
    */
  val __type__ : item_stack
  /**
    * The number of items in the stack
    */
  val count: Double
  /**
    * The identifier of the item
    */
  val item: String
}

object IItemStack {
  @scala.inline
  def apply(__identifier__ : String, __type__ : item_stack, count: Double, item: String): IItemStack = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IItemStack]
  }
}

