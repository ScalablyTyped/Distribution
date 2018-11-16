package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandLocation extends js.Object

@JSGlobal("MFiles.CommandLocation")
@js.native
object CommandLocation extends js.Object {
  @js.native
  sealed trait All
    extends mfilesLib.MFilesNs.CommandLocation
  
  @js.native
  sealed trait ContextMenu
    extends mfilesLib.MFilesNs.CommandLocation
  
  @js.native
  sealed trait MainMenu
    extends mfilesLib.MFilesNs.CommandLocation
  
  @js.native
  sealed trait TaskPane
    extends mfilesLib.MFilesNs.CommandLocation
  
  @js.native
  sealed trait Undefined
    extends mfilesLib.MFilesNs.CommandLocation
  
  /* 268435455 */ val All: All with scala.Double = js.native
  /* 2 */ val ContextMenu: ContextMenu with scala.Double = js.native
  /* 1 */ val MainMenu: MainMenu with scala.Double = js.native
  /* 4 */ val TaskPane: TaskPane with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.CommandLocation with scala.Double] = js.native
}

