package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFOfflineTransitionResultFlags extends js.Object

@JSGlobal("MFiles.MFOfflineTransitionResultFlags")
@js.native
object MFOfflineTransitionResultFlags extends js.Object {
  @js.native
  sealed trait LoggedOut
    extends mfilesLib.MFilesNs.MFOfflineTransitionResultFlags
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFOfflineTransitionResultFlags
  
  @js.native
  sealed trait StatusChanged
    extends mfilesLib.MFilesNs.MFOfflineTransitionResultFlags
  
  /* 2 */ val LoggedOut: LoggedOut with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val StatusChanged: StatusChanged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFOfflineTransitionResultFlags with scala.Double] = js.native
}

