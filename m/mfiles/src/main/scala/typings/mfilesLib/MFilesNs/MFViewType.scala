package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFViewType extends js.Object

@JSGlobal("MFiles.MFViewType")
@js.native
object MFViewType extends js.Object {
  @js.native
  sealed trait FilterOnly
    extends mfilesLib.MFilesNs.MFViewType
  
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFViewType
  
  /* 1 */ val FilterOnly: FilterOnly with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFViewType with scala.Double] = js.native
}

