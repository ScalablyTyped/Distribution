package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFolderListingItemGroupingMode extends js.Object

@JSGlobal("MFiles.MFFolderListingItemGroupingMode")
@js.native
object MFFolderListingItemGroupingMode extends js.Object {
  @js.native
  sealed trait GroupObjectsByObjectType
    extends mfilesLib.MFilesNs.MFFolderListingItemGroupingMode
  
  @js.native
  sealed trait GroupViewsAndFoldersByType
    extends mfilesLib.MFilesNs.MFFolderListingItemGroupingMode
  
  @js.native
  sealed trait NoGrouping
    extends mfilesLib.MFilesNs.MFFolderListingItemGroupingMode
  
  @js.native
  sealed trait Unspecified
    extends mfilesLib.MFilesNs.MFFolderListingItemGroupingMode
  
  /* 1 */ val GroupObjectsByObjectType: GroupObjectsByObjectType with scala.Double = js.native
  /* 1024 */ val GroupViewsAndFoldersByType: GroupViewsAndFoldersByType with scala.Double = js.native
  /* 0 */ val NoGrouping: NoGrouping with scala.Double = js.native
  /* -1 */ val Unspecified: Unspecified with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFolderListingItemGroupingMode with scala.Double] = js.native
}

