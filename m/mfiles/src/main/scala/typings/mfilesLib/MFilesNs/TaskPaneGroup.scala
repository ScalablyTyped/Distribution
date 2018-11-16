package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskPaneGroup extends js.Object

@JSGlobal("MFiles.TaskPaneGroup")
@js.native
object TaskPaneGroup extends js.Object {
  @js.native
  sealed trait GoTo
    extends mfilesLib.MFilesNs.TaskPaneGroup
  
  @js.native
  sealed trait Main
    extends mfilesLib.MFilesNs.TaskPaneGroup
  
  @js.native
  sealed trait New
    extends mfilesLib.MFilesNs.TaskPaneGroup
  
  @js.native
  sealed trait ViewAndModify
    extends mfilesLib.MFilesNs.TaskPaneGroup
  
  /* 3 */ val GoTo: GoTo with scala.Double = js.native
  /* 4 */ val Main: Main with scala.Double = js.native
  /* 1 */ val New: New with scala.Double = js.native
  /* 2 */ val ViewAndModify: ViewAndModify with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.TaskPaneGroup with scala.Double] = js.native
}

