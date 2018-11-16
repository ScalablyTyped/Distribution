package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CommandState extends js.Object

@JSGlobal("MFiles.CommandState")
@js.native
object CommandState extends js.Object {
  @js.native
  sealed trait Active
    extends mfilesLib.MFilesNs.CommandState
  
  @js.native
  sealed trait Hidden
    extends mfilesLib.MFilesNs.CommandState
  
  @js.native
  sealed trait Inactive
    extends mfilesLib.MFilesNs.CommandState
  
  @js.native
  sealed trait Undefined
    extends mfilesLib.MFilesNs.CommandState
  
  /* 1 */ val Active: Active with scala.Double = js.native
  /* 3 */ val Hidden: Hidden with scala.Double = js.native
  /* 2 */ val Inactive: Inactive with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.CommandState with scala.Double] = js.native
}

