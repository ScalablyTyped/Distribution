package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFUpdateType extends js.Object

@JSGlobal("MFiles.MFUpdateType")
@js.native
object MFUpdateType extends js.Object {
  @js.native
  sealed trait ClientAuto
    extends mfilesLib.MFilesNs.MFUpdateType
  
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFUpdateType
  
  @js.native
  sealed trait ServerAuto
    extends mfilesLib.MFilesNs.MFUpdateType
  
  /* 2 */ val ClientAuto: ClientAuto with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val ServerAuto: ServerAuto with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFUpdateType with scala.Double] = js.native
}

