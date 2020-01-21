package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.`the end`
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.nether
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.overworld
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO: move this stuff somewhere else
/* Rewritten from type alias, can be one of: 
  - typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.overworld
  - typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.nether
  - typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.`the end`
*/
trait MinecraftDimension extends js.Object

object MinecraftDimension {
  @scala.inline
  def End: `the end` = this.cast("the end")
  @scala.inline
  def Nether: nether = this.cast("nether")
  @scala.inline
  def Overworld: overworld = this.cast("overworld")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

