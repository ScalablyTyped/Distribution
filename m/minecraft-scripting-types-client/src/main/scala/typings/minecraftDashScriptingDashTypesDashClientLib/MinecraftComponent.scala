package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MinecraftComponent {
  /**
    * The MoLang component gives access to the MoLang variables in an entity. To learn more about MoLang varibles review the add-on documentation. In scripts, you can get and set these varibles that are defined in the entity's JSON files. Because of how the MoLang variables are formatted (entity.isgrazing for example) you must use the [] operator on the object to access the variable. The example below shows how to use the [] operator to access the variable.
    */
  @scala.inline
  def MoLang: minecraftDashScriptingDashTypesDashClientLib.minecraftDashScriptingDashTypesDashClientLibStrings.`minecraft:molang` = this.cast("minecraft:molang")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

