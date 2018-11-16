package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFViewCategory extends js.Object

@JSGlobal("MFiles.MFViewCategory")
@js.native
object MFViewCategory extends js.Object {
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFViewCategory
  
  @js.native
  sealed trait OfflineFilter
    extends mfilesLib.MFilesNs.MFViewCategory
  
  @js.native
  sealed trait TemporarySearch
    extends mfilesLib.MFilesNs.MFViewCategory
  
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val OfflineFilter: OfflineFilter with scala.Double = js.native
  /* 2 */ val TemporarySearch: TemporarySearch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFViewCategory with scala.Double] = js.native
}

