package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFValueListSortingType extends js.Object

@JSGlobal("MFiles.MFValueListSortingType")
@js.native
object MFValueListSortingType extends js.Object {
  @js.native
  sealed trait ExtID
    extends mfilesLib.MFilesNs.MFValueListSortingType
  
  @js.native
  sealed trait Name
    extends mfilesLib.MFilesNs.MFValueListSortingType
  
  /* 1 */ val ExtID: ExtID with scala.Double = js.native
  /* 0 */ val Name: Name with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFValueListSortingType with scala.Double] = js.native
}

