package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IItemStack extends _IMinecraftObject {
  /**
    * The identifier of the item stack
    */
  val __identifier__ : java.lang.String
  /**
    * The type of the object
    */
  val __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.item_stack
  /**
    * The number of items in the stack
    */
  val count: scala.Double
  /**
    * The identifier of the item
    */
  val item: java.lang.String
}

object IItemStack {
  @scala.inline
  def apply(
    __identifier__ : java.lang.String,
    __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.item_stack,
    count: scala.Double,
    item: java.lang.String
  ): IItemStack = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__, __type__ = __type__, count = count, item = item)
  
    __obj.asInstanceOf[IItemStack]
  }
}

