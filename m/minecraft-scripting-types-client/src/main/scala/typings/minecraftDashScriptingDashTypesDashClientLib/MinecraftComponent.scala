package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinecraftComponent extends js.Object

@JSGlobal("MinecraftComponent")
@js.native
object MinecraftComponent extends js.Object {
  /**
    * The MoLang component gives access to the MoLang variables in an entity. To learn more about MoLang varibles review the add-on documentation. In scripts, you can get and set these varibles that are defined in the entity's JSON files. Because of how the MoLang variables are formatted (entity.isgrazing for example) you must use the [] operator on the object to access the variable. The example below shows how to use the [] operator to access the variable.
    */
  @js.native
  sealed trait MoLang
    extends minecraftDashScriptingDashTypesDashClientLib.MinecraftComponent
  
  /* "minecraft:molang" */ val MoLang: MoLang with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashClientLib.MinecraftComponent with java.lang.String
  ] = js.native
}

