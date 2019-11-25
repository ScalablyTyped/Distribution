package typings.minecraftDashScriptingDashTypesDashShared

import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponent[T] extends js.Object {
  /**
    * The identifier of the component, e.g., "minecraft:position", or "minecraft:nameable"
    */
  val __identifier__ : String
  /**
    * The type of the object
    */
  val __type__ : component
  var data: T
}

object IComponent {
  @scala.inline
  def apply[T](__identifier__ : String, __type__ : component, data: T): IComponent[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IComponent[T]]
  }
}

