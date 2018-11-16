package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFolderListingColumnFlags extends js.Object

@JSGlobal("MFiles.MFFolderListingColumnFlags")
@js.native
object MFFolderListingColumnFlags extends js.Object {
  @js.native
  sealed trait HideColumnText
    extends mfilesLib.MFilesNs.MFFolderListingColumnFlags
  
  @js.native
  sealed trait SelectIfLeftOfSelectedMainColumn
    extends mfilesLib.MFilesNs.MFFolderListingColumnFlags
  
  /* 2 */ val HideColumnText: HideColumnText with scala.Double = js.native
  /* 1 */ val SelectIfLeftOfSelectedMainColumn: SelectIfLeftOfSelectedMainColumn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFolderListingColumnFlags with scala.Double] = js.native
}

