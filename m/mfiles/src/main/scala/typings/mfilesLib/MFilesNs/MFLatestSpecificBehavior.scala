package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFLatestSpecificBehavior extends js.Object

@JSGlobal("MFiles.MFLatestSpecificBehavior")
@js.native
object MFLatestSpecificBehavior extends js.Object {
  @js.native
  sealed trait Automatic
    extends mfilesLib.MFilesNs.MFLatestSpecificBehavior
  
  @js.native
  sealed trait Latest
    extends mfilesLib.MFilesNs.MFLatestSpecificBehavior
  
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFLatestSpecificBehavior
  
  @js.native
  sealed trait Specific
    extends mfilesLib.MFilesNs.MFLatestSpecificBehavior
  
  /* 3 */ val Automatic: Automatic with scala.Double = js.native
  /* 2 */ val Latest: Latest with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val Specific: Specific with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFLatestSpecificBehavior with scala.Double] = js.native
}

