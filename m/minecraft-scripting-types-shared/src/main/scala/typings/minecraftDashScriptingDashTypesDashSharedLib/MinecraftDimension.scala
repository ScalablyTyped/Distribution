package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MinecraftDimension extends js.Object

// TODO: move this stuff somewhere else
@JSGlobal("MinecraftDimension")
@js.native
object MinecraftDimension extends js.Object {
  @js.native
  sealed trait End
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftDimension
  
  @js.native
  sealed trait Nether
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftDimension
  
  @js.native
  sealed trait Overworld
    extends minecraftDashScriptingDashTypesDashSharedLib.MinecraftDimension
  
  /* "the end" */ val End: End with java.lang.String = js.native
  /* "nether" */ val Nether: Nether with java.lang.String = js.native
  /* "overworld" */ val Overworld: Overworld with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    minecraftDashScriptingDashTypesDashSharedLib.MinecraftDimension with java.lang.String
  ] = js.native
}

