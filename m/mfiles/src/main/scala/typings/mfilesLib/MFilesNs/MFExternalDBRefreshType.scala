package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFExternalDBRefreshType extends js.Object

@JSGlobal("MFiles.MFExternalDBRefreshType")
@js.native
object MFExternalDBRefreshType extends js.Object {
  @js.native
  sealed trait Full
    extends mfilesLib.MFilesNs.MFExternalDBRefreshType
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFExternalDBRefreshType
  
  @js.native
  sealed trait Quick
    extends mfilesLib.MFilesNs.MFExternalDBRefreshType
  
  /* 2 */ val Full: Full with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Quick: Quick with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFExternalDBRefreshType with scala.Double] = js.native
}

