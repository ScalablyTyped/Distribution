package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFObjectWindowMode extends js.Object

@JSGlobal("MFiles.MFObjectWindowMode")
@js.native
object MFObjectWindowMode extends js.Object {
  @js.native
  sealed trait Edit
    extends mfilesLib.MFilesNs.MFObjectWindowMode
  
  @js.native
  sealed trait EditApplicationModal
    extends mfilesLib.MFilesNs.MFObjectWindowMode
  
  @js.native
  sealed trait Insert
    extends mfilesLib.MFilesNs.MFObjectWindowMode
  
  @js.native
  sealed trait InsertSaveAsType
    extends mfilesLib.MFilesNs.MFObjectWindowMode
  
  @js.native
  sealed trait InsertSourceFiles
    extends mfilesLib.MFilesNs.MFObjectWindowMode
  
  /* 3 */ val Edit: Edit with scala.Double = js.native
  /* 4 */ val EditApplicationModal: EditApplicationModal with scala.Double = js.native
  /* 0 */ val Insert: Insert with scala.Double = js.native
  /* 2 */ val InsertSaveAsType: InsertSaveAsType with scala.Double = js.native
  /* 1 */ val InsertSourceFiles: InsertSourceFiles with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFObjectWindowMode with scala.Double] = js.native
}

