package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFOnlineTransitionResultFlags extends js.Object

@JSGlobal("MFiles.MFOnlineTransitionResultFlags")
@js.native
object MFOnlineTransitionResultFlags extends js.Object {
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFOnlineTransitionResultFlags
  
  @js.native
  sealed trait StatusChanged
    extends mfilesLib.MFilesNs.MFOnlineTransitionResultFlags
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val StatusChanged: StatusChanged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFOnlineTransitionResultFlags with scala.Double] = js.native
}

