package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: move this stuff somewhere else
/* Rewritten from type alias, can be one of: 
  - minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.overworld
  - minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.nether
  - minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.`the end`
*/
trait MinecraftDimension extends js.Object

object MinecraftDimension {
  @scala.inline
  def End: minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.`the end` = this.cast("the end")
  @scala.inline
  def Nether: minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.nether = this.cast("nether")
  @scala.inline
  def Overworld: minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.overworld = this.cast("overworld")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

