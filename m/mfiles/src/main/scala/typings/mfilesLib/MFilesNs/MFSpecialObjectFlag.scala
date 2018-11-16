package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFSpecialObjectFlag extends js.Object

@JSGlobal("MFiles.MFSpecialObjectFlag")
@js.native
object MFSpecialObjectFlag extends js.Object {
  @js.native
  sealed trait Conflict
    extends mfilesLib.MFilesNs.MFSpecialObjectFlag
  
  @js.native
  sealed trait Deleted
    extends mfilesLib.MFilesNs.MFSpecialObjectFlag
  
  @js.native
  sealed trait HasSharedFiles
    extends mfilesLib.MFilesNs.MFSpecialObjectFlag
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFSpecialObjectFlag
  
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFSpecialObjectFlag
  
  @js.native
  sealed trait RecentlyAccessedByValid
    extends mfilesLib.MFilesNs.MFSpecialObjectFlag
  
  @js.native
  sealed trait Shortcut
    extends mfilesLib.MFilesNs.MFSpecialObjectFlag
  
  /* 16 */ val Conflict: Conflict with scala.Double = js.native
  /* 2 */ val Deleted: Deleted with scala.Double = js.native
  /* 8 */ val HasSharedFiles: HasSharedFiles with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 64 */ val Normal: Normal with scala.Double = js.native
  /* 4 */ val RecentlyAccessedByValid: RecentlyAccessedByValid with scala.Double = js.native
  /* 1 */ val Shortcut: Shortcut with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFSpecialObjectFlag with scala.Double] = js.native
}

