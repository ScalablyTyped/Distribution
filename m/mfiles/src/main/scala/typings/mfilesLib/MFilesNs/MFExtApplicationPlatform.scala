package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFExtApplicationPlatform extends js.Object

@JSGlobal("MFiles.MFExtApplicationPlatform")
@js.native
object MFExtApplicationPlatform extends js.Object {
  @js.native
  sealed trait Desktop
    extends mfilesLib.MFilesNs.MFExtApplicationPlatform
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFExtApplicationPlatform
  
  @js.native
  sealed trait Web
    extends mfilesLib.MFilesNs.MFExtApplicationPlatform
  
  /* 1 */ val Desktop: Desktop with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Web: Web with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFExtApplicationPlatform with scala.Double] = js.native
}

