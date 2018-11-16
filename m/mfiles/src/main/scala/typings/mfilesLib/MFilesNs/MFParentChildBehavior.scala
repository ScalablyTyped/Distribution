package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFParentChildBehavior extends js.Object

@JSGlobal("MFiles.MFParentChildBehavior")
@js.native
object MFParentChildBehavior extends js.Object {
  @js.native
  sealed trait IncludeChildValues
    extends mfilesLib.MFilesNs.MFParentChildBehavior
  
  @js.native
  sealed trait IncludeParentValues
    extends mfilesLib.MFilesNs.MFParentChildBehavior
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFParentChildBehavior
  
  /* 1 */ val IncludeChildValues: IncludeChildValues with scala.Double = js.native
  /* 2 */ val IncludeParentValues: IncludeParentValues with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFParentChildBehavior with scala.Double] = js.native
}

