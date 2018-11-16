package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFBuiltInView extends js.Object

@JSGlobal("MFiles.MFBuiltInView")
@js.native
object MFBuiltInView extends js.Object {
  @js.native
  sealed trait AnyView
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait AssignedToMe
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait BuiltIn
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait ByID
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait CheckedOutToCurrentUser
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait Favorites
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait LatestSearches
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait Offline
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait OfflineCheckedOut
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait OfflineMarkedForOfflineAvailability
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait RecentlyAccessedByMe
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait RecentlyModifiedByMe
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  @js.native
  sealed trait Templates
    extends mfilesLib.MFilesNs.MFBuiltInView
  
  /* -1 */ val AnyView: AnyView with scala.Double = js.native
  /* 9 */ val AssignedToMe: AssignedToMe with scala.Double = js.native
  /* 13 */ val BuiltIn: BuiltIn with scala.Double = js.native
  /* 12 */ val ByID: ByID with scala.Double = js.native
  /* 5 */ val CheckedOutToCurrentUser: CheckedOutToCurrentUser with scala.Double = js.native
  /* 15 */ val Favorites: Favorites with scala.Double = js.native
  /* 11 */ val LatestSearches: LatestSearches with scala.Double = js.native
  /* 6 */ val Offline: Offline with scala.Double = js.native
  /* -9000 */ val OfflineCheckedOut: OfflineCheckedOut with scala.Double = js.native
  /* -9001 */ val OfflineMarkedForOfflineAvailability: OfflineMarkedForOfflineAvailability with scala.Double = js.native
  /* 14 */ val RecentlyAccessedByMe: RecentlyAccessedByMe with scala.Double = js.native
  /* 7 */ val RecentlyModifiedByMe: RecentlyModifiedByMe with scala.Double = js.native
  /* 8 */ val Templates: Templates with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFBuiltInView with scala.Double] = js.native
}

