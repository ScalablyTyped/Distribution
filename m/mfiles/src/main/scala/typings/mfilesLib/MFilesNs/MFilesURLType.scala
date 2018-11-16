package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFilesURLType extends js.Object

@JSGlobal("MFiles.MFilesURLType")
@js.native
object MFilesURLType extends js.Object {
  @js.native
  sealed trait Edit
    extends mfilesLib.MFilesNs.MFilesURLType
  
  @js.native
  sealed trait Open
    extends mfilesLib.MFilesNs.MFilesURLType
  
  @js.native
  sealed trait Show
    extends mfilesLib.MFilesNs.MFilesURLType
  
  @js.native
  sealed trait ShowMetadata
    extends mfilesLib.MFilesNs.MFilesURLType
  
  @js.native
  sealed trait View
    extends mfilesLib.MFilesNs.MFilesURLType
  
  /* 3 */ val Edit: Edit with scala.Double = js.native
  /* 1 */ val Open: Open with scala.Double = js.native
  /* 0 */ val Show: Show with scala.Double = js.native
  /* 6 */ val ShowMetadata: ShowMetadata with scala.Double = js.native
  /* 2 */ val View: View with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFilesURLType with scala.Double] = js.native
}

