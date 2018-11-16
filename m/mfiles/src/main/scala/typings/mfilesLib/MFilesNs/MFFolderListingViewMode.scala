package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFolderListingViewMode extends js.Object

@JSGlobal("MFiles.MFFolderListingViewMode")
@js.native
object MFFolderListingViewMode extends js.Object {
  @js.native
  sealed trait Content
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  @js.native
  sealed trait Details
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  @js.native
  sealed trait Icon
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  @js.native
  sealed trait List
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  @js.native
  sealed trait SmallIcon
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  @js.native
  sealed trait Thumbnail
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  @js.native
  sealed trait Thumbstrip
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  @js.native
  sealed trait Tile
    extends mfilesLib.MFilesNs.MFFolderListingViewMode
  
  /* 8 */ val Content: Content with scala.Double = js.native
  /* 4 */ val Details: Details with scala.Double = js.native
  /* 1 */ val Icon: Icon with scala.Double = js.native
  /* 3 */ val List: List with scala.Double = js.native
  /* 2 */ val SmallIcon: SmallIcon with scala.Double = js.native
  /* 5 */ val Thumbnail: Thumbnail with scala.Double = js.native
  /* 7 */ val Thumbstrip: Thumbstrip with scala.Double = js.native
  /* 6 */ val Tile: Tile with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFolderListingViewMode with scala.Double] = js.native
}

